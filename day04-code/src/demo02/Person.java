package demo02;
/*
问题：定义person类的年龄时，无法祖师不合理的数值被设置进来 如年龄为负数
解决：用private关键字将要保护的成员变量保护起来

一旦使用了private进行修饰，那么本类中仍然可以随意访问
但是！超出了本来范围之外就不能再直接访问了

必须叫setXxx或者是getXxx命名规则。
对于Getter来说，不能有参数，返回值类型和成员变量对应
对于Setter来说，不能有返回值，参数类型和成员变量对应
*/
public class Person {
    String name;
    private int age;
    public void show(){
        System.out.println("我的名字" + name + ",年龄：" + age);
    }
//    专门用于向age设置数据
    public void setAge(int num){
        if(num < 100 && num >= 0){
            age = num;
        }
        else{
            System.out.println("数据不合理");
        }
    }
    public int getAge(){
        return age;
    }
}
