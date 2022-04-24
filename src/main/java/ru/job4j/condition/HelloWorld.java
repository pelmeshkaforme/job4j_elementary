package ru.job4j.condition;

public class HelloWorld {

    public static String checkNumber(int number) {
        String msg = "Operation not support.";
        if (number % 3 == 0 && number % 5 == 0) {
            msg = "Hello, World!!!";
        } else if (number % 5 == 0) {
            msg = "World";
        } else if (number % 3 == 0) {
            msg = "Hello";
        }
        return msg;
    }

    public static void main(String[] args) {
        System.out.println(checkNumber(9));
        System.out.println(checkNumber(50));
        System.out.println(checkNumber(15));
        System.out.println(checkNumber(4));
        System.out.println(checkNumber(7));
    }
}
