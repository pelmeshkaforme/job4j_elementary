package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MinTest {

    @Test
    public void whenFirstMin() {
        int[] data = {1, 2, 4, 6};
        int rsl = Min.findMin(data);
        int expected = 1;
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenFLastMin() {
        int[] data = {7, 3, 4, 2};
        int rsl = Min.findMin(data);
        int expected = 2;
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenMiddleMin() {
        int[] data = {1, 0, 4, 6};
        int rsl = Min.findMin(data);
        int expected = 0;
        Assert.assertEquals(expected, rsl);
    }
}