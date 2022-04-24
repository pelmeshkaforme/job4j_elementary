package ru.job4j.loop;

public class Counter1 {

    public static int sum(int start, int finish) {
        int sum = 0;
        for (int i = start; i <= finish; i++) {
            sum = sum + i;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum(3, 6));
        System.out.println(sum(5, 9));
        System.out.println(sum(8, 3));
    }
}
