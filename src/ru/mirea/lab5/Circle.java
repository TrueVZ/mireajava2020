package ru.mirea.lab5;

public class Circle extends Shape{
    private double radius;

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea(){
        return radius * radius * 3.14;
    }
    @Override
    public double getPerimeter(){
        return 2 * radius * 3.14;
    }

    @Override
    public String toString() {
        return "Circle{" + super.toString() +
                ", radius=" + radius +
                '}';
    }
}
