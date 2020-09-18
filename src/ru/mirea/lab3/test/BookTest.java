package ru.mirea.lab3.test;

import org.junit.Test;
import ru.mirea.lab3.Book;
import static org.junit.Assert.*;

public class BookTest {

    @Test
    public void getYear() {
        Book book = new Book("Ivan", "MIr", 1999);
        assertEquals(1999, book.getYear());

    }

    @Test
    public void getAuthor() {
        Book book = new Book("Ivan", "MIr", 1999);
        assertEquals("Ivan", book.getAuthor());
    }

    @Test
    public void getTitle() {
        Book book = new Book("Ivan", "Mir", 1999);
        assertEquals("Mir", book.getTitle());
    }
}