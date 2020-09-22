package demo01Funciton;

import java.util.ArrayList;
import java.util.function.Predicate;
/*
    从数组中     筛选名字为4个字母且女性
 */
public class demo02Predicate {
    public static void main(String[] args) {
        String[] arr = {"shan,女", "hong,男", "yuan,女"};
        ArrayList<String> arrayList = filter(arr, (String s) -> {
            return s.split(",")[1].equals("女");
        }, (String s) -> {
            return s.split(",")[0].length() == 4;
        });
        for (String s : arrayList) {
            System.out.println(s);
        }
    };
    public static ArrayList<String> filter(String[] arr, Predicate<String> pre1, Predicate<String> pre2){
        // 定义接收数组
        ArrayList<String> list = new ArrayList<>();
        for (String s : arr) {
            boolean b =pre1.test(s) && pre2.test(s);
//            boolean b = pre1.and(pre2).test(s);   // 等价
            // 同时满足两个条件
            if (b){
                list.add(s);
            }
        }
        return list;
    }
}
