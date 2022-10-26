package ru.job4j;

public class Main {
//    public static int func1(int x) {
//        int y = x * x + 1;
//        return y;
//    }
//
////    public static void main(String[] args) {
////        int result3 = Main.func1(100);
////        System.out.println(result3);
////    }

    public static void hello(String name, int age) {
        System.out.println("Hello, " + name + ", age = " + age);
    }

    public static void main(String[] args) {
        String name = "Job4j";
        int age = 6;
        Main.hello(name, age);
        Main.hello(name, age);
        Main.hello(name, age);
        Main.hello(name, age);
    }
}