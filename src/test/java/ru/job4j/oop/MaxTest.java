package ru.job4j.oop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {

    @Test
    public void whenMax10To5Then10() {
        int result = Max.max(10, 5);
        assertThat(result, is(10));
    }

    @Test
    public void whenMax6To6Then6() {
        int result = Max.max(6, 6);
        assertThat(result, is(6));
    }

    @Test
    public void when1234() {
        int result = Max.max(4, 3, 2, 1);
        assertThat(result, is(4));
    }

    @Test
    public void when88310() {
        int result = Max.max(8, 8, 3, 10);
        assertThat(result, is(10));
    }

    @Test
    public void when302729() {
        int result = Max.max(30, 27, 29);
        assertThat(result, is(30));
    }
}