package ru.mirea.lab25;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {
    private int id;
    private double gpa;
    private String name;
    private Date birthDay;

    public Student(int id, double gpa, String name, Date birthDay) {
        this.id = id;
        this.gpa = gpa;
        this.name = name;
        this.birthDay = birthDay;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id &&
                Double.compare(student.gpa, gpa) == 0 &&
                name.equals(student.name);
    }



    public String toString(String pattern) {
        DateFormat df = new SimpleDateFormat(pattern);
        return "Student{" +
                "id=" + id +
                ", gpa=" + gpa +
                ", name='" + name + '\'' +
                ", birthDay=" +
                df.format(birthDay) +
                '}';
    }
}
