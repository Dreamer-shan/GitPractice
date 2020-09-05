package demo01Funciton;

import javax.swing.plaf.SpinnerUI;
import java.util.function.Predicate;

public class demo01Predicate {
    public static void main(String[] args) {
        String s1 = "aasd";
        boolean b = check(s1, (String str) -> {
            return str.length() > 5 ;
        });
        System.out.println(b);
    }

    public static boolean check(String s, Predicate<String> pre){
        return pre.test(s);
    }


}
