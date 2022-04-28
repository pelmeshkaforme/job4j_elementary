package ru.job4j.array;

public class EqLast {

    public static boolean check(int[] left, int[] right) {
        boolean rsl = true;
        for (int i = right.length - 1; i > right.length - 3; i--) {
                if (left[i] != right[i]) {
                    rsl = false;
                    break;
                }
            }
        return rsl;
    }

    public static void main(String[] args) {
        int[] left = {1, 1, 4, 6};
        int[] right = {1, 2, 4, 6};
         System.out.println(check(left, right));
    }
}
