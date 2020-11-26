package ru.mirea.lab27.task3;

public class Shirt {
    private final String code;
    private final String name;
    private final String color;
    private final String size;

    public Shirt(String str){
        String[] value = str.split(",");
        code = value[0];
        name = value[1];
        color = value[2];
        size = value[3];
    }

    @Override
    public String toString() {
        return  "code=" + code + '\n' +
                "name=" + name + '\n' +
                "color=" + color + '\n' +
                "size=" + size + '\n';
    }
}
