package ru.job4j.calculator;

public class Fit {
    public static double manWeight(short height) {
        double rsl = (height - 100) * 1.15;
        return rsl;
    }

    public static double womanWeight(short height) {
        double rsl = (height - 110) * 1.15;
        return rsl;
    }

    public static void main(String[] args) {
        short heightM = 195;
        double man = Fit.manWeight(heightM);
        System.out.println("Man 195 is " + man);
        short heightW = 178;
        double woman = Fit.womanWeight(heightW);
        System.out.println("Woman 178 is " + woman);

    }
}
