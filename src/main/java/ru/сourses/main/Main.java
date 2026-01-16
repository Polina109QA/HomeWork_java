package ru.сourses.main;

import ru.сourses.geometry.Line;
import ru.сourses.geometry.Point;
import ru.сourses.geometry.PolyLine;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Point d1 = new Point(8, 3);
        Point d2 = new Point(4, 3);
        Point d3 = new Point(2, 3);
        System.out.println(d1 == d2); //false
        System.out.println(d1.equals(d2)); //true
//

        System.out.println("--------------------------------------------");
        Line l1 = new Line(d1, d2);
        Line l2 = new Line(d1, d3);
        System.out.println(l1 == l2); //false
        System.out.println(l1.equals(l2)); //true
        Line l3 = l2.clone();
        System.out.println(l3 == l2); //false
        System.out.println(l3.equals(l2)); //true
        System.out.println("--------------------------------------------");

        List<Point> points1 = new ArrayList<>();
        points1.add(d1);
        points1.add(d2);
        points1.add(d3);
        PolyLine polyLine1 = new PolyLine(points1);
        List<Point> points2 = new ArrayList<>();
        points2.add(d1);
        points2.add(d2);
        points2.add(d3);
        PolyLine polyLine2 = new PolyLine(points2);
        System.out.println(polyLine1 == polyLine2); //false
        System.out.println(polyLine1.equals(polyLine2)); //true


    }

}
