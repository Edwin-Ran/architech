package introspection;

/**
 * Created by haoranchen on 2016/1/27.
 */
public class JavaBean {
    private int a;
    private String b;

    public JavaBean(int a,String b) {
        this.a = a;
        this.b = b;
    }


    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }
}
