package Demo01Stream;

import java.util.ArrayList;
import java.util.List;
/*
    数组筛选
 */
public class demo01Stream {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("赵武");
        list.add("张三丰");
        list.add("三疯");
        list.add("张无忌2");

        // 定义接收数组
//        List<String> list1 = new ArrayList<>();
//        for (String s : list) {
//            if (s.startsWith("张")){
//                list1.add(s);
//            }
//        }
        // 定义接收数组
//        List<String> list2 = new ArrayList<>();
//        for (String s : list1) {
//            if (s.length() == 3){
//                list2.add(s);
//            }`
//        }`
//        System.out.println(list2);

        // 转成stream流再筛选
//        list.stream()
                    // filter的参数是Predicate函数式接口，所以可以使用Lamda表达式
//                .filter((String name) -> {return name.startsWith("张");})
//                .filter((String name) -> {return name.length() == 3;})
//                .forEach((String name) -> {
//                    System.out.println(name);
//                });


        //Lamda表达式简化
                list.stream()
                .filter(name -> name.startsWith("张"))
                .filter(name -> name.length() == 3)
                .forEach(name -> System.out.println(name));
    }
}
