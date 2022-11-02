package ru.job4j.condition;

public class SqArea {
    public static double square(double p, double k) {
        double h = p / (2 * (k + 1));
        double l = h * k;
        return l * h;

    }

    public static void main(String[] args) {
        double result = SqArea.square(6, 2);
        System.out.println(" p = 6, k = 2, s = 1, real = " + result);
        result = SqArea.square(12, 3);
        System.out.println(" p = 12, k = 3, s = 1, real = " + result);
        result = SqArea.square(77, 12);
        System.out.println(" p = 77, k = 12, s = 1, real = " + result);
    }
}