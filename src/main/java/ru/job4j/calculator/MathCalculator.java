package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second) + multiply(first, second);
    }

    public static double differenceandDivision(double first, double second) {
        return difference(first, second) + division(first, second);
    }

    public static double sumAndMultiplyAndDifferenceAndDivision(double first, double second) {
        return sum(first, second) + multiply(first, second) + difference(first, second) + division(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат сложения суммы и произведения равен = " + sumAndMultiply(10, 20));
        System.out.println("Результат сложения разности и деления равен = " + differenceandDivision(10, 20));
        System.out.println("Результат сложения суммы, произведения, разности и деления равен = " + sumAndMultiplyAndDifferenceAndDivision(10, 20));
    }
}
