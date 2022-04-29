package ru.job4j.array;

public class PrintEvenElements {

    public static String printEvenInts(int[] numbers) {
        String ln = System.lineSeparator();
        int e = numbers.length - 1;
        String rsl = "Элементы массива с четными индексами начиная с последнего - " + ln;
        for (int i = 0; i <= numbers.length; i++) {
            if (((numbers.length - 1 - i) % 2 == 0)) {
                rsl = rsl + numbers[numbers.length - 1 - i] + ln;
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(printEvenInts(numbers));
    }
}
