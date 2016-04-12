package classload;

/**
 * Created by haoranchen on 16-4-12.
 * haoranchen@sohu-inc.com
 */
public class SubSuper {
    public static void main(String[] args) {
        System.out.print(Sub.value);
    }
}

class Super {
    static {
        System.out.println("Super Class Init!");
    }

    public static int value = 123;
}

class Sub extends Super {
    static {
        System.out.println("Sub Class Init!");
    }
}
