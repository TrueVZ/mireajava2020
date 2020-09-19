package ru.mirea.lab5;

public class Rectangle extends Shape {
    private double width;
    private double length;

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea(){
        return length * width;
    }

    @Override
    public double getPerimeter() {
        return (length + width) * 2;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                super.toString() +
                ", width=" + width +
                ", length=" + length +
                '}';
    }
}
