package cn.Annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class MainApp {
    public static void main(String[] args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext("Annotation.xml");
//        Student student = (Student) context.getBean("student");
//        System.out.println("Name : " + student.getName() );
//        System.out.println("Age : " + student.getAge() );

        ApplicationContext context = new ClassPathXmlApplicationContext("AuWired.xml");
        TextEditor te = (TextEditor) context.getBean("textEditor");
        te.spellCheck();
    }
}