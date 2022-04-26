package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindLoopTest {

    @Test
    public void whenArray5Then2() {
        int[] data = {1, 4, 5, 6, 8};
        int element = 5;
        int rsl = FindLoop.indOf(data, element);
        int expected = 2;
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenArray7ThenMinus1() {
        int[] data = {1, 4, 5, 6, 8};
        int element = 7;
        int rsl = FindLoop.indOf(data, element);
        int expected = -1;
        Assert.assertEquals(expected, rsl);
    }
}