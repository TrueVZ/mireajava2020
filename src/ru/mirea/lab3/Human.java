package ru.mirea.lab3;

public class Human {
    private Head head;
    private Leg leg;
    private Hand hand;

    public Human(Leg leg, Head head, Hand hand){
        this.leg = leg;
        this.head = head;
        this.hand = hand;
    }
    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public Leg getLeg() {
        return leg;
    }

    public void setLeg(Leg leg) {
        this.leg = leg;
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    @Override
    public String toString() {
        return "Human{" +
                "head=" + head +
                ", leg=" + leg +
                ", hand=" + hand +
                '}';
    }
}

