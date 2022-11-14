package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
           int cloud = array[i];
           array[i] = array[array.length - 1 - i];
           array[array.length - 1 - i] =  cloud;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] test = new int[] {1, 2, 3, 4};
        System.out.println(back(test));
    }
}