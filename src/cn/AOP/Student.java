package cn.AOP;

public class Student {
    private Integer age;
    private String name;
    public void setAge(Integer age) {
        this.age = age;
        System.out.println("setAge:"+age);
    }
    public Integer getAge() {
        System.out.println("Age : " + age );
        return age;
    }
    public void setName(String name) {
        this.name = name;
        System.out.println("setName:"+name);
    }
    public String getName() {
        System.out.println("Name : " + name );
        return name;
    }
    public void printThrowException(){
        System.out.println("Exception raised");
        throw new IllegalArgumentException();
    }
}
