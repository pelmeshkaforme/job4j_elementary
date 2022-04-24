package ru.job4j.condition;

public class BonusCupCoffee {

    public static int bonusCap(int payCap, int levelForBonusCap) {
        return payCap <= levelForBonusCap ? payCap : payCap + payCap / levelForBonusCap;

    }

    public static void main(String[] args) {
        System.out.println(bonusCap(11, 5));
    }
}
