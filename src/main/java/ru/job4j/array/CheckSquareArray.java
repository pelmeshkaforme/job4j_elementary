package ru.job4j.array;

public class CheckSquareArray {

    public static boolean check(int[][] array) {
        boolean rsl = true;
        for (int i = 0; i < array.length; i++) {
            if (array[i].length != array.length) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        int[][] data = {
                {1, 3, 4},
                {2, 3, 4, 4},
                {3, 3, 3}
        };
        System.out.println(check(data));
    }
}
