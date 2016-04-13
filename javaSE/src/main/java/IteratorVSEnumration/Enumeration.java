package IteratorVSEnumration;

import java.util.Vector;

/**
 * Created by haoranchen on 16-4-13.
 * haoranchen@sohu-inc.com
 */
public class Enumeration {
    public static void main(String[] args) {
        Vector<String> v = new Vector<>();
        v.add("Amit");
        v.add("B");
        v.add("C");
        v.add("D");
        v.add("E");
        v.add("F");

        java.util.Enumeration<String> en = v.elements();

        while(en.hasMoreElements()) {
            String value = (String) en.nextElement();
            System.out.println(value);
            v.remove(value);
        }
    }
}
