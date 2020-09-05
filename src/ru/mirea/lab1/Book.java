package ru.mirea.lab1;

public class Book {
    private String author;
    private String name;
    private int year;

    public Book(String author, String name, int year){
        this.author = author;
        this.name = name;
        this.year = year;
    }

    public Book(String author, String name){
        this.author = author;
        this.name = name;
        this.year = 0;
    }
}
