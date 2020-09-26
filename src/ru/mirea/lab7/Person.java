package ru.mirea.lab7;

import java.util.ArrayList;

public class Person {
    private ArrayList<Furniture> bag;
    private String name;

    public Person(ArrayList<Furniture> bag, String name) {
        this.bag = bag;
        this.name = name;
    }

    public Person(String name){
        this.name = name;
        bag = new ArrayList<>();
    }

    public ArrayList<Furniture> getBag() {
        return bag;
    }

    public void setBag(ArrayList<Furniture> bag) {
        this.bag = bag;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void add(FurnitureShop shop, int id){
        bag.add(shop.removeProp(id));
    }


}
