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
        float rsl = data2 / 60;
        return rsl;
    }

    public static float dolToRub(float data2) {
        float rsl = data2 * 60;
        return rsl;
    }

    public static void main(String[] args) {
        float rubToEur = Converter.rubToEur(140);
        System.out.println("140 rubles are " + rubToEur + " euro.");
        float in1 = 140;
        float expected1 = 2;
        float out1 = Converter.rubToEur(140);
        boolean passed1 = expected1 == out1;
        System.out.println("140 rubles are 2. Test result : " + passed1);

        float eurToRub = Converter.eurToRub(5);
        System.out.println("5 euro are " + eurToRub + " rubles.");
        float in2 = 5;
        float expected2 = 350;
        float out2 = Converter.eurToRub(5);
        boolean passed2 = expected2 == out2;
        System.out.println("140 rubles are 2. Test result : " + passed2);

        float rubToDol = Converter.rubToDol(1000);
        System.out.println("1031 rubles are " + rubToDol + " dollars.");
        float in3 = 1031;
        float expected3 = 16;
        float out3 = Converter.rubToDol(1000);
        boolean passed3 = expected2 == out2;
        System.out.println("140 rubles are 2. Test result : " + passed3);

        float dolToRub = Converter.dolToRub(10);
        System.out.println("10 dollars are " + dolToRub + " rubles.");
        float in4 = 10;
        float expected4 = 600;
        float out4 = Converter.dolToRub(10);
        boolean passed4 = expected2 == out2;
        System.out.println("140 rubles are 2. Test result : " + passed4);
    }
}