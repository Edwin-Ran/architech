package threadLocal;

/**
 * Created by haoranchen on 16-3-2.
 * haoranchen@sohu-inc.com
 */
public class ShareVariableDemo implements Runnable {

    private ThreadLocal<Integer> threadLocal = new ThreadLocal<Integer>() {
        @Override
        protected Integer initialValue() {
            return 1;
        }
    };

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getId() + " before : " + threadLocal.get());

        threadLocal.set((int) (Math.random() * 100D));

        try {
            Thread.sleep(2000);
        } catch (Exception e) {

        }

        System.out.println(Thread.currentThread().getId() + " after : " + threadLocal.get());
    }

    public static void main(String[] args) throws Exception {
        ShareVariableDemo sharedRunnableInstance = new ShareVariableDemo();

        Thread thread1 = new Thread(sharedRunnableInstance);
        Thread thread2 = new Thread(sharedRunnableInstance);

        thread1.start();
        thread2.start();

/*        thread1.join();
        thread2.join();*/
    }
}
