package ru.сourses.geometry;


import java.util.Objects;

public class Point {
    Integer x;
    Integer y;

    public Point(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        String str = "{" + x + ";" + y + "}";
        return str;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return Objects.equals(x, point.x) && Objects.equals(y, point.y);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
