package ru.job4j.loop;

public class PrimeNumber {

    public static int calc(int finish) {
        int count = 0;
        for (int i = 1; i <= finish; i++) {
            if (CheckPrimeNumber.check(i)) {
                count += 1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println("Количество простых чисел - " + calc(11));
        System.out.println("Количество простых чисел - " + calc(3));
        System.out.println("Количество простых чисел - " + calc(5));
        System.out.println("Количество простых чисел - " + calc(7));
        System.out.println("Количество простых чисел - " + calc(14));
    }
}
