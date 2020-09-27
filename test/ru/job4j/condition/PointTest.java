package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void distance0020() {
        Point first = new Point(0, 0);
        Point second = new Point(2, 0);
        double result = first.distance(second);
        double expected = 2.0;
        Assert.assertEquals(result, expected, 0.01);
    }

    @Test
    public void distancem1m111() {
        Point first = new Point(-1, -1);
        Point second = new Point(1, 1);
        double result = first.distance(second);
        double expected = 2.828;
        Assert.assertEquals(result, expected, 0.01);
    }

    @Test
    public void distance1133() {
        Point first = new Point(1, 1);
        Point second = new Point(3, 3);
        double result = first.distance(second);
        double expected = 2.828;
        Assert.assertEquals(result, expected, 0.01);
    }

}