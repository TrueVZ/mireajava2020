package ru.mirea.lab27.task4;

public class PhoneNumber {
    final private String number;

    public PhoneNumber(String str){
        String number1;
        if (str.length() == 12){
            number1 = str.charAt(1) + "-" +
                    str.substring(2, 5) + "-" +
                    str.substring(5, 8) + "-" +
                    str.substring(8, 12);
        } else{
            number1 = str.charAt(0) + "-" +
                    str.substring(1, 4) + "-" +
                    str.substring(4, 7) + "-" +
                    str.substring(7, 11);
        }
        number = number1;
    }

    @Override
    public String toString() {
        return "PhoneNumber{" +
                "res='" + number + '\'' +
                '}';
    }
}
