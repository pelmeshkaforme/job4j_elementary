package ru.job4j.condition;

public class LogicNot {

    public static boolean isEven(int num) {
        boolean rsl = num % 2 == 0;
        System.out.println(rsl);
        return rsl;
    }

    public static boolean isPositive(int num) {
        boolean rsl = num > 0;
        System.out.println(rsl);
        return rsl;
    }

    public static boolean notEven(int num) {
        boolean rsl = !(num % 2 == 0);
        System.out.println(rsl);
        return rsl;
    }

    public static boolean notPositive(int num) {
        boolean rsl = !(num > 0);
        System.out.println(rsl);
        return rsl;
    }

    public static boolean notEvenAndPositive(int num) {
        boolean rsl = !(num % 2 == 0) && (num > 0);
        System.out.println(rsl);
        return rsl;
    }

    public static boolean evenOrNotPositive(int num) {
        boolean rsl = (num % 2 == 0) || !(num > 0);
        System.out.println(rsl);
        return rsl;
    }

    public static void main(String[] args) {
        LogicNot.isEven(9);
        LogicNot.isPositive(-10);
        LogicNot.notEven(10);
        LogicNot.notPositive(5);
        LogicNot.notEvenAndPositive(-6);
        LogicNot.evenOrNotPositive(1);
    }
}
