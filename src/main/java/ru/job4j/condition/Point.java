package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double one = x2 - x1;
        double two = y2 - y1;
        double three = Math.pow(one, 2) + Math.pow(two, 2);
        double seven = Math.sqrt(three);
        double rsl = seven;
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(10, 5, 2, 5);
        System.out.println("result (0, 0) to (2, 0) " + result);
    }
}