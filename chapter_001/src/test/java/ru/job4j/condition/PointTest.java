package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PointTest {
    @Test
    public void whenAddOnePlusOneThenTwo() {
        Point point1 = new Point(5, 10);
        Point point2 = new Point(1, 1);
        double result = point1.distanceTo(point2);
        double expected = 9.848857801796104;
        assertThat(result, is(expected));
    }
}