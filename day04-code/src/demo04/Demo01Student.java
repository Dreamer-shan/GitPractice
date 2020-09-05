package demo04;

public class Demo01Student {
    public static void main(String[] args) {
        Student stu1 = new Student();
        stu1.setName("鹿晗");
        stu1.setAge(22);
        System.out.println("姓名：" + stu1.getName() + "年龄:" + stu1.getAge());
        Student stu2 = new Student("迪丽热巴",21);
        stu2.setAge(30);
        System.out.println("姓名：" + stu2.getName() + "年龄:" + stu2.getAge());

    }
}
