package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when00To20Then2() {
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double expected = 2;
        double rsl = a.distance(b);
        Assert.assertEquals(expected, rsl, 0.01);
    }

    @Test
    public void when11To17Then6() {
        Point a = new Point(1, 1);
        Point b = new Point(1, 7);
        double expected = 6;
        double rsl = a.distance(b);
        Assert.assertEquals(expected, rsl, 0.01);
    }
}