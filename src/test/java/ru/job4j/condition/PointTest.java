package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when00To20Then2() {
        double expected = 2;
        double out = Point.distance(0, 2, 0, 0);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when00To100Then10() {
        double expected = 10;
        double out = Point.distance(0, 0, 10, 0);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when00To010Then10() {
        double expected = 10;
        double out = Point.distance(0, 0, 0, 10);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when1000To00Then100() {
        double expected = 100;
        double out = Point.distance(100, 0, 0, 0);
        Assert.assertEquals(expected, out, 0.01);
    }
}