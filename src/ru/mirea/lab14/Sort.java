package ru.mirea.lab14;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class Sort {
    public static void main(String[] args) {
        Random r = new Random();
        Student[] students1 = new Student[100];
        for (int i = 0; i < 100; i++){
            students1[i] = new Student(r.nextInt(100), i+3, "name" + r.nextInt(100));
        }
        mergeSort(students1);
        for (Student s: students1) {
            System.out.println(s);

        }
    }
    public static void mergeSort(Comparable[] arr){
        if(arr.length<2){
            return;
        }
        int half= arr.length / 2;
        Comparable[] firstHalf = new Comparable[half];
        System.arraycopy(arr, 0, firstHalf, 0, half);
        Comparable[] secondHalf = new Comparable[arr.length- arr.length/2];
        System.arraycopy(arr, half, secondHalf, 0, arr.length - arr.length/2);

        mergeSort(firstHalf);
        mergeSort(secondHalf);

        merge(firstHalf,secondHalf,arr);
    }


    public static void merge(Comparable[] arr1, Comparable[] arr2, Comparable[] arr){
        int it1 = 0, it2 = 0, index = 0;
        while(it1 < arr1.length && it2 < arr2.length) {
            if(arr[it1].compareTo(arr2[it2]) < 0) {
                arr[index++] = arr1[it1++];
            }else {
                arr[index++] = arr2[it2++];
            }
        }
        while(it1 < arr1.length) {
            arr[index++] = arr1[it1++];
        }
        while(it2 < arr2.length) {
            arr[index++] = arr2[it2++];
        }
    }
}
