package ru.mirea.lab1;

import ru.mirea.lab1.test.Tester;

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
        System.out.print(task5(10));

        System.out.println("\n--- Test class Dog ----");
        Dog d1 = new Dog("Rex", 10, "red");
        Tester.print(d1);


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
            System.out.println(arg + " ");
        }
    }

    public static void task3(int n){
        for(int i = 1; i <= n; i++){
            double s = 1. / i;
            System.out.printf("%.2f ", s);
        }
    }

    public static void task4(int n){
        Random random = new Random();
        int[] arrRandom = new int[n];

        for(int i = 0; i < n; i++){
            arrRandom[i] = random.nextInt(100);
        }
        System.out.println("Не отсортированный массив использован Random: ");
        for (int e : arrRandom){
            System.out.print(e + " ");
        }
        Arrays.sort(arrRandom);
        System.out.println();
        System.out.println("Отсортированный массив использован Random: ");
        for (int e : arrRandom){
            System.out.print(e + " ");
        }
        System.out.println();

        int[] arrMathRdm = new int[n];

        for(int i = 0; i < n; i++){
            arrMathRdm[i] = (int)(Math.random() * 100);
        }

        System.out.println("Not sorted Math: ");
        for (int e : arrMathRdm){
            System.out.print(e + " ");
        }
        Arrays.sort(arrMathRdm);
        System.out.println();
        System.out.println("Sorted Math: ");
        for (int e : arrMathRdm){
            System.out.print(e + " ");
        }
    }

    public static int task5(int n){
        int s = 1;
        for(int i = 1; i <= n; i++){
            s *= i;
        }
        return s;
    }
}
