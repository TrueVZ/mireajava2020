package ru.mirea.lab28;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    private static boolean checkExpression(String str) {
        Pattern pattern = Pattern.compile("\\(([^(]*)\\)");
        Matcher matcher = pattern.matcher(str);
        do {
            str = matcher.replaceAll("");
            matcher = pattern.matcher(str);
        } while (matcher.find());
        pattern = Pattern.compile("[(|)]");
        return !pattern.matcher(str).find();
    }

    private static boolean checkIp(String ip){
        Pattern pattern = Pattern.compile("^(([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.){3}" +
                "([01]?\\d\\d?|2[0-4]\\d|25[0-5])$");
        return pattern.matcher(ip).find();
    }


    public static void main(String[] args) {
        String[] ips = {"127.0.0.1", "255.255.255.0", "1300.6.7.8", "abc.def.gha.bcd"};
        String[] exprs = {"(3 + 5) – 9 * 4", "((3 + 5) – 9 * 4", "1.5 + 4.2 * ( 5 + 2 ) / 10 - 4"};


        System.out.println("<------------------ Checks IP ------------------>");

        for(String ip : ips){
            System.out.println(ip + ": " + checkIp(ip));
        }

        System.out.println("<------------------ Checks Expr ------------------>");

        for(String expr : exprs){

            System.out.println(expr + ": " + checkExpression(expr));
        }

    }
}
