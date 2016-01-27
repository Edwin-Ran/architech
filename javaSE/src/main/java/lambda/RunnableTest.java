package lambda;

/**
 * Created by haoranchen on 2016/1/27.
 */
public class RunnableTest {
    public static void main(String[] args) {
        //匿名内部类
        Runnable r1 = new Runnable() {
            public void run() {
                System.out.println("Hello World One!");
            }
        };

        //lambda表达式
        Runnable r2 = () -> System.out.println("Hello World Two!");

        //run em
        r1.run();
        r2.run();
    }
}
