package demo05;

import java.util.Random;
import java.util.Scanner;
//猜数字游戏
public class Demo04Game {
    public static void main(String[] args) {
        Random r = new Random();
        int randomNumber = r.nextInt(100) + 1;
        Scanner sc = new Scanner(System.in);
        System.out.println(randomNumber);

        while (true){
            System.out.println("输入猜测数字");
            int guessNum = sc.nextInt();
            if(guessNum > randomNumber){
                System.out.println("太大了");
            }
            else if(guessNum < randomNumber){
                System.out.println("太小了");
            }
            else {
                System.out.println("猜中了");
                break;
            }
        }


    }
}
