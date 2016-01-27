package introspection;

import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;

/**
 * Created by haoranchen on 2016/1/27.
 */
public class Introspection {
    public static void main(String[] args) {
        JavaBean a = new JavaBean(1,"第一个");
        JavaBean b = new JavaBean(2,"第二个");

        Introspection is = new Introspection();
        System.out.println(is.getAllBean(a));
    }

    public String getAllBean(Object o) {
        StringBuffer strToReturn = new StringBuffer();
        try {
            //当前类
            //PropertyDescriptor[] propDescs = Introspector.getBeanInfo(getClass()).getPropertyDescriptors();

            PropertyDescriptor[] propDescs = Introspector.getBeanInfo(o.getClass()).getPropertyDescriptors();

            for(int i=0;i < propDescs.length;i++) {
                String propName = propDescs[i].getName();
                System.out.println(propName);

                if("class".equals(propName)) {
                    continue;
                }

                //当前类
                //Object val = propDescs[i].getReadMethod().invoke(this,new Object[0]);

                Object val = propDescs[i].getReadMethod().invoke(o,new Object[0]);

                if(val != null && !"".equals(val)) {
                    strToReturn.append(propName).append("_").append(val).append("_");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return strToReturn.toString();
    }
}

