package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixTest {

    @Test
    public void when2On2() {
        int input = 2;
        int[][] rsl = Matrix.multiply(input);
        int[][] expected = {
                {1, 2},
                {2, 4}
        };
        Assert.assertArrayEquals(expected, rsl);
    }

    @Test
    public void when5On5() {
        int input = 5;
        int[][] rsl = Matrix.multiply(input);
        int[][] expected = {
                {1, 2, 3, 4, 5},
                {2, 4, 6, 8, 10},
                {3, 6, 9, 12, 15},
                {4, 8, 12, 16, 20},
                {5, 10, 15, 20, 25}
        };
        Assert.assertArrayEquals(expected, rsl);
    }
}