package ru.mirea.lab6;

import ru.mirea.lab5.Rectangle;

public class MovableRectangle extends Rectangle implements Movable {
    MovablePoint centre;

    public MovableRectangle(String color, boolean filled, double width, double length, double x, double y) {
        super(color, filled, width, length);
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
        return "MovableRectangle{" +
                super.toString() +
                ", x=" + this.centre.getX() +
                ", y=" + this.centre.getY() +
                '}';
    }
}
