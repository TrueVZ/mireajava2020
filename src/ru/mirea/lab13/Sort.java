package ru.mirea.lab13;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Sort {
    public static void mergeSort(List<Student> arr, Comparator<Student> C){
        if(arr.size()<2){
            return;
        }
        int half= arr.size()/2;
        List<Student> firstHalf=new ArrayList<>(arr.subList(0,half));
        List<Student> secondHalf=new ArrayList<>(arr.subList(half, arr.size()));

        mergeSort(firstHalf,C);
        mergeSort(secondHalf,C);

        merge(firstHalf,secondHalf,arr,C);
    }


    private static void merge(List<Student> arr1, List<Student> arr2,List<Student> arr, Comparator<Student> C){
        int it1 = 0, it2 = 0, index = 0;
        while(it1 < arr1.size() && it2 < arr2.size()) {
            if(C.compare(arr1.get(it1), arr2.get(it2)) < 0) {
                arr.set(index++, arr1.get(it1++));
            }else {
                arr.set(index++, arr2.get(it2++));
            }
        }
        while(it1 < arr1.size()) {
            arr.set(index++, arr1.get(it1++));
        }
        while(it2 < arr2.size()) {
            arr.set(index++, arr2.get(it2++));
        }
    }

    public static void quicksort(int l, int r, List<Student> arr, Comparator<Student> C){
        int i = l;
        int j = r;
        Student pivot = arr.get(arr.size() / 2);

        while(i <= j){

            while(C.compare(arr.get(i), pivot) < 0 && i < r){
                i++;
            }
            while(C.compare(arr.get(j), pivot) > 0 && j > l){
                j--;
            }

            if (i <= j){
                Student tmp = arr.get(j);
                arr.set(j, arr.get(i));
                arr.set(i, tmp);
                i++;
                j--;
            }
        }

        if (l < j){
            quicksort(l, j, arr, C);
        }

        if (i < r){
            quicksort(i, r, arr, C);
        }
    }
}
