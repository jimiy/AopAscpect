package cn.AOP;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("aspect.xml");
        Student student = (Student) context.getBean("student");
        student.getName();
        student.getAge();
        student.setName("1111");
      //  student.printThrowException();
    }
}