package ru.mirea.lab3.test;

import org.junit.Test;
import ru.mirea.lab3.Circle;

import static org.junit.Assert.*;

public class CircleTest {

    @Test
    public void getRadius() {
        Circle c = new Circle(10, "Blue");
        assertEquals(10, c.getRadius(), 0.1);
    }

    @Test
    public void getColor() {
        Circle c = new Circle(10, "Blue");
        assertEquals("Blue", c.getColor());
    }

    @Test
    public void getArea() {
        Circle c = new Circle(1, "Red");
        assertEquals(9.85, c.getArea(), 0.01);
    }
}