package ru.mirea.lab7;

public class Test {
    public static void main(String[] args) {
        Person person = new Person("Tom");
        FurnitureShop shop = new FurnitureShop();

        Table tableOne = new Table(100, 200, 300, true);
        Table tableTwo = new Table(150, 300, 250, false);

        Chair chairOne = new Chair(200, 100, 150, "wood");

        shop.addProp(tableOne);
        shop.addProp(tableTwo);
        shop.addProp(chairOne);

        shop.printProps();
        person.add(shop, 2);
        person.add(shop, 1);
        System.out.println();
        shop.printProps();
    }
}
