package ru.mirea.lab24.task1;

public class ComplexFactory implements ComplexAbstractFactory {

    @Override
    public Complex createComplex() {
        Complex complex = new Complex(4, 1);
        return complex;
    }

    @Override
    public Complex createComplex(int real, int image) {
        Complex complex = new Complex(real, image);
        return complex;
    }
}
