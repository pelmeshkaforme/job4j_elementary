package ru.job4j.loop;

public class ProstoeOrNeprostoe {

        public static void check(int number) {
            int rsl;
            for (int i = 2; i <= number - 1; i++) {
                rsl = number % i;
                if (rsl == 0) {
                    System.out.println("Заданное число - не простое");
                    break;
                }
                if (i == number - 1) {
                    System.out.println("Заданное число - простое");
                }
            }
        }

        public static void main(String[] args) {
            check(5);
            check(9);
            check(11);
            check(20);
            check(21);
            check(22);
        }
    }
