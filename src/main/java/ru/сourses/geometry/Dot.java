package ru.сourses.geometry;


public class Dot {
    Integer x;
    Integer y;

    public Dot(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        String str = "{" + x + ";" + y + "}";
        return str;
    }
}
