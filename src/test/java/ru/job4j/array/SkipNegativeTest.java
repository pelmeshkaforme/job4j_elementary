package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SkipNegativeTest {

    @Test
    public void whenRowAndCellEquals() {
        int[][] input = {
                {1, -9, 3},
                {2, -1, -4},
                {0, 0, -4}
        };
        int[][] rsl = SkipNegative.skip(input);
        int[][] expected = {
                {1, 0, 3},
                {2, 0, 0},
                {0, 0, 0}
        };
        Assert.assertArrayEquals(expected, rsl);
    }

    @Test
    public void whenRowAndCellNotEquals() {
        int[][] input = {
                {1, -9, 3},
                {2, -1, -4, 7, -1},
                {0, 0, -4, 3, -6}
        };
        int[][] rsl = SkipNegative.skip(input);
        int[][] expected = {
                {1, 0, 3},
                {2, 0, 0, 7, 0},
                {0, 0, 0, 3, 0}
        };
        Assert.assertArrayEquals(expected, rsl);
    }
}