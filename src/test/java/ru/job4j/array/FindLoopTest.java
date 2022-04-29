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

    @Test
    public void whenSearch6From2To6Then3() {
        int[] data = {1, 4, 5, 6, 8, 7, 5, 4};
        int element = 6;
        int rsl = FindLoop.searchBetween(data, 6, 2, 6);
        int expected = 3;
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenSearch4From3To7ThenMinus1() {
        int[] data = {1, 4, 5, 6, 8, 7, 5, 3, 6};
        int element = 4;
        int rsl = FindLoop.searchBetween(data, 4, 3, 7);
        int expected = -1;
        Assert.assertEquals(expected, rsl);
    }
}