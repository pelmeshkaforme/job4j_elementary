package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixSumTest {

    @Test
    public void whenSum5() {
        int[][] input = {
                {5}
        };
        int rsl = MatrixSum.sum(input);
        int expected = 5;
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenSum9() {
        int[][] input = {
                {1, 1, 1},
                {5},
                {0, 0, 0, 1}
        };
        int rsl = MatrixSum.sum(input);
        int expected = 9;
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenSum0() {
        int[][] input = {
                {0, 0},
                {0, 0},
                {0, 0, 0}
        };
        int rsl = MatrixSum.sum(input);
        int expected = 0;
        Assert.assertEquals(expected, rsl);
    }
}