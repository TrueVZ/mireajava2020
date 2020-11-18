package ru.mirea.lab23;

import java.lang.reflect.Array;
import java.util.Arrays;

public class GenericArray<E> {
    private E[] arr;

    public void setArr(E [] arr){
        this.arr = arr;
    }

    public E get(int i){
        return arr[i];
    }

    @Override
    public String toString() {
        return "GenericArray{" +
                "arr=" + Arrays.toString(arr) +
                '}';
    }
}
