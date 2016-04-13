package IteratorVSEnumration;

import java.util.Iterator;
import java.util.Vector;

/**
 * Created by haoranchen on 16-4-13.
 * haoranchen@sohu-inc.com
 */
public class ForeachDelete {
    public static void main(String[] args) {
        Vector<String> v = new Vector<>();
        v.add("Amit");
        v.add("B");
        v.add("C");
        v.add("D");
        v.add("E");
        v.add("F");

        Iterator<String> it = v.iterator();

        System.out.println(v.size());
        while(it.hasNext()) {
            String value = it.next();
            System.out.println(value);
            //v.remove(value);
            it.remove();
        }

        System.out.println(v.size());
    }
}
