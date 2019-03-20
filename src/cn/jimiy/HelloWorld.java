package cn.jimiy;

public class HelloWorld {


    public String getMessage() {
        System.out.println("Message:"+message);
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    private String message;

    public String getName() {
        System.out.println("name："+name);
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void init(){
        System.out.println("Bean is going through init.");
    }
    public void destroy(){
        System.out.println("Bean will destroy now.");
    }
    private String name;


    private String message1;
    private String message2;
    public void setMessage1(String message){
        this.message1  = message;
    }
    public void setMessage2(String message){
        this.message2  = message;
    }
    public void getMessage1(){
        System.out.println("World Message1 : " + message1);
    }
    public void getMessage2(){
        System.out.println("World Message2 : " + message2);
    }
}
