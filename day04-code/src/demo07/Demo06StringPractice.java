package demo07;

import java.lang.reflect.Array;

public class Demo06StringPractice {
    public static void main(String[] args) {
        int[] list = {1, 2, 3};
        String result = listToString(list);
        System.out.println(result);
    }

    public static String listToString(int[] array){
       String str = "[";
        for (int i = 0; i < array.length; i++) {
            if(i == array.length - 1){
                str += "word" + array[i] + "]";
            }
            else{
                str += "word" + array[i] + "#";
            }

        }
        return str;
    }
}
