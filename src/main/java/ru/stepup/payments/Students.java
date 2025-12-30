package ru.stepup.payments;

import java.util.ArrayList;
import java.util.List;

public class Students {
    private String name;
    private List<Integer> grades;

    public Students(String name, List<Integer> grades) {
        this.name = name;
        this.grades = new ArrayList<>();
        addGrades(grades);
    }

    public Students(String name) {
        this(name, new ArrayList<>());
    }

    @Override
    public String toString() {
        String str = name + ": [";
        for (int i = 0; i < grades.size(); i++) {
            str += grades.get(i);
            if (i != grades.size() - 1) {
                str += ",";
            }
        }
        return str + "]";
    }

    public List<Integer> getGrades() {
        return grades;
    }

    public void addGrades(List<Integer> grades) {
        for (int i = 0; i < grades.size(); i++) {
            if (grades.get(i) < 2 || grades.get(i) > 5) {
                throw new IllegalArgumentException("Оценка должна входить в диапазон от 2 до 5");
            }
            this.grades.add(grades.get(i));
        }
    }

    public void addGrade(Integer grade) {
        if (grade < 2 || grade > 5) {
            throw new IllegalArgumentException("Оценка должна входить в диапазон от 2 до 5");
        }
        grades.add(grade);
    }


}
