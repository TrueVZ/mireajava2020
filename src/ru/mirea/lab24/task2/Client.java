package ru.mirea.lab24.task2;

public class Client {
    private Chair chair;

    public void sit() {
        System.out.println("Сидит на " + chair);
    }

    public void setChair(Chair chair) {
        this.chair = chair;
    }
}
