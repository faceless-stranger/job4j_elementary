package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        int cash = money - price;
        for (int element : coins) {
            while (cash >= element) {
                cash -= element;
                rsl[size] = element;
                size++;
            }
        }
        return Arrays.copyOf(rsl, size);
    }

    public static void main(String[] args) {
        int money = 50;
        int price = 35;
        System.out.println(change(money, price));
    }
}