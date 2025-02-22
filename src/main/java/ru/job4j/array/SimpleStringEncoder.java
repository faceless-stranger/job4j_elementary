package ru.job4j.array;

public class SimpleStringEncoder {
    public static String encode(String input) {
        StringBuilder sb = new StringBuilder();
        char symbol = input.charAt(0);
        int counter = 0;
        for (int i = 0; i < input.length(); i++) {
            if (symbol == input.charAt(i)) {
                counter++;
            } else {
                sb.append(counter > 1 ? String.valueOf(symbol) + counter : symbol);
                symbol = input.charAt(i);
                counter = 1;
            }
        }
        sb.append(counter > 1 ? String.valueOf(symbol) + counter : symbol);
        return sb.toString();
    }

    public static void main(String[] args) {

        String test = "aaabbbccc";
        System.out.println("value -" + encode(test));
        System.out.println("result - a3b3c3");
    }
}

