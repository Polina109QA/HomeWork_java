package ru.сourses.main;

import ru.сourses.geometry.Point;

public class Main {
    public static void main(String[] args) {
        Point d1 = new Point(8, 3);
        Point d2 = new Point(8, 3);
        System.out.println(d1 == d2); //false
        System.out.println(d1.equals(d2)); //true
        Point d3 = d2.clone();
        System.out.println(d3 == d2); //false
        System.out.println(d3.equals(d2)); //true
    }

}
