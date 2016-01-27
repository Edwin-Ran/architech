/**
 * Created by haoranchen on 2016/1/21.
 *  对于方法中的入参，都是传递一份copy
 *
 *  “java程序设计语言总是采用值调用。也就是说，方法得到的是所有参数值的一个拷贝，特别是，方法不能修改传递给它的任何参数变量的内容。
 */
public class Propagation {
    //int a = 0;

    public void changeInt(int a) {
        a = 1;
        System.out.println("in:" + a);
    }

    public static void main(String[] args) {
        int a = 0;
        Propagation propagation = new Propagation();
        System.out.println("before:" + a);
        propagation.changeInt(a);
        System.out.println("after:" + a);

    }
}
