package demo07;

//public int length():获取字符串当中含有是字符个数，拿到字符串长度

public class Demo04StringGet {
    public static void main(String[] args) {
        int length = "dsakjhhg".length();
        System.out.println("字符串长度是：" + length);

        String str1 = "Hello";
        String str2 = "world";
        String str3 = str1.concat(str2);
        System.out.println(str3);
        System.out.println("======================");

        //返回单个字符的索引
        char ch = "Hello".charAt(1);
        System.out.println(ch);

        //查找字符串第一次出现的位置
        //如果没有，返回-1
        String str4 = "Helloworld";
        int index_1 = str4.indexOf("llo"); // 2
        int index_2 = str4.indexOf("q"); // 2
        System.out.println(index_1);
    }
}
