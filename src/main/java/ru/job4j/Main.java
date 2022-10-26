package ru.job4j;

public class Main {
    public static int func1(int x) {
        int y = x * x + 1;
        return y;
    }

    public static void main(String[] args) {
        int result3 = Main.func1(100);
        System.out.println(result3);
    }
}