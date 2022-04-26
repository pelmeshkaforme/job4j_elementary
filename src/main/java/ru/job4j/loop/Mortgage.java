package ru.job4j.loop;

public class Mortgage {

    public static int year(double amount, int salary, double percent) {
        int year = 0;
        while (amount > 0) {
            amount = amount + amount * percent - salary;
            year += 1;
        }
        return year;
        }

    public static void main(String[] args) {
        System.out.println(year(50, 10, 0.1));
    }
}