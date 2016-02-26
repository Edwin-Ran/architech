package ioc.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by haoranchen on 16-2-26.
 * haoranchen@sohu-inc.com
 */
public class ApplicationContextDemo {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        MessagePrinter printer = (MessagePrinter) context.getBean("messagePrinter");
        printer.printMessage();
    }
}
