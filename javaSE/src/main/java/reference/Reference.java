package reference;

/**
 * Created by haoranchen on 16-4-14.
 * haoranchen@sohu-inc.com
 */
public class Reference {
    public static void methodA(String a) {
        a = new String("new String");
    }

    public static void methodB(StringBuilder sb) {
        sb = new StringBuilder("new StringBuilder");
    }

    public static void main(String[] args) {
        String a = "String";
        StringBuilder sb = new StringBuilder("StringBuilder");

        methodA(a);
        methodB(sb);

        System.out.println(a);
        System.out.println(sb);
    }
}
