package ru.сourses.kulinaria;

public enum Sharpness {
    HARD("Очень острый"),
    MEDIUM("Острый"),
    LOW("Не острый");

    private final String name;

    Sharpness(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}