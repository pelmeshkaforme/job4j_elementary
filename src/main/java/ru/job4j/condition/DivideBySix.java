package ru.job4j.condition;

public class DivideBySix {

    public static String checkNumber(int number) {
        String rsl;
        if (number % 3 == 0 && number % 2 == 0) {
                rsl = "Введенное число делится на 6";
            } else if (number % 3 == 0) {
                rsl = "Введенное число делится на 3, но не является четным";
            } else if (number % 2 == 0) {
                rsl = "Введенное число является четным, но не делится на 3";
            } else {
                rsl = "Введенное число является нечетным и не делится на 3";
        }
        return rsl;
    }

    public static void main(String[] args) {
        System.out.println(checkNumber(12));
        System.out.println(checkNumber(15));
        System.out.println(checkNumber(14));
        System.out.println(checkNumber(17));
    }
}
