package ru.mirea.lab13;

import org.junit.Assert;


import java.util.Arrays;
import java.util.List;


class SortTest {

    @org.junit.jupiter.api.Test
    void mergeSort() {
        List<Student> students1 = Arrays.asList(
                new Student(1, 4.5, "Tom"),
                new Student(2, 3, "Peter"),
                new Student(3, 5, "Jack"),
                new Student(4, 3.4, "Rick")
        );
        List<Student> expected = Arrays.asList(
                new Student(3, 5, "Jack"),
                new Student(1, 4.5, "Tom"),
                new Student(4, 3.4, "Rick"),
                new Student(2, 3, "Peter")
        );
        Sort.mergeSort(students1, new SortingStudentsByGPA());
        Assert.assertEquals(expected, students1);
    }


    @org.junit.jupiter.api.Test
    void quicksort() {
        List<Student> students1 = Arrays.asList(
                new Student(1, 4.5, "Tom"),
                new Student(2, 3, "Peter"),
                new Student(3, 5, "Jack"),
                new Student(4, 3.4, "Rick")
        );
        List<Student> expected = Arrays.asList(
                new Student(3, 5, "Jack"),
                new Student(1, 4.5, "Tom"),
                new Student(4, 3.4, "Rick"),
                new Student(2, 3, "Peter")
        );
        Sort.quicksort(0, students1.size() - 1, students1, new SortingStudentsByGPA());
        Assert.assertEquals(expected, students1);
    }
}