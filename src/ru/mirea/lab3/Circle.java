package ru.mirea.lab3;

public class Circle {
    private double radius;
    private String color;

    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }
    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public double getArea() {
        return radius * 3.14 * 3.14;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", area=" + getArea() +
                '}';
    }
}

