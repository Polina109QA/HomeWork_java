package ru.сourses.kulinaria;

public class Sause {
    private String name;
    private Sharpness sharpness;

    public Sause(String name, Sharpness sharpness) {
        this.name = name;
        this.sharpness = sharpness;
    }

    @Override
    public String toString() {
        return "Соус " + name + ':' + sharpness.getName();

    }
}