package ru.сourses.main;

import ru.сourses.geometry.Line;
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

        System.out.println();
        Line l1 = new Line(d1, d2);
        Line l2 = new Line(d1, d3);
        System.out.println(l1 == l2); //false
        System.out.println(l1.equals(l2)); //true
        Line l3 = l2.clone();
        System.out.println(l3 == l2); //false
        System.out.println(l3.equals(l2)); //true




    }

}
