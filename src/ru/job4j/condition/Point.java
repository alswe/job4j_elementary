package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("Distance between points (0, 0) and (2, 0) is " + result);

        double result2 = Point.distance(-1, -1, 1, 1);
        System.out.println("Distance between points (-1, -1) and (1, 1) is " + result2);

        double result3 = Point.distance(1, 1, 3, 3);
        System.out.println("Distance between points (1, 1) and (3, 3) is " + result3);

    }
}
