package ru.mirea.lab1;

import ru.mirea.lab1.test.Test;

import java.util.Random;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println("---- Task 1 ----");
        task1(10);

        System.out.println("---- Task 2 ----");
        task2(args);

        System.out.println("---- Task 3 ----");
        task3(10);
        System.out.println();

        System.out.println("---- Task 4 ----");
        task4(10);
        System.out.println();

        System.out.println("---- Task 5 ----");
        task5(10);

        System.out.println("\n--- Test class Dog ----");
        Dog d1 = new Dog("Rex", 10, "red");
        Test.print(d1);


    }

    public static void task1(int n ){
        Random random = new Random();
        int[] arr = new int[n];
        int sum = 0;

        for (int i = 0; i < arr.length; i++){
            arr[i] = random.nextInt(100);
        }

        System.out.print("for : ");
        for (int e : arr){
            sum += e;
        }
        System.out.println(sum);

        sum = 0;
        int i = 0;
        System.out.print("while do : ");
        while (i < arr.length){
            sum += arr[i];
            i++;
        }
        System.out.println(sum);

        sum = 0;
        i = 0;
        System.out.print("do while: ");
        do{
            sum+= arr[i];
            i++;
        } while (i < arr.length);
        System.out.println(sum);
    }

    public static void task2(String []args){
        for (String arg : args){
            System.out.print(arg + " ");
        }
    }

    public static void task3(int n){
        for(int i = 1; i <= n; i++){
            System.out.print((float) 1/i + " ");
        }
    }

    public static void task4(int n){
        Random random = new Random();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = random.nextInt(100);
        }
        System.out.print("Не отсортированный массив : ");
        for (int e : arr){
            System.out.print(e + " ");
        }
        Arrays.sort(arr);
        System.out.println();
        System.out.print("Отсортированный массив : ");
        for (int e : arr){
            System.out.print(e + " ");
        }
    }

    public static void task5(int n){
        int s = 1;
        for(int i = 1; i < n; i++){
            s *= i;
        }
        System.out.printf("n! = %d", s);
    }
}
