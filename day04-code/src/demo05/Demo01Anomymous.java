package demo05;
/*
匿名对象就是只有右边的对象，没有左边的名字和赋值运算符
new 类名称();
使用建议，如果确定一个对象只需要使用唯一的一次，就就可以用匿名对象
*/
public class Demo01Anomymous {
    public static void main(String[] args) {
        Person one = new Person();
        one.name = "高圆圆"; //我叫高圆圆
        one.showName();
        System.out.println("==========");

        //匿名对象
        new Person().name = "赵又廷";
        new Person().showName();    //我叫null
    }
}
