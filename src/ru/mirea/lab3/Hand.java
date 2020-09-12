package ru.mirea.lab3;

public class Hand {
    private String handCondition;

    public Hand(String handCondition){
        this.handCondition = handCondition;
    }
    public void setHandCondition(String handCondition) {
        this.handCondition = handCondition;
    }

    public String getHandCondition() {
        return handCondition;
    }

    @Override
    public String toString() {
        return "Hand{" +
                "handCondition='" + handCondition + '\'' +
                '}';
    }
}
