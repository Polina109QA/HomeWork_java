package ru.сourses.algebra;

public class Fraction extends Number {
    private final Integer numerator;
    private final Integer denominator;

    public Fraction(Integer numerator, Integer denominator) {
        this.numerator = numerator;
        if (denominator < 0)
            throw new IllegalArgumentException("Denominator cannot be less than 0");
        this.denominator = denominator;
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }

    public Fraction sum(Fraction fraction) {
        int a = numerator;
        int b = denominator;
        int c = fraction.numerator;
        int d = fraction.denominator;
        int numRes = a * d + b * c;
        int denRes = b * d;
        return new Fraction(numRes, denRes);
    }

    public Fraction sum(Integer number) {
        return sum(new Fraction(number, 1));
    }

    public Fraction minus(Fraction fraction) {
        int a = numerator;
        int b = denominator;
        int c = fraction.numerator;
        int d = fraction.denominator;
        int numRes = a * d - b * c;
        int denRes = b * d;
        return new Fraction(numRes, denRes);
    }

    public Fraction minus(Integer number) {
        return minus(new Fraction(number, 1));
    }

    @Override
    public int intValue() {
        return numerator / denominator;
    }

    @Override
    public long longValue() {
        return numerator / denominator;
    }

    @Override
    public float floatValue() {
        return ((float) numerator) / denominator;
    }

    @Override
    public double doubleValue() {
        return ((double) numerator) / denominator;
    }
}
