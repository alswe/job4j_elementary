package ru.job4j.calculator;

public class Fit {

    public static double manWeight(double height) {
        return (height - 100.0) * 1.15;
    }

    public static double womanWeight(double height) {
        return (height - 110.0) * 1.15;
    }

    public static void main(String[] args) {
        System.out.println("Ideal weight for a man with height of 180cm is " + Fit.manWeight(180) + " kg");
        System.out.println("Ideal weight for a woman with height of 165cm is " + Fit.womanWeight(165) + " kg");
    }

}
