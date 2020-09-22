package demo01;

public class Demo01PhoneTwo {
    public static void main(String[] args) {
        Phone one = new Phone();
        one.brand = "三星";
        one.price = 1000;
        one.color = "蓝色";
        one.call("苹果");
        one.sendMessage("韩国");
        System.out.println(one.brand);
        System.out.println(one.price);
        System.out.println(one.color);
    }
}
