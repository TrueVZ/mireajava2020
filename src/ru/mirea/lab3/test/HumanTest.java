package ru.mirea.lab3.test;

import ru.mirea.lab3.Head;
import ru.mirea.lab3.Human;
import ru.mirea.lab3.Leg;
import ru.mirea.lab3.Hand;

public class HumanTest {
    public static void main(String[] args) {
        Leg legR = new Leg(42);
        Leg legL = new Leg(41);
        Hand handR = new Hand("good");
        Hand handL = new Hand("Not Good");
        Head head = new Head("black", "blue");
        Human h = new Human(head, legR, legL, handR, handL);
        System.out.println(h);
    }
}
