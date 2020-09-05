package demo06;



import java.util.ArrayList;

//泛型只能是引用类型，不能是基本类型
public class Demo01ArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);

        list.add("赵丽颖");
        System.out.println(list);
        list.add("赵丽颖");
        System.out.println(list);
        list.add("赵丽颖");
        System.out.println(list);
//        list.add(100)   错误写法，只能写入String类型
    }

}
