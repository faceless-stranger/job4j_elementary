package ru.job4j.converter;

public class Converter {

    public static float rubToEur(float data) {
        float rsl = data / 70;
        return rsl;
    }

    public static float eurToRub(float data) {
        float rsl = data * 70;
        return rsl;
    }

    public static float rubToDol(float data) {
        float rsl = data / 60;
        return rsl;
    }

    public static float dolToRub(float data) {
        float rsl = data * 60;
        return rsl;
    }

    public static void main(String[] args) {
        float rubToEur = Converter.rubToEur(140);
        System.out.println("140 rubles are " + rubToEur + " euro.");
        float in = 140;
        float expected = 2;
        float out = Converter.rubToEur(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);

        float eurToRub = Converter.eurToRub(5);
        System.out.println("5 euro are " + eurToRub + " rubles.");
        in = 5;
        expected = 350;
        out = Converter.eurToRub(in);
        passed = expected == out;
        System.out.println("5 euro are 350. Test result : " + passed);

        float rubToDol = Converter.rubToDol(1200);
        System.out.println("1200 rubles are " + rubToDol + " dollars.");
        in = 1200;
        expected = 20;
        out = Converter.rubToDol(in);
        passed = expected == out;
        System.out.println("1031 rubles are 16. Test result : " + passed);

        float dolToRub = Converter.dolToRub(10);
        System.out.println("10 dollars are " + dolToRub + " rubles.");
        in = 10;
        expected = 600;
        out = Converter.dolToRub(in);
        passed = expected == out;
        System.out.println("10 dollars are 600. Test result : " + passed);
    }
}