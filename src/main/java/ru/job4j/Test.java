package ru.job4j;

public class Test {

    public static int answer(int a, int b, int c) {
       if (a>b) {
          System.out.println("Да. Верно");
       }

    public static void main(String[] args) {
        int rsl = Test.answer(6 , 4, 9);
        System.out.println( rsl );
    }
}
