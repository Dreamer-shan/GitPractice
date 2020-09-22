package tool;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import model.Book;
import model.BookList;
import ui.MainClass;

public class IO {

    public void load()
    {
        try {
            String filename = "E:\\basic-code\\BookMnager\\BookManager02ArrayList\\src\\book.txt";
            File file = new File(filename);
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String temp;
            while((temp = reader.readLine()) != null)
            {
                String bookname = temp.split(",")[0];
                String author = temp.split(",")[1];
                String pricestr = temp.split(",")[2];
                float price = Float.parseFloat(pricestr);
                Book book = new Book(bookname,author,price);
                BookList.booklist.add(book);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (NumberFormatException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void save()
    {
        String fileName = "E:\\basic-code\\BookMnager\\BookManager02ArrayList\\src\\book.txt";
        String allbook="";
        for(int i = 0; i < BookList.booklist.size(); i++)
        {
            Book book = (Book)BookList.booklist.get(i);
            String temp = book.getName()+ "," + book.getAuthor() + "," + book.getPrice() + "\r\n";

            allbook += temp;
        }
        try {
            File file1 = new File(fileName);
            FileWriter fileWriter;
            fileWriter = new FileWriter(file1);
            fileWriter.write(allbook);
            fileWriter.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}