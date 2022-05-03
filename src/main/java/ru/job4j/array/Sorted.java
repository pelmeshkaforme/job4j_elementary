package ru.job4j.array;

public class Sorted {

    public static boolean isSorted(int[] array) {
        boolean rsl = true;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                rsl =  false;
                break;
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        int[] data = {2, 2, 2, 5};
        System.out.println(isSorted(data));
    }
}
