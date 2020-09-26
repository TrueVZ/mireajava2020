package ru.mirea.lab7;

public abstract class Furniture {
    private double price;
    private double weight;
    private double height;

    public Furniture(double price, double weight, double height) {
        this.price = price;
        this.weight = weight;
        this.height = height;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }


    @Override
    public String toString() {
        return "Furniture{" +
                "price=" + price +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }
}
