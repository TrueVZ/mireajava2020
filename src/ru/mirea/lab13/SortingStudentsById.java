package ru.mirea.lab13;

import java.util.Comparator;

public class SortingStudentsById implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return Integer.compare(s1.getId(), s2.getId());
    }
}
