package ru.mirea.lab24.task1;

public class Main {
    public static void main(String[] args) {
        ComplexFactory factory = new ComplexFactory();
        Complex complex = factory.createComplex();
        System.out.println(complex);
        Complex complex1 = factory.createComplex(1, 1);
        System.out.println(complex1);

    }


}
