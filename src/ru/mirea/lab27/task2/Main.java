package ru.mirea.lab27.task2;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Address("Россия, Московская область, Москва, улица Пушкина, 1, 1, 1"));
        System.out.println(new Address("Россия, Московская область, Подольск, улица Иванова, 10, 20, 30"));
        System.out.println(new Address("Россия-Московская область-Москва-Арбат-1-2-3", "-"));
        System.out.println(new Address("Россия:Республика Башкортостан:Уфа:проспект Октября:4:5:6", ":"));
    }
}
