package ru.mirea.lab5;

public class TestShape {
    public static void main(String[] args) {
        Shape c = new Circle("red", false, 2.0);
        Shape r = new Rectangle("blue", true, 20, 30);
        Shape s = new Square("green", false, 10);
        System.out.println(c);
        System.out.println(r);
        System.out.println(s);
    }
}
