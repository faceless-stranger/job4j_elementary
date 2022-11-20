package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        for (int index = 0; index < data.length; index++) {
            if (data[index] != data[0]) {
             return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        boolean[] test = new boolean[] {false, false, false};
        System.out.println(mono(test));
    }
}