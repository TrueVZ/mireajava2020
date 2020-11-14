package ru.mirea.lab18;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task1(150, 2);
        String x = "world";
        System.out.println(task2(x));
        System.out.println(task3());
    }
    private static void task1 (int x, int div){
        if (x == 1) return;
        if (x % div == 0){
            System.out.print(div + " ");
            task1(x / div, div);
        } else {
            if (div == 2){
                task1(x, div + 1);
            } else {
                task1(x, div + 2);
            }
        }
    }

    private static String task2 (String str){
        if (str.length() < 2){
            return str;
        }
        return task2(str.substring(1)) + str.charAt(0);
    }

    private static int max(int x, int y){
        if (x > y){
            return x;
        } else {
            return y;
        }
    }
    private static int task3 (){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if (n == 0){
            return 0;
        } else {
            return max(n, task3());
        }
    }
}
