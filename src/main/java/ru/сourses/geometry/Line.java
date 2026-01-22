package ru.сourses.geometry;

import java.util.Objects;

public class Line {
    Point start;
    Point end;

    public Line(Integer xStart, Integer yStart, Integer xEnd, Integer yEnd) {
        start = new Point(xStart, yStart);
        end = new Point(xEnd, yEnd);
    }

    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public String toString() {
        String str = "Линия от " + start + " до " + end;
        return str;
    }

    public Double getLength() {
        Integer yS = start.y;
        Integer xS = start.x;
        Integer yE = end.y;
        Integer xE = end.x;
        int a = yS - yE;
        int b = xS - xE;
        double res = Math.sqrt((a * a) + (b * b));
        return res;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Line line = (Line) o;
        return Objects.equals(start, line.start) && Objects.equals(end, line.end);
    }

    @Override
    public int hashCode() {
        return Objects.hash(start, end);
    }

    @Override
    public Line clone() {
        return new Line(start.clone(), end.clone());
    }
}
