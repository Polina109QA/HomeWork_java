package ru.сourses.main;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        int n = 30;

        ArrayList<Integer> list = new ArrayList<>(n);
        for (int i = 0; i <= n; i += 2) {
            list.add(i);
        }
        System.out.println(list);

        for (int i = 0; i < list.size() - 1; i += 2) {
            Collections.swap(list, i, i + 1);
        }
        System.out.println(list);
    }
}
