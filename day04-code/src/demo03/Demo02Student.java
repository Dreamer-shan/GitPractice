package demo03;

public class Demo02Student {
    public static void main(String[] args) {
        Student stu1 = new Student();
        System.out.println("=============");
        Student stu2 = new Student("shan", 22);
        System.out.println("姓名:" + stu2.getName() + "年龄" + stu2.getAge());
    }
}
