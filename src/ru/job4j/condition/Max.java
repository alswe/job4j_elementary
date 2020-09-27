package ru.job4j.condition;

public class Max {

    public static int max(int first, int second) {
        return first > second ? first : second;
    }

    public static int max(int first, int second, int third) {
        int tempMax = max(first, second);
        return third > tempMax ? third : tempMax;
    }
    public static int max(int first, int second, int third, int fourth) {
        int tempMax = max(first, second, third);
        return fourth > tempMax ? fourth : tempMax;
    }

}
