package ru.mirea.lab24.task2;

public class FuncChair implements Chair {
    public FuncChair() {
    }

    public void func(int a, int b){
        System.out.println(a * b);
    }
    @Override
    public void printChair() {
        System.out.println("Функцианальный стул");
    }
}
