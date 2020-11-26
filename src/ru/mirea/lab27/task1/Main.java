package ru.mirea.lab27.task1;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Валентин", "Павлович", "Заикин");
        Person person2 = new Person("", "", "Иванов");
        Person person3 = new Person("Олег", "", "Олегов");
        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
    }
}
