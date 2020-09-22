package demo03;
/*
格式：
public 类名称(参数类型 参数名称){
    方法体
}

注意：
1.构造方法的名称必须和所在的类名称完全一样
2.构造方法不要写返回值类型，连void都不写
3.构造方法不能return一个具体的返回值
4.如果没有编写任何构造方法，编译器会默认赠送一个构造方法，没有参数，方法体什么都事情不做
5.一旦编写了至少一个构造方法，那么编译器将不再赠送
6.构造方法也可以重载
*/
public class Student {
    //成员变量
    private String name;
    private int age;

    //无参数构造方法
    public Student(){
        System.out.println("无参构造方法执行");
    }

    //有参数构造方法
    public Student(String name, int age){
        System.out.println("有参构造方法执行");
        this.name = name;
        this.age = age;
    }
    //Gettter Setter
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;   //this.name也可以
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
}
