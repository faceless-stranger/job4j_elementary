package ru.job4j.loop;

public class CheckPrimeNumber {
    public static void main(String[] args) {
        System.out.println(CheckPrimeNumber.check(5));
    }

    public static boolean check(int n) {
        boolean base = 1 < n;
        for (int i = 2; i < n - 1; i++) {
            if (n % i == 0) {
                base = false;
                break;
            }
        }
        return base;

    }
}
