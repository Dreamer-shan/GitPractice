package demo07;
/*
public char[] toCharArray():将字符串拆分成为字符数组作为返回值
public char[] getBytes():获得当前字符串底层的字节数组
public String[] split(), 按照参数规则，将字符串切分成为若干部分
注意:split方法的参数其实是一个正则表达式，如果按照"."切分，一定要写成"\\."
 */


public class Demo06Convert {
    public static void main(String[] args) {
        char[] chars = "Hello".toCharArray();
        System.out.println(chars[0]);
        System.out.println(chars.length);
        System.out.println("============");

        byte[] bytes = "abc".getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }
        System.out.println("==========");

        String str1 = "How are you do";
        String str2 = str1.replace('o', '*');
        System.out.println(str1);
        System.out.println(str2);

        String str3 = "aaa,bbb,ccc";
        String[] strArray = str3.split(",");
        for (int i = 0; i < strArray.length; i++) {
            System.out.println(strArray[i]);
        }
        System.out.println("=================");

//        String str4 = "aaa.bbb.ccc";
//        String[] strArray_2 = str4.split(".");
//        System.out.println(strArray_2.length);      // 0 后面的循环不执行 说明切割失败
//        for (int i = 0; i < strArray_2.length; i++) {
//            System.out.print(strArray_2[i]);
//        }
        String str4 = "aaa.bbb.ccc";
        String[] strArray_2 = str4.split("\\.");
        System.out.println(strArray_2.length);      // 0 后面的循环不执行 说明切割失败
        for (int i = 0; i < strArray_2.length; i++) {
            System.out.print(strArray_2[i]);
        }
    }
}
