package ru.job4j.array;

public class LengthArrayArrays {
    public static void main(String[] args) {
        int[][] array = {{9}, {3, 5}, {7, 8, 9}, {1, 1, 4, 0}};
        for (int i = 0; i < array.length; i++) {
            System.out.println("Размер вложенного массива равен " + array[i].length);
        }
    }
}
