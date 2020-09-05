package ru.mirea.lab1;

public class Dog {
    private String name;
    private int age;
    private String color;

    Dog(String name, int age, String color){
        this.name = name;
        this.age = age;
        this.color = color;
    }
    void setName(String name){
        this.name = name;
    }

    void setAge(int age){
        this.age = age;
    }

    void setColor(String color){
        this.color = color;
    }

    String getName(String name){
        return this.name;
    }

    int getAge(int age){
        return this.age * 7;
    }

    String getColor(String color){
        return this.color;
    }

    @Override
    public String toString(){
        return String.format("Name: %s\nAge: %d\nColor: %s", this.name, this.age, this.color);
    }
}