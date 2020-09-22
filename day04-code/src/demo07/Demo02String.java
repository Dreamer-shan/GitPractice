package demo07;
/*
字符串常量池，程序当中直接写上双引号
 */
public class Demo02String {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "abc";
        char[] charArray = {'a', 'b', 'c'};
        String str3 = new String(charArray);
        System.out.println(str1 == str2); //true
        System.out.println(str1 == str3); //false
        System.out.println(str2 == str3); //false
    }
}
