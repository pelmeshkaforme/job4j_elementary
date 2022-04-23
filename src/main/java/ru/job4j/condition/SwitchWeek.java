package ru.job4j.condition;

public class SwitchWeek {

    public static String nameOfDay(int number) {
        String name = switch (number) {
            case 1 -> "Понедельник";
            case 2 -> "Вторник";
            case 3 -> "Среда";
            case 4 -> "Четверг";
            case 5 -> "Пятница";
            case 6 -> "Суббота";
            case 7 -> "Воскресенье";
            default -> "Ошибка - для такого числа нет дня недели";
        };
        return name;
    }

    public static void main(String[] args) {
        System.out.println(nameOfDay(1));
        System.out.println(nameOfDay(2));
        System.out.println(nameOfDay(3));
        System.out.println(nameOfDay(4));
        System.out.println(nameOfDay(5));
        System.out.println(nameOfDay(6));
        System.out.println(nameOfDay(7));
        System.out.println(nameOfDay(8));
    }
}
