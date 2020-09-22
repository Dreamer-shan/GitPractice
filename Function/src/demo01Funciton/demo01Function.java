package demo01Funciton;

import java.util.function.Function;

/*
    根据一个类型的数据得到另一个类型的数据(类型转换)
 */
public class demo01Function {
    public static void main(String[] args) {
        String s ="1324";
        change(s, (String str)->{
            return  Integer.parseInt(str);
        });
    }

    public static void change(String s, Function<String, Integer> fun){
        Integer apply = fun.apply(s);
        System.out.println(apply);

    }
}
