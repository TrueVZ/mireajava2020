package ru.mirea.lab24.task1;

public class Complex {
    private int real;
    private int image;

    public Complex(int real, int image){
        this.real = real;
        this.image = image;
    }

    public Complex(){}

    public int getReal() {
        return real;
    }

    public void setReal(int real) {
        this.real = real;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Complex{" +
                "real=" + real +
                ", image=" + image +
                '}';
    }
}
