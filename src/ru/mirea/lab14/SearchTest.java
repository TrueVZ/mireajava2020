package ru.mirea.lab14;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.*;

class SearchTest {

    @Test
    void linearSearch() {
        Random r = new Random();
        Student[] students1 = new Student[100];
        for (int i = 0; i < 100; i++){

            int a = r.nextInt(100) + 4;
            students1[i] = new Student(a, a % 5, "name" + a);
        }
        Student test = students1[r.nextInt(100)];
        Student res = (Student) Search.linearSearch(students1, test);
        Assert.assertEquals(test, res);
    }

    @Test
    void binarySearch() {
        Random r = new Random();
        Student[] students1 = new Student[100];
        for (int i = 0; i < 100; i++) {
            students1[i] = new Student(i, i % 5, "name" + i);
        }
        Student test = students1[r.nextInt(100)];
        Student res = (Student) Search.binarySearch(students1, test);
        Assert.assertEquals(test, res);
    }
    @Test
    void binarySearchRec() {
        Random r = new Random();
        Student[] students1 = new Student[100];
        for (int i = 0; i < 100; i++){
            students1[i] = new Student(i, i % 5, "name" + i);
        }
        Student test = students1[r.nextInt(100)];
        Student res = (Student) Search.binarySearchRec(0, students1.length - 1, students1, test);
        Assert.assertEquals(test, res);
    }
}