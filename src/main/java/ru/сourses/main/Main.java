package ru.сourses.main;

import ru.сourses.animals.Cat;
import ru.сourses.animals.ObjectNullifier;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        List<String> friends = Arrays.asList("Барсик", "Мурзик");
        Cat cat = new Cat("Вася", 5, friends);

        System.out.println("До обнуления: " + cat);

        ObjectNullifier.nullifyObject(cat);

        System.out.println("После обнуления: " + cat);
    }
}
