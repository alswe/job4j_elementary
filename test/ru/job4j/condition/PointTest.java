package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void distance0020() {
        double result = Point.distance(0, 0, 2, 0);
        double expected = 2.0;
        Assert.assertEquals(result, expected, 0.01);
    }

    @Test
    public void distancem1m111() {
        double result = Point.distance(-1, -1, 1, 1);
        double expected = 2.828;
        Assert.assertEquals(result, expected, 0.01);
    }

    @Test
    public void distance1133() {
        double result = Point.distance(1, 1, 3, 3);
        double expected = 2.828;
        Assert.assertEquals(result, expected, 0.01);
    }
}