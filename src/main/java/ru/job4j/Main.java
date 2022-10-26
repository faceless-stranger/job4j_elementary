package ru.job4j;

public class Main {
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