package ru.stepup.payments;

import java.util.ArrayList;
import java.util.List;

class PolyLine implements Measurable {
    List<Dot> dots;

    public PolyLine(List<Dot> dots) {
        this.dots = dots;
    }

    public PolyLine() {
        dots = new ArrayList<>();
    }

    public String toString() {
        String str = "Линия [";
        for (int i = 0; i < dots.size(); i++) {
            str = str + dots.get(i);
            if (i != dots.size() - 1) {
                str += ",";
            }
        }
        return str + "]";
    }

    public List<Line> getLines() {
        List<Line> lines = new ArrayList<>();
        for (int i = 0; i < dots.size() - 1; i++) {
            lines.add(new Line(dots.get(i), dots.get(i + 1)));
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

}
