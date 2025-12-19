package ru.stepup.payments;

public class Main {
    public static void main(String[] args) {
        Dot dot1 = new Dot(1, 3);
        Dot dot2 = new Dot(5, 8);

        Line line1 = new Line(dot1, dot2);
        Line line2 = new Line(10, 11, 15, 19);
        Line line3 = new Line(line1.end, line2.start);
        System.out.println(line1);
        System.out.println(line2);
        System.out.println(line3);
        System.out.println();

        line3.start.x = 13;
        line3.start.y = 32;
        line3.end.x = 54;
        line3.end.y = 20;
        System.out.println(line1);
        System.out.println(line2);
        System.out.println(line3);
        System.out.println();

        double lenght1 = line1.getLength();
        double lenght2 = line2.getLength();
        double lenght3 = line3.getLength();
        double sum = lenght1 + lenght2 + lenght3;
        System.out.println("Сумма длинн всех линий: " + sum);
    }
}
