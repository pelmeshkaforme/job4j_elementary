package ru.job4j.condition;

public class MultipleSwitchWeek {

    public static int dayNameToNumber(String dayName) {
        return switch (dayName) {
            case "Monday", "Понедельник" -> 1;
            case "Tuesday", "Вторник" -> 2;
            case "Wednesday", "Среда" -> 3;
            case "Thursday", "Четверг" -> 4;
            case "Friday", "Пятница" -> 5;
            case "Saturday", "Суббота" -> 6;
            case "Sunday", "Воскресенье" -> 7;
            default -> -1;
        };
    }

    public static void main(String[] args) {
        System.out.println(dayNameToNumber("Monday"));
        System.out.println(dayNameToNumber("Понедельник"));
        System.out.println(dayNameToNumber("Вторник"));
        System.out.println(dayNameToNumber("Sunday"));
        System.out.println(dayNameToNumber("Суббота"));
        System.out.println(dayNameToNumber("Thursday"));
        System.out.println(dayNameToNumber("Четверг"));
        System.out.println(dayNameToNumber("Проверка"));
    }
}
