package ru.job4j.array;

public class SummingPrevious {

    public static int[] calculate(int a, int b, int n) {
        int[] rsl = new int[n];
        rsl[0] = a;
        rsl[1] = b;
        int sum = a + b;
        for (int i = 2; i < rsl.length; i++) {
            rsl[i] = sum;
            sum += rsl[i];
        }
        return rsl;
    }

    public static void main(String[] args) {
        int[] rsl = calculate(3, 4, 7);
        for (int number : rsl) {
            System.out.println(number);
        }
    }
}
