package ru.mirea.lab13;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        List<Student> students1 = Arrays.asList(
                new Student(1, 4.5, "Tom"),
                new Student(2, 3, "Peter"),
                new Student(3, 5, "Jack"),
                new Student(4, 3.4, "Rick")
        );
        List<Student> students2 = Arrays.asList(
                new Student(1, 4.5, "Tom"),
                new Student(321, 3, "Peter"),
                new Student(90, 5, "Jack"),
                new Student(56, 3.4, "Rick")
        );
        Sort.mergeSort(students2, new SortingStudentsById());
        System.out.println(students2);
        Sort.mergeSort(students1, new SortingStudentsByGPA());
        Sort.quicksort(0, students2.size()-1, students2, new SortingStudentsByGPA());
        System.out.println(students1);
        System.out.println(students2);
    }
}

