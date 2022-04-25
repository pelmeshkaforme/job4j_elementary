package ru.job4j.loop;

public class Factorial {

    public static int sum(int number) {
        int sum = 1;
        for (int i = 1; i <= number; i++) {
            sum = sum * i;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum(1));
    }
}
