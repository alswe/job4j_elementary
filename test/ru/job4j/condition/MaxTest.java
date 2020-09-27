package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax1To1Then1() {
        int result = Max.max(1, 1);
        assertThat(result, is(1));
    }

    @Test
    public void whenMax2To1Then1() {
        int result = Max.max(2, 1);
        assertThat(result, is(2));
    }

    @Test
    public void maxOfThree() {
        assertThat(Max.max(0,0,0), is(0));

        assertThat(Max.max(1,0,0), is(1));
        assertThat(Max.max(0,1,0), is(1));
        assertThat(Max.max(0,0,1), is(1));

        assertThat(Max.max(1,2,3), is(3));
        assertThat(Max.max(1,3,2), is(3));
        assertThat(Max.max(3,2,1), is(3));
    }

    @Test
    public void maxOfFour() {
        assertThat(Max.max(0,0,0, 0), is(0));

        assertThat(Max.max(1,0,0, 0), is(1));
        assertThat(Max.max(0,1,0, 0), is(1));
        assertThat(Max.max(0,0,1, 0), is(1));
        assertThat(Max.max(0,0,0, 1), is(1));

        assertThat(Max.max(1,2,3, 4), is(4));
        assertThat(Max.max(1,2,4, 3), is(4));
        assertThat(Max.max(1,4,2, 3), is(4));
        assertThat(Max.max(4,1,2, 3), is(4));
    }

}