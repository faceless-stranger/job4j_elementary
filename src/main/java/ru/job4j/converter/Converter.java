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
        float in1 = 140;
        float expected1 = 2;
        float out1 = Converter.rubToEur(in1);
        boolean passed1 = expected1 == out1;
        System.out.println("140 rubles are 2. Test result : " + passed1);

        float eurToRub = Converter.eurToRub(5);
        System.out.println("5 euro are " + eurToRub + " rubles.");
        float in2 = 5;
        float expected2 = 350;
        float out2 = Converter.eurToRub(in2);
        boolean passed2 = expected2 == out2;
        System.out.println("5 euro are 350. Test result : " + passed2);

        float rubToDol = Converter.rubToDol(1031);
        System.out.println("1031 rubles are " + rubToDol + " dollars.");
        float in3 = 1031;
        double expected3 = 17.183332;
        float out3 = Converter.rubToDol(in3);
        boolean passed3 = expected2 == out2;
        System.out.println("1031 rubles are 16. Test result : " + passed3);

        float dolToRub = Converter.dolToRub(10);
        System.out.println("10 dollars are " + dolToRub + " rubles.");
        float in4 = 10;
        float expected4 = 600;
        float out4 = Converter.dolToRub(in4);
        boolean passed4 = expected2 == out2;
        System.out.println("10 dollars are 600. Test result : " + passed4);
    }
}