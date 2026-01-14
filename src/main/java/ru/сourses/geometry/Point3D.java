package ru.сourses.geometry;

 public class Point3D extends Point {
    Integer z;

    public Point3D(Integer x, Integer y, Integer z) {
        super(x, y);
        this.z = z;
    }

    @Override
    public String toString() {
        String str = "{" + x + ";" + y + ";" + z + "}";
        return str;
    }
}
