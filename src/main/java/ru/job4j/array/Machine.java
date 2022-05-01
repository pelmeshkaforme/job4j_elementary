package ru.job4j.array;

import java.util.Arrays;

public class Machine {

    public static int[] change(int money, int price) {
        int[] rsl = new int[100];
        int size = 0;
        int[] coins = {10, 5, 2, 1};
        int change = money - price;
        for (int num : coins) {
            while (change >= num) {
                rsl[size] = num;
                change -= num;
                size += 1;
            }
        }
        return Arrays.copyOf(rsl, size);
    }

    public static void main(String[] args) {
        int[] rsl = change(100, 55);
        for (int i = 0; i < rsl.length; i++) {
            System.out.print(rsl[i] + " ");
        }
    }
}
