package demo06;

import java.util.ArrayList;
import java.util.Random;

/*
筛选大集合中的偶数，放入小集合中
思路：创建两个集合，随机数用到Random，放到大集合中，写一个函数，筛选出小集合，返回值为小集合。
*/
public class Demo04ArraylistReturn {
    public static void main(String[] args) {
        ArrayList<Integer> biglist = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 20; i++) {
            int num = r.nextInt(100) + 1;  // 1~100
            biglist.add(num);
        }
        ArrayList<Integer> smalllist = getSmalllist(biglist);
        System.out.println("偶数个数为:" + smalllist.size());
        for (int i = 0; i < smalllist.size(); i++) {
            System.out.print(smalllist.get(i) + " ");
        }
    }
    public static ArrayList<Integer> getSmalllist(ArrayList<Integer> biglist){
        ArrayList<Integer> smalllist = new ArrayList<>();
        for (int i = 0; i < biglist.size(); i++) {
            int num = biglist.get(i);
            if(num % 2 == 0){
                smalllist.add(num);
            }
        }
        return smalllist;
    }
}
