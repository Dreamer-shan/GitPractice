package demo02;

public class Demo02Student {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.setName("撒旦");
        stu.setAge(12);
        stu.setMale(true);

        System.out.println("姓名：" + stu.getName());
        System.out.println("年龄：" + stu.getAge());
        System.out.println("是不是男的：" + stu.isMale());
    }
}
