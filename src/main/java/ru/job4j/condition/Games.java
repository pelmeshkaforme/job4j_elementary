package ru.job4j.condition;

public class Games {

    public static void permit(boolean allowParents, boolean hasMoney) {
        if (allowParents && hasMoney) {
            System.out.println("I can go to club");
        } else {
            System.out.println("I can't go to club");
        }
    }

    public static void main(String[] args) {
        Games.permit(true, true);
        Games.permit(true, false);
        Games.permit(false, false);
        Games.permit(false, true);
    }
}
