package ru.mirea.lab3.test;

import ru.mirea.lab3.Book;

public class BookTest {
    public static void main(String[] args) {
        Book b = new Book();
        b.setAuthor("Толстой");
        b.setTitle("Война и мир");
        b.setYear(1867);
        System.out.println(b.getAuthor());
        System.out.println(b.getTitle());
        System.out.println(b.getYear());
        System.out.println(b);
    }
}
