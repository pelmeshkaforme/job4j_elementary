package ru.job4j.array;

import java.util.Arrays;

public class Machine {

    public static int[] change(int money, int price) {
        int[] rsl = new int[100];
        int size = 0;
        int[] coins = {1, 2, 5, 10};
        int change = money - price;
        for (int i = 0; i < coins.length; i++) {
            while (change >= coins[coins.length - 1 - i]) {
                    rsl[size] = coins[coins.length - 1 - i];
                    change -= coins[coins.length - 1 - i];
                    size += 1;
            }
        }
        return Arrays.copyOf(rsl, size);
    }

    public static void main(String[] args) {
        int[] rsl = change(100, 99);
        for (int i = 0; i < rsl.length; i++) {
            System.out.print(rsl[i] + " ");
        }
    }
}
