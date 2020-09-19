package ru.mirea.lab6;

import ru.mirea.lab5.Circle;

public class MovableCircle extends Circle implements Movable {

    MovablePoint centre;

    public MovableCircle(String color, boolean filled, double radius, double x, double y) {
        super(color, filled, radius);
        this.centre = new MovablePoint(x, y);
    }

    public double getX() {
        return this.centre.getX();
    }

    public void setX(double x) {
        this.centre.setX(x);
    }

    public double getY() {
        return this.centre.getY();
    }

    public void setY(double y) {
        this.centre.setY(y);
    }

    @Override
    public void move(double x, double y) {
        this.centre.move(x, y);
    }

    @Override
    public String toString() {
        return "MovableCircle{" +
                super.toString() +
                ", x=" + this.centre.getX() +
                ", y=" + this.centre.getY() +
                '}';
    }
}
