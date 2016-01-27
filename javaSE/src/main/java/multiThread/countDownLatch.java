package multiThread;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by haoranchen on 2016/1/27.
 * 一个CountDouwnLatch实例是不能重复使用的，也就是说它是一次性的，锁一经被打开就不能再关闭使用了
 * ，如果想重复使用，请考虑使用CyclicBarrier。
 *
 * 模拟了100米赛跑，10名选手已经准备就绪，只等裁判一声令下。当所有人都到达终点时，比赛结束。
 */

public class countDownLatch {
    public static void main(String[] args) throws InterruptedException {
        //开始的倒数锁
        final CountDownLatch beginCountDownLatch = new CountDownLatch(1);

        //结束的倒数锁
        final CountDownLatch endCountDownLatch = new CountDownLatch(10);

        //十名选手，使用线程池
        final ExecutorService exec = Executors.newFixedThreadPool(10);

        for(int i=1;i<=10;i++) {
            final int no = i;
            Runnable run = new Runnable() {
                public void run() {
                    try {
                        //如果计数为零，则此方法立即返回
                        //等待
                        beginCountDownLatch.await();
                        Thread.sleep((long) (Math.random()*10000));

                        System.out.println("No." + no + " arrived!");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } finally {
                        //每个选手到达重点时，endCountDownLatch就减一
                        endCountDownLatch.countDown();
                    }
                }
            };

            //注册跑步者
            exec.submit(run);
        }

        System.out.println("Game Start");
        //beginCountDownLatch减一，开始跑步
        beginCountDownLatch.countDown();

        //等待endCountDownLatch变为零，即所有选手到达终点
        endCountDownLatch.await();
        System.out.println("Game Over");

        exec.shutdown();
    }
}
