package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double rsl = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
        result = Point.distance(2, 4, 1, 1);
        System.out.println("result (2, 4) to (1, 1) " + result);
        result = Point.distance(6, 6, 6, 6);
        System.out.println("result (6, 6) to (6, 6) " + result);
        result = Point.distance(4, 3, 2, 0);
        System.out.println("result (4, 3) to (2, 0) " + result);
    }

}