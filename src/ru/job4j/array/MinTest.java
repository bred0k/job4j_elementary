package ru.job4j.array;

import org.junit.Test;
import ru.job4j.array.Min;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

    public class MinTest {
        @Test
        public void whenFirstMin() {
            assertThat(
                    Min.findMin(
                            new int[] {15, 5, 10, 9, 1}
                    ),
                    is(1)
            );
        }

        @Test
        public void whenLastMin() {
            assertThat(
                    Min.findMin(
                            new int[] {10, 5, 3, 48, 55}
                    ),
                    is(3)
            );
        }

        @Test
        public void whenMiddleMin() {
            assertThat(
                    Min.findMin(
                            new int[] {10, 2, 5}
                    ),
                    is(2)
            );
        }
    }

