package ru.job4j.loop;

public class SecondSum {

    public static int sum(int a, int b) {
        int sum = 0;
        for (int i = a; i <= b; i++) {
            if ((i - a) % 2 == 0) {
                sum +=  i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum(5, 12));
    }
}
