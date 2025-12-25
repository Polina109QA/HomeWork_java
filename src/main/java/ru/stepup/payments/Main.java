package ru.stepup.payments;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Dot dot1 = new Dot(1, 5);
        Dot dot2 = new Dot(2, 8);
        Dot dot3 = new Dot(5, 3);
        Dot dot4 = new Dot(8, 9);
        List<Dot> dots = new ArrayList<>();
        dots.add(dot1);
        dots.add(dot2);
        dots.add(dot3);
        dots.add(dot4);
        PolyLine polyLine1 = new PolyLine(dots);
        System.out.println("Ломаная: " + polyLine1);

        double lenghtPoly1 = polyLine1.getLength();
        System.out.println("Длина Ломаной: " + lenghtPoly1);

        List<Line> lines = polyLine1.getLines();
        System.out.println("Массив Линий " + lines);

        double lenght = 0;
        for (int i = 0; i < lines.size(); i++) {
            lenght = lenght + lines.get(i).getLength();
        }
        System.out.println("Длина массива Линий: " + lenght);

        System.out.println("Сравнить длину Ломаной и массива Линий: " + (lenght == lenghtPoly1));

        dot2.x = 12;
        System.out.println("Измененная точка: " + dot2);
        System.out.println("Измененная ломаная: " + polyLine1);
        System.out.println("Измененный массив Линий: " + lines);
    }
}
