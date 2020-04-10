package ru.job4j;

import org.junit.Test;
import ru.job4j.condition.Max;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(5, 4);
        assertThat(result, is(5));
    }

    @Test
    public void whenMax2To1Then2() {
        int result = Max.max(4, 5);
        assertThat(result, is(4));
    }
    @Test
    public void whenMax1To1Then2() {
        int result = Max.max(5, 5);
        assertThat(result, is(5));
    }


}