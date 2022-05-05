package ru.job4j.condition;

    public class Game {

        public static int checkGame(double percent, int prize, int pay) {
           double rsl = percent * prize - pay > 0 ? percent * prize - pay : 0;
            return (int) rsl;
        }

        public static void main(String[] args) {
            System.out.println(checkGame(0.5, 20, 10));
            System.out.println(checkGame(0.5, 20, 9));
            System.out.println(checkGame(0.3, 50, 9));
        }
    }



