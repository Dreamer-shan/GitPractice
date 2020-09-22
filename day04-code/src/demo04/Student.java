package demo04;

/*
一个标准类通常由四部分
1.所有成员变量使用private关键字修饰
2.每一个成员变量编写一对Getter/Setter
3.编写一个无参数的构造方法
4.编写一个全参数的构造方法
自动补全 Alt+Insert  或者Code—>Generate
*/
public class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
