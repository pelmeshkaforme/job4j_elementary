package ru.job4j.array;

public class OddPrint {

    public static void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.println(array[i]);
            }
        }
    }

    public static void printEven(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[array.length - 1 - i] % 2 == 0) {
                System.out.println(array[array.length - 1 - i]);
            }

        }
    }

    public static void main(String[] args) {
        int[] array = {1, 4, 5, 6, 3, 4, 2, 8};
        print(array);
        printEven(array);
    }
}
