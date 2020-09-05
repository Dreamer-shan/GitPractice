package demo05;

import java.util.Random;
import java.util.Scanner;

public class Demo01Random {
    public static void main(String[] args) {

        Scanner n = new Scanner(System.in);
        Random r = new Random(n.nextInt());

//        System.out.println("随机数是" + num);
        for (int i = 0; i < 10 ; i++) {
//            int num = r.nextInt();
            int num = r.nextInt(n.nextInt());
            System.out.println(num);
        }
    }

}
