package ru.job4j.loop;

public class CheckPrimeNumber {

    public static boolean check(int number) {
        for (int i = 2; i <= number - 1; i++) {
            if ((number % i) == 0) {
                return false;
            }
        }
        return number > 1;
    }

    public static void main(String[] args) {
        System.out.println("1- " + check(1));
        System.out.println("2- " + check(2));
        System.out.println("3- " + check(3));
        System.out.println("4- " + check(4));
        System.out.println("5- " + check(5));
        System.out.println("6- " + check(6));
        System.out.println("7- " + check(7));
    }
}

