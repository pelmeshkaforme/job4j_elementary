package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        int result = left == right ? left : 0;
        result = left > right ? left : right;
        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
        Max.max(25, 10);
        Max.max(1, 15);
        Max.max(100, 100);
    }
}
