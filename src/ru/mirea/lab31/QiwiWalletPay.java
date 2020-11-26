package ru.mirea.lab31;

import java.util.HashMap;

public class QiwiWalletPay implements PayStrategy {
    private String email;
    private String password;

    @Override
    public void pay(int sum) {
        System.out.println("Оплата через электронный кошеле Qiwi на сумму: " + sum);
    }
}
