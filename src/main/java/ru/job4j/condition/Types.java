package ru.job4j.condition;

public class Types {
    public static void main(String[] args) {
        long l = 129;
        byte b = (byte) l;
        System.out.println("Значение после преобразования Выражения 1 - " + b);
        float f = 12358.7F;
        int i = 45981;
        short rsl = (short) (f + i);
        System.out.println("Значение после преобразования Выражения 2 - " + rsl);
        char c = 45000;
        float f2 = c;
        System.out.println("Значение после преобразования Выражения 3 - " + f2);
        double d = 121.19;
        byte b1 = (byte) d;
        System.out.println("Значение после преобразования Выражения 4 - " + b1);
        short s = 1500;
        char c1 = (char) s;
        double d1 = c1;
        System.out.println("Значение после преобразования Выражения 5 - " + c1);
        System.out.println("Значение после преобразования Выражения 5 - " + d1);
    }
}
