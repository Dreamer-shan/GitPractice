package demo07;
/*
==是进行对象的地址值比较，如果需要字符串内容比较，可以使用两个方法。
public boolean equals(Object obj):参数可以是任何对象
注意： 推荐 "abc".equals(str)  不推荐 str.equals("abc")
public boolean equalsIgnore(String str) 忽略大小写进行内容比较
 */
public class Demo03String {
    public static void main(String[] args) {
        String str1 = "ABC";
        String str2 = "ABC";
        char[] charArray = {'A','B','C'};
        String str3 = new String(charArray);
        System.out.println(str1.equals(str2));  //true
        System.out.println(str1.equals(str3));  //true
        System.out.println(str1.equals("ABC")); //true

        System.out.println("===============================");

        String str4 = "abc";
        System.out.println("abc".equals(str4)); //推荐写法, true
        System.out.println(str4.equals("abc")); //不推荐, true

        String str5 = null;
//        System.out.println("abc".equals(str5)); //推荐写法, false
//        System.out.println(str5.equals("abc")); //不推荐, 报错，空指针异常NullPointerException
        System.out.println("=================");

        String stra = "abc";
        String strb = "ABC";
        System.out.println(stra.equalsIgnoreCase(strb));


    }
}
