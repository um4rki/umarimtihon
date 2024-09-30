package lesson3.homework_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {



        List<Book> books = new ArrayList<>();
        List<Book> books1 = new ArrayList<>();

        books.add(new Book("Java"));
        books.add(new Book("C++"));
        books.add(new Book("Python"));
        books.add(new Book("JavaScript"));
        books.add(new Book("C#"));
        books.add(new Book("HTML"));
        books.add(new Book("JS"));
        books.add(new Book(".NET"));
        books.add(new Book("PHP"));
        books.add(new Book("Go"));

        for(int i = 0 ; i < 5; i++){
            books1.add(books.get(new Random().nextInt(books.size())));
        }

        System.out.println(books);
        System.out.println(books1);

        books.removeAll(books1);

        System.out.println("books = " + books);
        System.out.println("books1 = " + books1);

    }
}
