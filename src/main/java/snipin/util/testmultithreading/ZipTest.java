package snipin.util.testmultithreading;

import org.h2.mvstore.ConcurrentArrayList;
import snipin.util.testmultithreading.zip.Book;
import snipin.util.testmultithreading.zip.GenerateBook;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class ZipTest {

    public static SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");

    public static void main(String[] args) {

        List<Book> books = new ArrayList<>();
        ConcurrentArrayList<Book> bookConcurrentArrayList = new ConcurrentArrayList<>();
        GenerateBook generateBook = new GenerateBook(10000);
        long time = System.currentTimeMillis();
        System.out.println(sdf.format(new Timestamp(System.currentTimeMillis())));
        books = generateBook.getFastBooks();
        System.out.println("size: " + books.size() + " # " + books.get(books.size() - 1).toString());
        time = System.currentTimeMillis() - time;
        System.out.println("Total time: " + sdf.format(new Timestamp(time)));
        System.out.println(sdf.format(new Timestamp(System.currentTimeMillis())));

    }

}
