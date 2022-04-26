package ru.job4j.loop;

public class SectionCount {

    public static int count(int length, int section) {
        int sum = 0;
        while (sum <= length) {
            sum = sum + section;
        }
        return sum / section - 1;
    }

    public static void main(String[] args) {
        System.out.println(count(1, 1));
        System.out.println(count(2, 1));
        System.out.println(count(3, 2));
        System.out.println(count(4, 2));
    }
}
