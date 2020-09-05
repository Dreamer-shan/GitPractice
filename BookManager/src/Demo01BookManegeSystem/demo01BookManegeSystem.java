package Demo01BookManegeSystem;

import java.util.Scanner;

public class demo01BookManegeSystem {
    public static final int SIZE = 10;
    Book[] booklist = new Book[SIZE];
    int count = 0;
    public demo01BookManegeSystem(){
        Scanner sc = new Scanner(System.in);
        printMenu();
        while (true){
            int choise = sc.nextInt();
            if (choise == 5){
                System.out.println("成功退出系统，欢迎再次光临！");
                break;
            }
            switch (choise){
                case 1: addBook(); break;
                case 2: deleteBook(); break;
                case 3: changeBook(); break;
                case 4: findBook(); break;
                default:
                    System.out.println("输入非法");
                    printMenu();
                    continue;
            }
        }
    }

    void printMenu() {
        System.out.println("欢迎进入系统");
        System.out.println("增加图书...1");
        System.out.println("删除图书...2");
        System.out.println("修改图书...3");
        System.out.println("查询图书...4");
        System.out.println("退出系统...5");
    }
    void addBook(){
        if (count < SIZE){
            System.out.println("当前共有:" + count + "本书" );
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入图书名:");
            String bookname  = sc.next();
            System.out.println("请输入作者:");
            String author = sc.next();
            System.out.println("请输入价格");
            float price = sc.nextFloat();
            Book book = new Book(bookname, author, price);
            booklist[count] = book;
            count++;
            System.out.println("添加成功");
            printAllBook();
            printMenu();
        }
        else {
            System.out.println("图书库已满");
        }
    }

    void deleteBook(){
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("请输入按哪种方法删除图书：1.序号 2.书名 3.返回主菜单");
            int choice = sc.nextInt();
            if (choice == 1){
                System.out.println("请输入要删除第几本书：");
                int id = sc.nextInt();
                id = orderFind(id);
                if (id > -1){
                    for (int i = id; i < count - 1; i++) {
                        booklist[i] = booklist[i+1];
                    }
                    count--;
                    System.out.println("删除成功");
                    printAllBook();
                }
                else {
                    System.out.println("输入错误");
                }
            }
            else if (choice == 2){
                String bookname = sc.next();
                int id = nameFind(bookname);
                if (id > -1){
                    for (int i = id; i < count - 1; i++) {
                        booklist[i] = booklist[i+1];
                    }
                    count--;
                    System.out.println("删除成功");
                    printAllBook();
                }
                else {
                    System.out.println("未找到你想要的书名");
                }
            }
            else if (choice == 3){
                printMenu();

            }
            else {
                System.out.println("输入非法");
            }
        }
    }

    void changeBook(){
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("请输入按哪种方法修改图书：1.序号 2.书名 3.返回主菜单");
            int choice = sc.nextInt();
            if (choice == 1){
                System.out.println("请输入要修改第几本书");
                int number = sc.nextInt();
                int id = orderFind(number);
                if (id > -1){
                    System.out.println("原书名为:" + booklist[id].getName() + "请输入你要修改成什么名字");
                    String str = sc.next();
                    System.out.println("请输入作者：");
                    String author = sc.next();
                    System.out.println("请输入单价：");
                    float price = sc.nextFloat();
                    booklist[id].setBook(str, author, price);
                    System.out.println("修改成功");
                    printAllBook();
                }
                else {
                    System.out.println("输入错误");
                }
            }
            else if (choice == 2){
                System.out.println("请输入你要修改的书名：");
                String name = sc.next();
                int id = nameFind(name);
                if (id > -1){
                    System.out.println("原书名为:" + booklist[id].getName() + "请输入你要修改成什么名字");
                    String str = sc.next();
                    System.out.println("请输入作者：");
                    String author = sc.next();
                    System.out.println("请输入单价：");
                    float price = sc.nextFloat();
                    booklist[id].setBook(str, author, price);
                    System.out.println("修改成功");
                    printAllBook();
                }
            }
            else if (choice == 3){
                printMenu();
                break;
            }
            else {
                System.out.println("输入非法");
            }
        }
    }

    void findBook(){
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("请输入按哪种方法查找图书：1.序号 2.书名 3.进入主菜单");
            int choice = sc.nextInt();
            if (choice == 1){
                System.out.println("请输入要查找第几本书");
                int num = sc.nextInt();
                int id = orderFind(num);
                if (id > -1){
                    System.out.println("你要查找的书名为:" + booklist[id].getName());
                }
                else {
                    System.out.println("输入错误");
                }
            }
            else if (choice == 2){
                System.out.println("请输入你要查找的书名：");
                String name = sc.next();
                int id = nameFind(name);
                if (id > -1){
                    System.out.println("查找成功，你查找到的书为第" + (id+1) + "本");
                }
            }
            else if (choice == 3){
                printMenu();
                break;
            }
            else {
                System.out.println("输入非法");
            }
        }
    }

    int orderFind(int number) {
        if (number <= count){
            int id = number - 1;
            return id;
        }
        else
            return -1;
    }

    int nameFind(String name){
        int id = -1;
        for (int i = 0; i < count; i++) {
            if (booklist[i].getName().equals(name)){
                id = i;
                break;
            }
            else if (i < count)
                continue;
            else{
                System.out.println("为查找到你想要的书名");
                break;
            }
        }
        return id;
    }

    private void printAllBook() {
        for (int i = 0; i < count; i++) {
            System.out.println("第"+ (i + 1) + "本书名：" + booklist[i].getName()
            + "作者:" + booklist[i].getAuthor() + " 单价：" + booklist[i].getPrice());
        }
    }

    public static void main(String[] args) {
        new demo01BookManegeSystem();
    }

}