package ru.mirea.lab3.test;

import ru.mirea.lab3.Circle;

public class CircleTest {
    public static void main(String[] args) {
        Circle c = new Circle(10, "Blue");
        System.out.println(c.getColor());
        System.out.print(c.getRadius());
    }
}
