package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MinDiapasonTest {

    @Test
    public void whenMinFirst() {
        int[] data = {1, 2, 3, 4, 7, 8, 9, 0};
        int from = 3;
        int to = 6;
        int rsl = MinDiapason.findMin(data, from, to);
        int expended = 4;
        Assert.assertEquals(expended, rsl);
    }

    @Test
    public void whenMinLast() {
        int[] data = {1, 2, 3, 4, 7, 1, 9, 0};
        int from = 2;
        int to = 5;
        int rsl = MinDiapason.findMin(data, from, to);
        int expended = 1;
        Assert.assertEquals(expended, rsl);
    }

    @Test
    public void whenMinInMiddle() {
        int[] data = {1, 2, 3, 4, 7, 1, 9, 0};
        int from = 3;
        int to = 6;
        int rsl = MinDiapason.findMin(data, from, to);
        int expended = 1;
        Assert.assertEquals(expended, rsl);
    }
}