package ru.mirea.lab7;

import ru.mirea.lab7.Furniture;


import java.util.HashMap;
import java.util.Map;

public class FurnitureShop {
    private HashMap<Integer, Furniture> props;
    int id = 0;

    public FurnitureShop() {
        props = new HashMap<>();
    }

    public void addProp(Furniture prop){
        props.put(++id, prop);
    }

    public Furniture removeProp(int id){
        return props.remove(id);
    }

    public void printProps() {
        for (Map.Entry<Integer, Furniture> e : props.entrySet()) {
            System.out.println("Key: " + e.getKey() + " Value: "
                    + e.getValue());
        }
    }
}
