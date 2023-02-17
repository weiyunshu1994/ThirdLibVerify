package junit;


public class HelloWorld {
    public String sayHello()
    {
        return "您好，欢迎访问 pan_junbiao的博客";
    }

    public static void main(String[] args) {
        System.out.println(new HelloWorld().sayHello());
    }



}