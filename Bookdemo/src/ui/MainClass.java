package ui;

import java.util.ArrayList;
import java.util.Scanner;

import model.Book;

public class MainClass {

    public static final int SIZE = 10;
    Book[] booklist = new Book[SIZE];
    int count = 0;

    public MainClass()
    {

        Scanner scan = new Scanner(System.in);

        printMenu();

        while(true)
        {
            //读取用户输入
            int choice = scan.nextInt();

            if(choice == 5)
            {
                System.out.println("成功退出系统，欢迎再次光临！");
                break;
            }
            switch(choice)//switch形式
            {
                case 1: addBook(); break;
                case 2: deleteBoo(); break;
                case 3: changeBoo(); break;
                case 4: findBoo(); break;
                default: System.out.println("输入非法"); printMenu(); continue;//这个continue 是continue的while，
            }
        }


		/*
		 * if形式：
		while(true)
		{
			//根据用户输入调用不同方法
			if(choice == 1)
			{
				addBook();
			}
			else if(choice == 2)
			{
				deleteBoo();
			}
			else if(choice == 3)
			{
				changeBoo();
			}
			else if(choice == 4)
			{
				findBoo();
			}
			else if(choice == 5)
			{
				System.out.println("成功退出系统，欢迎再次光临！");
				break;
			}
		}
		*/
    }
    void printMenu()
    {
        //打印菜单
        System.out.println("欢迎...");
        System.out.println("增加图书...1");
        System.out.println("删除图书...2");
        System.out.println("修改图书...3");
        System.out.println("查询图书...4");
        System.out.println("退出系统...5");
    }

    void addBook()//增加图书
    {
        if (count < SIZE)
        {
            System.out.println("当前共有:"+count+"本书!");
            Scanner scan = new Scanner(System.in);
            System.out.println("请输入图书名：");
            String bookname = scan.next();
            System.out.println("请输入作者：");
            String author = scan.next();
            System.out.println("请输入单价：");
            float price = scan.nextFloat();
            Book book = new Book(bookname,author,price);
            booklist[count] = book;
            count++;
            System.out.println("增加成功！");
            printAllBook();
        }
        else
        {
            System.out.println("图书库已满！");
        }


    }

    void deleteBoo()//删除图书
    {
        Scanner scan = new Scanner(System.in);
        while(true)
        {
            System.out.println("请输入按哪种方法删除图书：1、序号/2、书名/3、返回主菜单");
            int choose = scan.nextInt();
            if(choose == 1)
            {
                System.out.println("请输入要删除第几本书：");
                int id = scan.nextInt();
                id = orderFind(id);
                //System.out.println(id);
                if(id > -1)
                {
                    for(int i = id; i < count - 1 ; i++)//用for循环的形式实现对数组的删除
                        booklist[i]=booklist[i+1];
                    count--;
                    System.out.println("删除成功！");
                    printAllBook();
                }
                else
                {
                    System.out.println("输入错误！");
                }
            }
            else if(choose == 2)
            {
                System.out.println("请输入您要删除的书名：");
                String name = scan.next();
                int id = nameFind(name);
                if(id > -1)
                {
                    for(int j = id; j<count-1; j++)//用for循环的形式实现对数组的删除
                    {
                        booklist[j]=booklist[j+1];
                    }
                    count --;
                    System.out.println("删除成功！");
                    printAllBook();
                }
                else
                {
                    System.out.println("未查找到您想要的书名");
                }
            }
            else if(choose == 3)
            {
                printMenu();
                break; //这个break会跳出当前循环，从而实现跳出当前函数，返回上一级循环，即主菜单。
            }
            else
            {
                System.out.println("输入非法！");
            }
        }
    }

    void changeBoo()
    {
        Scanner scan = new Scanner(System.in);
        while(true)
        {
            System.out.println("请输入按哪种方法修改图书：1、序号/2、书名/3、返回主菜单");
            int choose = scan.nextInt();
            if(choose == 1)
            {
                System.out.println("请输入要修改第几本书：");
                int number = scan.nextInt();
                int id = orderFind(number);
                if(id > -1)
                {
                    System.out.println("原书名为："+booklist[id].getBookname()+" 请输入你要修改为什么书名：");
                    String str = scan.next();
                    System.out.println("请输入作者：");
                    String author = scan.next();
                    System.out.println("请输入单价：");
                    float price = scan.nextFloat();
                    booklist[id].setBook(str,author,price);
                    System.out.println("修改成功！");
                    printAllBook();
                }
                else
                {
                    System.out.println("输入错误！");
                }
            }
            else if(choose == 2)
            {
                System.out.println("请输入您要修改的书名：");
                String name = scan.next();
                int id = nameFind(name);
                if(id > -1)
                {
                    System.out.println("原书名为："+booklist[id].getBookname()+" 请输入你要修改为什么书名：");
                    String str = scan.next();
                    System.out.println("请输入作者：");
                    String author = scan.next();
                    System.out.println("请输入单价：");
                    float price = scan.nextFloat();
                    booklist[id].setBook(str,author,price);
                    System.out.println("修改成功！");
                    printAllBook();
                }
            }
            else if(choose == 3)
            {
                printMenu();
                break;
            }
            else
            {
                System.out.println("输入非法！");
            }
        }
    }

    void findBoo()
    {
        Scanner scan = new Scanner(System.in);
        while(true)
        {
            System.out.println("请输入按哪种方法查找图书：1、序号/2、书名/3、返回主菜单");
            int choose = scan.nextInt();
            if(choose == 1)
            {
                System.out.println("请输入要查找第几本书：");
                int number = scan.nextInt();
                int id = orderFind(number);
                if(id > -1)
                {
                    System.out.println("你要查找的书名为："+booklist[id].getBookname()+" 作者："+booklist[id].getAuthor()+" 单价："+booklist[id].getPrice()+"元/本");
                }
                else
                {
                    System.out.println("输入错误！");
                }
            }
            else if(choose == 2)
            {
                System.out.println("请输入您要查找的书名：");
                String name = scan.next();
                int id = nameFind(name);
                if(id > -1)
                {
                    System.out.println("查找成功，您查找到的书为第"+(id+1)+"本书！"+"书名为："+booklist[id].getBookname()+" 作者："+booklist[id].getAuthor()+" 单价："+booklist[id].getPrice()+"元/本");
                }
            }
            else if(choose == 3)
            {
                printMenu();
                break;
            }
            else
            {
                System.out.println("输入非法！");
            }
        }
    }

    void printAllBook() //循环打印所有的图书
    {
        for (int i = 0; i < count; i++)
        {
            System.out.println("第"+(i+1)+"本书名："+booklist[i].getBookname()+" 作者："+booklist[i].getAuthor()+" 单价："+booklist[i].getPrice()+"元/本");
        }
    }

    int orderFind(int number)	//按序号查找，返回id
    {
        //System.out.println(number);
        if(number <= count)
        {
            int id = number - 1;
            return id;
        }
        else
            return -1;
    }

    int nameFind(String name)//按书名查找，返回id
    {
        int id = -1;
        for(int i = 0; i < count; i++)
        {
            if(booklist[i].getBookname().equals(name))
            {
                id = i;
                break;
            }
            else if(i<count)
                continue;
            else
            {
                System.out.println("未查找到您想要的书名");
                break;
            }
        }
        return id;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        new MainClass();
    }

}