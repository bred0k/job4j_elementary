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
        int result = Max.max(6, 6);
        assertThat(result, is(6));
    }
    @Test
    public void whenMax3To1Then3() {
        int result = Max.max(6, 5 ,8);
        assertThat(result, is(8));
    }
    @Test
    public void whenMax4To1Then4() {
        int result = Max.max(6, 5 ,8 ,15);
        assertThat(result, is(8));
    }

}