package ru.job4j.calculator;

public class Calculator {

    public static void plus(int first, int second) {
        int result = first + second;

    }

    public static void main(String[] args) {
        int two = 2;
        int five = 5;
        int six = 6;
        int four = 4;
        int sixDivTwo = six / two;
        int fiveMinusTwo = five - two;
        int  fourTimeTwo = four * two;
        System.out.println(sixDivTwo);
        System.out.println(fiveMinusTwo);
        System.out.println(fourTimeTwo);
    }
}