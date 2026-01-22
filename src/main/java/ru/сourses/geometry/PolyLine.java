package ru.сourses.geometry;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PolyLine implements Measurable {
    List<Point> points;

    public PolyLine(List<Point> points) {
        this.points = points;
    }

    public PolyLine() {
        points = new ArrayList<>();
    }

    public String toString() {
        String str = "Линия [";
        for (int i = 0; i < points.size(); i++) {
            str = str + points.get(i);
            if (i != points.size() - 1) {
                str += ",";
            }
        }
        return str + "]";
    }

    public List<Line> getLines() {
        List<Line> lines = new ArrayList<>();
        for (int i = 0; i < points.size() - 1; i++) {
            lines.add(new Line(points.get(i), points.get(i + 1)));
        }
        return lines;
    }

    public double getLength() {
        List<Line> lines = getLines();
        double lenght = 0;
        for (int i = 0; i < lines.size(); i++) {
            lenght = lenght + lines.get(i).getLength();
        }
        return lenght;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        PolyLine polyLine = (PolyLine) o;
        return Objects.equals(points, polyLine.points);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(points);
    }
}
