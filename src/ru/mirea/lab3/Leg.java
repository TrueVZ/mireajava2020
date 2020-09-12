package ru.mirea.lab3;

public class Leg {
    private int sizeLeg;

    public Leg(int sizeLeg){
        this.sizeLeg = sizeLeg;
    }
    public int getSizeLeg() {
        return sizeLeg;
    }

    public void setSizeLeg(int sizeLeg) {
        this.sizeLeg = sizeLeg;
    }

    @Override
    public String toString() {
        return "Leg{" +
                "sizeLeg=" + sizeLeg +
                '}';
    }
}
