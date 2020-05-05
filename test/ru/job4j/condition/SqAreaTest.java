package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
    public void p4k1() {
        double result = SqArea.square(4, 1);
        double expected = 1.0;
        Assert.assertEquals(result, expected, 0.01);
    }

    @Test
    public void p6k2() {
        double result = SqArea.square(6, 2);
        double expected = 2.0;
        Assert.assertEquals(result, expected, 0.01);
    }

}