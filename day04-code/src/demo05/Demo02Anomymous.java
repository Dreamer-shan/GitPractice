package demo05;

import java.util.Scanner;

public class Demo02Anomymous {
    public static void main(String[] args) {
        //普通方式
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        System.out.println("输入的是：" + num);

        //匿名对象方式
//        int num = new Scanner(System.in).nextInt();
//        System.out.println("输入的是" + num);

        //一般方法传参
//        Scanner sc = new Scanner(System.in);
//        methodParam(sc);

        //使用匿名对象传参
//        methodParam(new Scanner(System.in));
        Scanner sc = methodReturn();
        int num = sc.nextInt();
        System.out.println("输入的是是：" + num);
    }

//    public static void methodParam(Scanner sc){
//        int i = sc.nextInt();
//        System.out.println("输入的是:" + i);
//    }

    //返回匿名对象
    public static Scanner methodReturn(){
//        Scanner sc = new Scanner(System.in);
//        return sc;
        return new Scanner(System.in);
    }
}
