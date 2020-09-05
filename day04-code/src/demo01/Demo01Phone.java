package demo01;

public class Demo01Phone {
    public static void main(String[] args) {
        Phone one = new Phone();
        one.brand = "小米";
        one.price = 8000;
        one.color = "黑色";
        one.call("雄小米");
        one.sendMessage("苹果");
        System.out.println(one.brand);
        System.out.println(one.price);
        System.out.println(one.color);
    }
}
