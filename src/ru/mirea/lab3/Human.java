package ru.mirea.lab3;

public class Human {
    private Head head;
    private Leg legL;
    private Leg legR;
    private Hand handL;
    private Hand handR;

    public Human(Head head, Leg legL, Leg legR, Hand handL, Hand handR) {
        this.head = head;
        this.legL = legL;
        this.legR = legR;
        this.handL = handL;
        this.handR = handR;
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public Leg getLegL() {
        return legL;
    }

    public void setLegL(Leg legL) {
        this.legL = legL;
    }

    public Leg getLegR() {
        return legR;
    }

    public void setLegR(Leg legR) {
        this.legR = legR;
    }

    public Hand getHandL() {
        return handL;
    }

    public void setHandL(Hand handL) {
        this.handL = handL;
    }

    public Hand getHandR() {
        return handR;
    }

    public void setHandR(Hand handR) {
        this.handR = handR;
    }

    @Override
    public String toString() {
        return "Human{" +
                "head=" + head +
                ", legL=" + legL +
                ", legR=" + legR +
                ", handL=" + handL +
                ", handR=" + handR +
                '}';
    }
}

