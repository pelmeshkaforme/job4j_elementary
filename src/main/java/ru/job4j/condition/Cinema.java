package ru.job4j.condition;

public class Cinema {

    public static void access(int age) {
        System.out.println("Age of the customer is " + age);
        if (age > 18) {
            System.out.println("Welcome to the cimena ");
        } else {
            System.out.println("It is not for you");
        }
    }

    public static void main(String[] args) {
        Cinema.access(16);
        Cinema.access(21);
    }
}
