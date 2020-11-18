package ru.mirea.lab21;

import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {
        exceptionDemo();
    }

    public static void exceptionDemo() {
        Scanner myScanner = new Scanner( System.in );
        System.out.print( "Enter an integer ");
        String intString = myScanner.next();
        int i = Integer.parseInt(intString);
        try {
            System.out.println(2 / i);
        } catch (Exception e){
            System.out.println(e.toString());
        } finally {
            System.out.println("final");
        }
    }
}
