package ru.mirea.lab22.task2;

import java.util.*;

public class Main {
    private static List<Student> students;

    private static Student searchStudent(String name) throws StudentNotFoundException {
        return students.stream().filter(a -> a.getName().equals(name))
                .findFirst()
                .orElseThrow(() -> new StudentNotFoundException(name));
    }

    private static void sortByGpa(){
        students.sort(new SortingStudentsByGPA());
    }


    public static void main(String[] args)  {
        students = Arrays.asList(
                new Student(1, 4.5, "Tom"),
                new Student(2, 3, "Peter"),
                new Student(3, 5, "Jack"),
                new Student(4, 3.4, "Rick")
        );

        System.out.println(students);
        sortByGpa();

        try {
            Student s = searchStudent("Tom");
            System.out.println(s);
            searchStudent("Ivan");
        } catch (StudentNotFoundException e){
            System.out.println(e.toString());
        }

        System.out.println(students);
    }
}
