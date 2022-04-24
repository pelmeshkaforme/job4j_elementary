package ru.job4j.condition;

public class WeeklySalary {

    public static int calculate(int[] hours) {
        int day1;
        if (hours[0] < 8) {
            day1 = hours[0] * 10;
        } else {
            day1 = (hours[0] - hours[0] % 8) * 10 + hours[0] % 8 * 15;
        }
        int day2;
        if (hours[0] < 8) {
            day2 = hours[1] * 10;
        } else {
            day2 = (hours[1] - hours[1] % 8) * 10 + hours[1] % 8 * 15;
        }
        int day3;
        if (hours[2] < 8) {
            day3 = hours[2] * 10;
        } else {
            day3 = (hours[2] - hours[2] % 8) * 10 + hours[2] % 8 * 15;
        }
        int day4;
        if (hours[3] < 8) {
            day4 = hours[3] * 10;
        } else {
            day4 = (hours[3] - hours[3] % 8) * 10 + hours[3] % 8 * 15;
        }
        int day5;
        if (hours[4] < 8) {
            day5 = hours[4] * 10;
        } else {
            day5 = (hours[4] - hours[4] % 8) * 10 + hours[4] % 8 * 15;
        }
        int day6;
        if (hours[5] < 8) {
            day6 = hours[5] * 20;
        } else {
            day6 = (hours[5] - hours[5] % 8) * 20 + hours[5] % 8 * 30;
        }
        int day7;
        if (hours[6] < 8) {
            day7 = hours[6] * 20;
        } else {
            day7 = (hours[6] - hours[6] % 8) * 20 + hours[6] % 8 * 30;
        }
        return day1 + day2 + day3 + day4 + day5 + day6 + day7;
    }

    public static void main(String[] args) {
        int[] hours1 = {9, 9, 0, 0, 0, 2, 0};
        System.out.println(calculate(hours1));
    }
}
