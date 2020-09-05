package demo01;

public class DemoPhoneParam {
    public static void main(String[] args) {
        Phone one = new Phone();
        one.brand = "三星";
        one.price = 162;
        one.color = "黑色";
        method(one);
    }

    public static void method(Phone param) {
        System.out.println(param.brand);
        System.out.println(param.price);
        System.out.println(param.color);
    }
}
