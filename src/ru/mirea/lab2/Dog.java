package ru.mirea.lab2;

public class Dog {
    private String name;
    private int age;

    Dog(String name, int age){
        this.name = name;
        this.age = age;
    }

    void setName(String name){
        this.name = name;
    }

    void setAge(int age){
        this.age = age;
    }

    String getName(String name){
        return this.name;
    }

    int getAge(){
        return this.age;
    }

    int getHumanAge(){ return this.age * 7;}

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}