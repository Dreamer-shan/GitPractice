package demo05;

import javax.swing.*;
import java.util.Scanner;

public class Demo01ScannerMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(max(max(a, b), c));
    }
    public static int max(int a, int b){
        return a > b ? a : b;
    }

}


