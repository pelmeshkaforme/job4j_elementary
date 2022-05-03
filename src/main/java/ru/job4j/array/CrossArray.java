package ru.job4j.array;

public class CrossArray {

    public static void printCrossEl(int[] left, int[]right) {
        for (int i = 0; i < left.length; i++) {
            for (int j = 0; j < right.length; j++) {
                if (right[j] == left[i]) {
                    System.out.println(right[j]);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] left = {1, 2, 3, 5};
        int[] right = {2, 3, 4, 0};
        printCrossEl(left, right);
    }
}
