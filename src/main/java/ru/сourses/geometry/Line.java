package ru.сourses.geometry;

class Line {
    Dot start;
    Dot end;

    public Line(Integer xStart, Integer yStart, Integer xEnd, Integer yEnd) {
        start = new Dot(xStart, yStart);
        end = new Dot(xEnd, yEnd);
    }

    public Line(Dot start, Dot end) {
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
}
