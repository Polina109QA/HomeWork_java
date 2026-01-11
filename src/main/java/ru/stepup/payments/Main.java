package ru.stepup.payments;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> grades = new ArrayList<>();
        grades.add(5);
        grades.add(4);
        grades.add(3);
        grades.add(5);
        grades.add(2);
        Students student1 = new Students("John", grades);

        List<Number> numbers1 = new ArrayList<>();
        numbers1.add(2);
        numbers1.add(new Fraction(3, 5));
        numbers1.add(2.3);
        System.out.println(sumAll(numbers1));

        List<Number> numbers2 = new ArrayList<>();
        numbers2.add(3.6);
        numbers2.add(new Fraction(49, 12));
        numbers2.add(3);
        numbers2.add(3.2);
        System.out.println(sumAll(numbers2));

        List<Number> numbers3 = new ArrayList<>();
        numbers3.add(new Fraction(1, 3));
        numbers3.add(1);
        System.out.println(sumAll(numbers3));

    }

    public static double sumAll(List<Number> numbers) {
        double sum = 0.0;
        for (Number number : numbers) {
            sum += number.doubleValue();
        }
        return sum;
    }
}
