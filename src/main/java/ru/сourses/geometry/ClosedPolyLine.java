package ru.сourses.geometry;

import java.util.List;

public class ClosedPolyLine extends PolyLine {

    public ClosedPolyLine(List<Dot> dots) {
        super(dots);
    }

    @Override
    public double getLength() {
        Line finishLine = new Line(dots.get(0), dots.get(dots.size() - 1));
        return super.getLength() + finishLine.getLength();
    }
}
