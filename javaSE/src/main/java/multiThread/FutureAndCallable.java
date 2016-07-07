package multiThread;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * Created by haoranchen on 16-7-7.
 */
public class FutureAndCallable {
        public static void main(String[] args) {
            Callable<Integer> callable = new Callable<Integer>() {
                public Integer call() throws Exception {
                    return new Random().nextInt(100);
                }
            };
            FutureTask<Integer> future = new FutureTask<Integer>(callable);
            new Thread(future).start();
            try {
                System.out.println("first");
                Thread.sleep(5000);
                System.out.println("second");
                System.out.println(future.get());
                System.out.println("third");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }
}

