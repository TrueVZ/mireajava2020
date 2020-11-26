package ru.mirea.lab31;

import java.io.BufferedReader;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    private static final HashMap<Integer, Integer> shop_db = new HashMap<>(); // id: price

    static {
        shop_db.put(1, 1500);
        shop_db.put(2, 2100);
        shop_db.put(3, 5000);
        shop_db.put(4, 1000);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        String choiceShoping;
        do {
            System.out.println("Прайс-лист: \n" +
                    "1 - product1 \n" +
                    "2 - product2 \n" +
                    "3 - product3 \n" +
                    "4 - product4 \n");
            int choice = Integer.parseInt(scanner.nextLine());
            sum += shop_db.get(choice);
            System.out.println("Еще?[Y/N]");
            choiceShoping = scanner.nextLine();
        }while (choiceShoping.equalsIgnoreCase("Y"));

        System.out.println("Выберите способ оплаты :\n" +
                "1 - Qiwi\n" +
                "2 - CreditCard");
        choiceShoping = scanner.nextLine();
        PayStrategy strategy;
        if(choiceShoping.equals("1")){
            strategy = new QiwiWalletPay();
        } else{
            strategy = new CreditCardPay();
        }
        strategy.pay(sum);

    }
}
