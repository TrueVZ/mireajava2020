package ru.mirea.lab23;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class Solution {

    @SafeVarargs // IntelliJ предложил
    public static <T>ArrayList<T> newArrayList(T... objects){
        ArrayList<T> arr = new ArrayList<>();
        Collections.addAll(arr, objects);
        return arr;
    }

    @SafeVarargs
    public static <T>HashSet<T> newHashSet(T... objects){
        HashSet<T> set = new HashSet<>();
        Collections.addAll(set, objects);
        return set;
    }

    //public static <K, V> HashMap<K, V> newHashMap()
}
