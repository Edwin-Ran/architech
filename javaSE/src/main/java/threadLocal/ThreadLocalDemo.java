package threadLocal;

/**
 * Created by haoranchen on 16-3-2.
 * haoranchen@sohu-inc.com
 */
public class ThreadLocalDemo {
    private ThreadLocal tl = new ThreadLocal<String>();
    public ThreadLocalDemo(String text) {
        tl.set(text);
    }

    public void get() {
        System.out.println(tl.get());
    }

    public static void main(String[] args) {
        ThreadLocalDemo tld = new ThreadLocalDemo("Hello World!");
        tld.get();
    }
}
