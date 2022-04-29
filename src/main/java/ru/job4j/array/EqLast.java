package ru.job4j.array;

public class EqLast {

    public static boolean check(int[] left, int[] right) {
        return left[left.length - 1] == right[right.length - 1];
    }

    public static void main(String[] args) {
        int[] left = {1, 1, 4, 6};
        int[] right = {1, 2, 4, 6};
         System.out.println(check(left, right));
    }
}
