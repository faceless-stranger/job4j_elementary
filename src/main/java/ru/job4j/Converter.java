package ru.job4j;

public class Converter {

    public static float rubToEur(float data1) {
        float rsl = data1 / 70;
        return rsl;
    }

    public static float eurToRub(float data2) {
        float rsl = data2 * 70;
        return rsl;
    }

    public static float rubToDol(float data2) {
        float rsl = data2 / 70;
        return rsl;
    }

    public static float dolToRub(float data2) {
        float rsl = data2 * 70;
        return rsl;
    }

    public static void main(String[] args) {
        float rubToEur = Converter.rubToEur(140);
        System.out.println("140 rubles are " + rubToEur + " euro.");
        float eurToRub = Converter.eurToRub(5);
        System.out.println("5 euro are " + eurToRub + " rubles.");
        float rubToDol = Converter.rubToDol(1031);
        System.out.println("1031 rubles are " + rubToDol + " dollars.");
        float dolToRub = Converter.dolToRub(10);
        System.out.println("10 dollars are " + dolToRub + " rubles.");
    }
}