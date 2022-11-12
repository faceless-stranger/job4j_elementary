package ru.job4j.loop;

public class PrimeNumber {

    public static void main(String[] args) {
        System.out.println(calc(25));
    }

    public static int calc(int finish) {
        int index = 0;
        for (int i = 2; i <= finish; i++) {
            if (CheckPrimeNumber.check(i)) {
                index++;
            }
        }
        return index;
    }
}
