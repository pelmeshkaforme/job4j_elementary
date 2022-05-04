package ru.job4j.array;

public class Merge {

    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        for (int i = 0; i < left.length; i++) {
            if (left[i] <= right[i]) {
                rsl[i + i] = left[i];
                rsl[i + i + 1] = right[i];
            } else {
                rsl[i + i] = right[i];
                rsl[i + i + 1] = left[i];
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        int[] left = {1, 20, 34, 77, 79};
        int[] right = {2, 4, 5, 6, 7};
        int[] rsl = merge(left, right);
        for (int number : rsl) {
            System.out.println(number);
        }
    }
}
