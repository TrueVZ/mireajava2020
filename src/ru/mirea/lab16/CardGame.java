package ru.mirea.lab16;

import java.util.LinkedList;
import java.util.Queue;

public class CardGame {
    public static void main(String[] args) {
        Queue<Integer> first = new LinkedList<>();
        first.offer(1);
        first.offer(3);
        first.offer(5);
        first.offer(7);
        first.offer(9);
        Queue<Integer> second = new LinkedList<>();
        second.offer(2);
        second.offer(4);
        second.offer(6);
        second.offer(8);
        second.offer(0);
        startGame(first, second);
    }
    public static void startGame(Queue<Integer> firstPlayer, Queue<Integer> secondPlayer){
        int turn = 0;
        while(!firstPlayer.isEmpty() && !secondPlayer.isEmpty() && turn < 106){
            int first = firstPlayer.remove();
            int second = secondPlayer.remove();

            if (first == 0 && second == 9){
                firstPlayer.add(first);
                firstPlayer.add(second);
            } else if (first == 9 && second == 0){
                secondPlayer.add(first);
                secondPlayer.add(second);
            } else if (first > second){
                firstPlayer.add(first);
                firstPlayer.add(second);
            } else {
                secondPlayer.add(first);
                secondPlayer.add(second);
            }
            turn++;
        }

        if(turn == 106){
            System.out.println("botva :( ");
        }
        if(!firstPlayer.isEmpty()){
            System.out.println("First " + turn);
        } else{
            System.out.println("Second " + turn);
        }
    }
}
