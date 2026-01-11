package ru.stepup.payments;

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

        ClosedPolyLine closedPolyLine1 = new ClosedPolyLine(dots);
        System.out.println("Замкнутая ломаная: " + closedPolyLine1);

        double lenghtClosedPolyLine1 = closedPolyLine1.getLength();
        System.out.println("Длина замкнутой ломаной: " + lenghtClosedPolyLine1);

        System.out.println("Результат задания Полиморфизм №3 Измерение длины");
        ArrayList<Measurable> measurables = new ArrayList<>();
        measurables.add(polyLine1);
        measurables.add(closedPolyLine1);
        printResult(measurables);
    }

    static void printResult(List<Measurable> measurables) {
        for (int i = 0; i < measurables.size(); i++) {
            System.out.println(measurables.get(i).getLength());
        }
    }
}
