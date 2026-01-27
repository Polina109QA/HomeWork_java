package ru.сourses.main;

import ru.сourses.kulinaria.Sause;
import ru.сourses.kulinaria.Sharpness;

public class Main {
    public static void main(String[] args) {
        Sause s1 = new Sause("Шрирача", Sharpness.HARD);
        Sause s2 = new Sause("Барбекю", Sharpness.LOW);
        System.out.println(s1);
        System.out.println(s2);
    }
}
