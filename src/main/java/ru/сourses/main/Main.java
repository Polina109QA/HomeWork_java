package ru.сourses.main;

import java.util.Arrays;

import static ru.сourses.collections.BubbleSort.bubbleSort;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Исходный массив: " + Arrays.toString(numbers));
        bubbleSort(numbers);
        System.out.println("Отсортированный массив: " + Arrays.toString(numbers));
    }
}