package ru.job4j.calculator;

public class Fit {

    public static double manWeight(short height) {
        return (height - 100) * 1.15;
    }

    public static double womanWeight(short height) {
        return (height - 110) * 1.15;
    }

    public static void main(String[] args) {
        short height = 170;
        double man = Fit.manWeight(height);
        double woman = Fit.womanWeight(height);
        System.out.println("Ideal weight for man with " + height + " santimeters" + " height" + " - " + man + " kilograms");
        System.out.println("Ideal weight for woman with " + height + " santimeters" + " height" + " - " + woman + " kilograms");
    }
}

