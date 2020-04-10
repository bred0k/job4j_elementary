package ru.job4j;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.condition.Point;

public class PointTest {

    @Test
    public void distance() {
        double in = Point.distance(5, 4, 2, 8);
        double expected = 5;
        double out = Point.distance(5, 4, 2, 8);
        Assert.assertEquals(expected, out, 0.01);

    }
}



