package demo07;

public class Demo05Substring {
    public static void main(String[] args) {
        String str1 = "helloworld";
        String str2 = str1.substring(5);
        System.out.println(str1);   // helloworld
        System.out.println(str2);   // world
        String str3 = str1.substring(4, 7); //owo
        System.out.println(str3);
    }
}
