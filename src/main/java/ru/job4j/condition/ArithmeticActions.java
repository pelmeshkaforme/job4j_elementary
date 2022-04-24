package ru.job4j.condition;

public class ArithmeticActions {

    public static String selectAction(double first, double second, double rsl) {
        String show = "none";
        if (rsl == first + second) {
            show = "Added";
        } else if (rsl == first - second) {
            show = "Subtracted";
        } else if (rsl == first * second) {
            show = "Multiplied";
        } else if (rsl == first / second) {
            show = "Divided";
        }
        return show;
    }

    public static void main(String[] args) {
        System.out.println(selectAction(100, 10000, 0.1));
        System.out.println(selectAction(100, 30, 70));
        System.out.println(selectAction(5, 30, 150));
        System.out.println(selectAction(1, 2, 0.5));
        System.out.println(selectAction(100, 200, 500));
    }
}
