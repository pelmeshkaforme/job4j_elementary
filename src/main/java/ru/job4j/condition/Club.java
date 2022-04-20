package ru.job4j.condition;

public class Club {

    public static boolean club(boolean hasMoney, boolean beFriend) {
        if (hasMoney || beFriend) {
            System.out.println("You can go to club");
        } else {
            System.out.println("You can't go to club");
        }
        return hasMoney || beFriend;
    }

    public static void main(String[] args) {
        Club.club(true, true);
        Club.club(true, false);
        Club.club(false, false);
        Club.club(false, true);
    }
}
