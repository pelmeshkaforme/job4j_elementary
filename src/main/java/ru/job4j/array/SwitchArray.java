package ru.job4j.array;

import java.sql.SQLOutput;

public class SwitchArray {

    public static int[] swap(int[] array, int source, int dest) {
        int tempSwap = array[source];
        array[source] = array[dest];
        array[dest] = tempSwap;
        return array;
    }

    public static int[] swapBorder(int[] array) {
        int temp = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = temp;
        return array;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {0, 0, 0, 4, 0, 0, 0, 1, 0};
        int[] rsl = swapBorder(nums);
        for (int i = 0; i < rsl.length; i++) {
            System.out.print(rsl[i]);
        }
        System.out.println();
        int[] rslOfSwap = swap(nums, 3, 7);
        for (int i = 0; i < rslOfSwap.length; i++) {
            System.out.print(rslOfSwap[i]);
        }
    }
}
