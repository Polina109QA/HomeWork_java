package ru.сourses.main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String str = new Scanner(System.in).nextLine();
        String[] s = str.split(" ");
        double res = 0;
        for (int i = 2; i < s.length; i++) {
            try {
                res += Double.parseDouble(s[i]);
            } catch (NumberFormatException e) {
                res += 0;
            }
        }
        System.out.println(res);
    }
}
