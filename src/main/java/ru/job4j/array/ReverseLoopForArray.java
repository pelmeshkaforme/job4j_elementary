package ru.job4j.array;

public class ReverseLoopForArray {
    public static void main(String[] args) {
        int[] one = new int[] {1, 2, 3, 4, 5, 6, 7, 8};
        for (int i = 0; i < one.length; i++) {
            System.out.println("Вывод элемента массива с последнего - "
                    + one[one.length - 1 - i]);
        }
    }
}
