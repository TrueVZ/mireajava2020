package ru.mirea.lab3.test;

import ru.mirea.lab3.Head;
import ru.mirea.lab3.Human;
import ru.mirea.lab3.Leg;
import ru.mirea.lab3.Hand;

public class HumanTest {
    public static void main(String[] args) {
        Leg leg = new Leg(42);
        Hand hand = new Hand("good");
        Head head = new Head("black", "blue");
        Human h = new Human(leg, head, hand);
        System.out.println(h);
    }
}
