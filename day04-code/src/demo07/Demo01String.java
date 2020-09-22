package demo07;

/*字符串内容不可改变
三种构造方法：
public String():创建一个空白字符串，不含任何内容
public String(char[] array):根据字符数组的内容来创建对应的字符串
public String(byte[] array):根据字节数组的内容来创建对应的字符串
一种直接创建方法：
String str = "hello";
*/

public class Demo01String {

    public static void main(String[] args) {
        //空参构造
        String str1 = new String();
        System.out.println("第一个字符串" + str1);

        //根据字符数组创建
        char[] charArray = {'A','B','C'};
        String str2 = new String(charArray);
        System.out.println("第二个字符串" + str2);

        //根据字节数组创建
        byte[] byteArray = {97, 98, 99};
        String str3 = new String(byteArray);
        System.out.println("第三个字符串" + str3);

        //直接创建
        String str4 = "Hello";
        System.out.println("第四个字符串" + str4);
    }
}
