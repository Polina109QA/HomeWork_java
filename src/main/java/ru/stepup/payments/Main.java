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
        List<Integer> grades = new ArrayList<>();
        grades.add(5);
        grades.add(4);
        grades.add(3);
        grades.add(5);
        grades.add(2);
        Students student1 = new Students("John", grades);


        List<Integer> grades2 = new ArrayList<>();
        grades2.add(5);
        Students student2 = new Students("Jane", grades2);
        System.out.println(student1);
        System.out.println(student2);
        Students student3 = new Students("Polina");
        student3.addGrade(2);
        List<Integer> grades3 = new ArrayList<>();
        grades3.add(5);
        grades3.add(2);
        grades3.add(4);
        student3.addGrades(grades3);
        System.out.println(student3);
        List<Integer> grades5 = new ArrayList<>();
        grades5.add(5);
        Students student5 = new Students("Jessica", grades5);
        System.out.println(student5);

        List <Integer> x= student3.getGrades();
        System.out.println(x);



    }
}
