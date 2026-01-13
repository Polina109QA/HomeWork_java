package ru.сourses.geometry;

 public class Dot3D extends Dot {
    Integer z;

    public Dot3D(Integer x, Integer y, Integer z) {
        super(x, y);
        this.z = z;
    }

    @Override
    public String toString() {
        String str = "{" + x + ";" + y + ";" + z + "}";
        return str;
    }
}
