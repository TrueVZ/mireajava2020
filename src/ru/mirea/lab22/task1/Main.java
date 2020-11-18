package ru.mirea.lab22.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String inn = scanner.nextLine();
        try {
            Client client = new Client(name, inn);
            System.out.println(client);
        } catch (Exception e){
            System.out.println(e.toString());
        }
    }
}
