package ru.job4j.array;

public class Merge {

    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        for (int i = 0; i < left.length; i++) {
            rsl[i] = left[i];
        }
        for (int i = 0; i < right.length; i++) {
            rsl[left.length + i] = right[i];
        }
        return rsl;
    }

    public static void main(String[] args) {
        int[] left = {1, 0};
        int[] right = {2, 4};
        int[] rsl = merge(left, right);
        for (int number : rsl) {
            System.out.println(number);
        }
    }
}
