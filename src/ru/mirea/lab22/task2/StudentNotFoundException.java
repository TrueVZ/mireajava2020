package ru.mirea.lab22.task2;

public class StudentNotFoundException extends Exception{
    public StudentNotFoundException(String info){
        super("Student " + info + " was not found");
    }
}
