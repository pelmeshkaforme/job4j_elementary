package ru.job4j.condition;

public class Games {

    public static boolean permit(boolean allowParents, boolean hasMoney) {
        if (allowParents && hasMoney) {
            System.out.println("I can go to club");
        } else {
            System.out.println("I can't go to club");
        }
        return allowParents && hasMoney;
    }

    public static void main(String[] args) {
        Games.permit(true, true);
        Games.permit(true, false);
        Games.permit(false, false);
        Games.permit(false, true);
    }
}
