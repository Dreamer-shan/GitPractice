package demo03;

/*
当方法的局部变量和类的成员变量重名的时候，根据就近原则，优先使用局部变量
如果需要访问本来中的成员变量，需要使用格式
this.成员变量名

通过谁调用的方法，谁就是this
*/
public class Person {
        String name;

//        public void sayHello(String who){
//            System.out.println(who + "你好，我是" + name);
//        }
        public void sayHello(String name){
            System.out.println(name + "你好，我是" + this.name); //this.name相当于person.name
            System.out.println(this);  //this的地址
        }
}
