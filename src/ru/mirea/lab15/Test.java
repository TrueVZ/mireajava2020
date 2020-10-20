package ru.mirea.lab15;

public class Test {
    public static void main(String[] args) {
        IntegerList arr = new IntegerList(10);
        for (int i = 1; i < 21; i++) {
            arr.add(i);
        }
        System.out.println(arr.size());
        System.out.println(arr.get(4));
        System.out.println(arr.search(4));
        System.out.println(arr);
        arr.set(6, 123);
        arr.set(9, -2);
        System.out.println(arr);
        System.out.println(arr.max());
        System.out.println(arr.min());
        System.out.println(arr.avg());
        arr.remove(4);
        System.out.println(arr);
    }
}
