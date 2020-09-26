package ru.mirea.lab7;

public class Table extends Furniture {
    public boolean round;

    public Table(double price, double weight, double height, boolean round) {
        super(price, weight, height);
        this.round = round;
    }

    public boolean isRound() {
        return round;
    }

    public void setRound(boolean round) {
        this.round = round;
    }

    @Override
    public String toString() {
        return "Table{" +
                "round=" + round +
                super.toString() +
                '}';
    }
}
