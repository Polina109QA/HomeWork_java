package ru.сourses.geometry;

import java.util.List;

public class ClosedPolyLine extends PolyLine {

    public ClosedPolyLine(List<Point> points) {
        super(points);
    }

    @Override
    public double getLength() {
        Line finishLine = new Line(points.get(0), points.get(points.size() - 1));
        return super.getLength() + finishLine.getLength();
    }
}
