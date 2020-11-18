package ru.mirea.lab23;

import java.io.File;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Main {

    private static <T> List<T> arrayToList(T[] arr){
        return Arrays.asList(arr); // Про реализацию ничего не сказано :)

    }

    private static void folderParse(String path){
        File dir = new File(path);
        List<File> files = arrayToList(dir.listFiles());
        try {
            for(int i = 0; i < 5; i++){
                System.out.println(files.get(i));
            }
        } catch (Exception e){
            System.out.println("Элементов меньше 5");
        }

    }
    public static void main(String[] args) {
        //1
        Integer[] arr = new Integer[]{1, 2, 3, 4};
        List<Integer> list = arrayToList(arr);
        String[] arrStr = new String[]{"1", "2", "3"};
        List<String> list1 = arrayToList(arrStr);
        //2
        GenericArray<Integer> array = new GenericArray<>();
        array.setArr(arr);
        System.out.println(array.get(2));
        folderParse("/Users/valyazaikin/Desktop/");


    }
}
