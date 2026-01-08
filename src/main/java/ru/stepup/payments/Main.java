package ru.stepup.payments;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//        Fraction f1 = new Fraction(1, 3);
//        Fraction f2 = new Fraction(2, 5);
//        Fraction f3 = new Fraction(7, 8);
//        System.out.println(f1);
//        System.out.println(f2);
//        System.out.println(f3);
//        System.out.println(f1.sum(f2).sum(f3).minus(5));
//        List<Integer> grades = new ArrayList<>();
//        grades.add(5);
//        grades.add(4);
//        grades.add(3);
//        grades.add(5);
//        grades.add(2);
//        Students student1 = new Students("John", grades);
//
//
//        List<Integer> grades2 = new ArrayList<>();
//        grades2.add(5);
//        Students student2 = new Students("Jane", grades2);
//        System.out.println(student1);
//        System.out.println(student2);
//        Students student3 = new Students("Polina");
//        student3.addGrade(2);
//        List<Integer> grades3 = new ArrayList<>();
//        grades3.add(5);
//        grades3.add(2);
//        grades3.add(4);
//        student3.addGrades(grades3);
//        System.out.println(student3);
//        List<Integer> grades5 = new ArrayList<>();
//        grades5.add(5);
//        Students student5 = new Students("Jessica", grades5);
//        System.out.println(student5);
//
//        List <Integer> x= student3.getGrades();
//        System.out.println(x);

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
