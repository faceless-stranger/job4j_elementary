package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = data[1];
        for (int index = 1; index < data.length; index++) {
            if (data[index] != result) {
             return false;
            }
        }
        return result;
    }
}