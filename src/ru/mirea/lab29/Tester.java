package ru.mirea.lab29;

public class Tester {
    public static void main(String[] args) {
        System.out.println("<----------------ArrayQueue---------------->");
        ArrayQueue queue = new ArrayQueue();
        for (int i = 0; i < 10; i++){
            queue.enqueue(i);
        }
        while (!queue.isEmpty()){
            System.out.println(queue.size() + " " + queue.dequeu());
        }

        System.out.println("<----------------ArrayQueueModule---------------->");

        for (int i = 0; i < 10; i++){
            ArrayQueueModule.enqueue(i);
        }

        while (!ArrayQueueModule.isEmpty()){
            System.out.println(ArrayQueueModule.size() + " " + ArrayQueueModule.dequeue());
        }


        System.out.println("<----------------ArrayQueueADT---------------->");
        ArrayQueueADT queueADT = new ArrayQueueADT();
        for (int i = 0; i < 10; i++){
            queueADT.enqueue(queueADT, i);
        }

        while (!queueADT.isEmpty(queueADT)){
            System.out.println(queueADT.size(queueADT) + " " + queueADT.dequeue(queueADT));
        }
    }
}
