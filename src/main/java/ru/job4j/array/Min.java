package ru.job4j.array;

public class Min {

    public static int findMin(int[] data) {
        int rsl = data[0];
        for (int i = 0; i < data.length; i++) {
            if (data[i] < rsl) {
                rsl = data[i];
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        int[] data = {1, 2, 4, 0, 4, 1};
        System.out.println(findMin(data));
    }
}
