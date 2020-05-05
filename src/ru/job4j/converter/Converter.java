package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
        return value / 60;
    }

    public static void main(String[] args) {
        int rouble = 200;

        int expectedEuro = 2;
        int expectedUsd = 3;

        int euro = Converter.rubleToEuro(rouble);
        boolean euroTest = expectedEuro == euro;
        System.out.println(rouble + " rubles are " + euro + " euro. Test result: " + euroTest);

        int usd = Converter.rubleToDollar(rouble);
        boolean usdTest = expectedUsd == usd;
        System.out.println(rouble + " rubles are " + usd + " USD. Test result: " + usdTest);
    }
}
