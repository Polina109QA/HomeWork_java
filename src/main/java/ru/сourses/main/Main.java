package ru.сourses.main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String str = new Scanner(System.in).nextLine();
        String[] s = str.split(" ");
        double res = 0;
        for (int i = 2; i < s.length; i++) {
            if (s[i].matches("[-+]?\\d+")) {
                res += Double.parseDouble(s[i]);
            }
        }
        System.out.println(res);
    }
}
