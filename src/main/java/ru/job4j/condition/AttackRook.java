package ru.job4j.condition;

public class AttackRook {

    public static boolean check(String left, String right) {
        return left.charAt(0) == right.charAt(0) || left.charAt(1) == right.charAt(1);
    }

    public static void main(String[] args) {
        System.out.println(check("C7", "F1"));
        System.out.println(check("A2", "H4"));
        System.out.println(check("C2", "F1"));
        System.out.println(check("C1", "F1"));
        System.out.println(check("D1", "A1"));
        System.out.println(check("F1", "H1"));
        System.out.println(check("C1", "F2"));
    }
}
