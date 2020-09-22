package Red;

public class RedPacketFrame {
    public static void main(String[] args) {
        Person p1 = new Person("shan",18);
        Person p2 = new Person("hongyuan",20);
        boolean b = p1.equals(p2);
        System.out.println(b);
    }

}
