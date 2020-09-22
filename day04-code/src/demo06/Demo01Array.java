package demo06;

//用数组存储3个Person对象
public class Demo01Array {
    public static void main(String[] args) {
        Person[] array = new Person[3];
        Person one = new Person("迪丽热巴", 18);
        Person two = new Person("古力娜扎", 19);
        Person three = new Person("马儿扎哈", 20);
        array[0] = one;
        array[1] = two;
        array[2] = three;
        System.out.println(array[0].getName()+ array[0].getAge());
    }
}
