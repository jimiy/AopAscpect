package cn.jimiy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {

        //多数用高级的ApplicationContext
//        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
//        HelloWorld objA = (HelloWorld) context.getBean("helloWorld");
//        objA.setMessage("I'm object A");
//        objA.setName("jimiy");
//        objA.getMessage();
//        objA.getName();
//        HelloWorld objB = (HelloWorld) context.getBean("helloWorld");
//        objB.getMessage();
//        objB.getName();

//        AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
//        HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
//        obj.getMessage();
//        context.registerShutdownHook();

        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

        HelloWorld objA = (HelloWorld) context.getBean("helloWorld1");

        objA.getMessage1();
        objA.getMessage2();

        HelloIndia objB = (HelloIndia) context.getBean("helloIndia");
        objB.getMessage1();
        objB.getMessage2();
        objB.getMessage3();


        //已经被淘汰了
//        XmlBeanFactory factory=new XmlBeanFactory(new ClassPathResource("Beans.xml"));
//        HelloWorld obj=(HelloWorld)factory.getBean("helloWorld");
//        obj.getMessage();
    }
}
