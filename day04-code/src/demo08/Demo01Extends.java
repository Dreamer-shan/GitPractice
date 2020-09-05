package demo08;

/*
在父子类的继承关系中，如果成员变量重名，则创建子类对象时，访问有两种方式

直接通过子类对象访问成员变量：
    等号左边是谁，就优先用谁，没有则向上找
   简介通过成员方法访问成员变量
 */
public class Demo01Extends {
    public static void main(String[] args) {
        Fu fu = new Fu();
        System.out.println(fu.numFu);       //只能使用父类的东西，没有任何子类内容
        System.out.println("==============");
        Zi zi = new Zi();
        System.out.println(zi.numZi);   //20
        System.out.println(zi.numFu);   //10
        System.out.println("============");
        // 等号左边是谁，就优先用谁
        System.out.println(zi.num);     //优先子类，100
//        System.out.println(zi.abc);     //到处都没有，编译报错
        System.out.println();
    }
}
