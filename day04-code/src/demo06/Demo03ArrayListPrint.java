package demo06;

import java.util.ArrayList;

public class Demo03ArrayListPrint {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("刘某");
        list.add("张某");
        list.add("马某");
        list.add("敬某");
        printArray(list);
    }
    public static void printArray(ArrayList<String> list){
        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
            String name = list.get(i);
            if(i == list.size() - 1){
                System.out.print(name + "}");
            }
            else{
                System.out.print(name + "@");
            }
        }
    }
}
