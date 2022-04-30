package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixCheckTest {

    @Test
    public void whenRowIsMonoThenTrue() {
        char[][] input = {
                {' ', ' '},
                {'X', 'X', 'X'},
                {' ', ' '}
        };
        int row = 1;
        boolean rsl = MatrixCheck.monoHorizontal(input, row);
        Assert.assertTrue(rsl);
    }

    @Test
    public void whenRowIsNotMonoThenFalse() {
        char[][] input = {
                {' ', ' '},
                {'X', 'X', 'X'},
                {' ', ' '}
        };
        int row = 2;
        boolean rsl = MatrixCheck.monoHorizontal(input, row);
        Assert.assertFalse(rsl);
    }

    @Test
    public void whenCellIsMonoThenTrue() {
        char[][] input = {
                {'X', ' ', 'X'},
                {'X', 'X', 'X'},
                {' ', ' ', 'X'}
        };
        int cell = 2;
        boolean rsl = MatrixCheck.monoVertical(input, cell);
        Assert.assertTrue(rsl);
    }

    @Test
    public void whenCellIsNotMonoThenFalse() {
        char[][] input = {
                {'X', ' ', 'X'},
                {'X', 'X', 'X'},
                {' ', ' ', 'X'}
        };
        int cell = 0;
        boolean rsl = MatrixCheck.monoVertical(input, cell);
        Assert.assertFalse(rsl);
    }

    @Test
    public void whenDiaFullOne() {
        char[][] input = {
                {'1', ' ', 'X'},
                {'X', '1', 'X'},
                {' ', ' ', '1'}
        };
        char[] rsl = MatrixCheck.extractDiagonal(input);
        char[] expected = {'1', '1', '1'};
        Assert.assertArrayEquals(expected, rsl);
    }

    @Test
    public void whenDiaFullX() {
        char[][] input = {
                {'X', ' ', 'X'},
                {'X', 'X', 'X'},
                {' ', ' ', 'X'}
        };
        char[] rsl = MatrixCheck.extractDiagonal(input);
        char[] expected = {'X', 'X', 'X'};
        Assert.assertArrayEquals(expected, rsl);
    }

    @Test
    public void whenDiaMix() {
        char[][] input = {
                {'Q', ' ', 'X'},
                {'X', 'T', 'X'},
                {' ', ' ', '1'}
        };
        char[] rsl = MatrixCheck.extractDiagonal(input);
        char[] expected = {'Q', 'T', '1'};
        Assert.assertArrayEquals(expected, rsl);
    }

    @Test
    public void whenWinCellPresentThenTrue() {
        char[][] input = {
                {'X', 'X', ' ', ' ', ' '},
                {'X', ' ', ' ', ' ', ' '},
                {'X', ' ', ' ', ' ', ' '},
                {'X', ' ', ' ', ' ', ' '},
                {'X', ' ', ' ', ' ', ' '}
        };
        boolean rsl = MatrixCheck.isWin(input);
        Assert.assertTrue(rsl);
    }

    @Test
    public void whenWinRowPresentThenTrue() {
        char[][] input = {
                {' ', 'X', ' ', ' ', ' '},
                {'X', ' ', ' ', ' ', ' '},
                {'X', ' ', ' ', ' ', ' '},
                {'X', 'X', 'X', 'X', 'X'},
                {'X', ' ', ' ', ' ', ' '}
        };
        boolean rsl = MatrixCheck.isWin(input);
        Assert.assertTrue(rsl);
    }

    @Test
    public void whenNoWinThenFalse() {
        char[][] input = {
                {' ', 'X', ' ', 'X', ' '},
                {'X', 'X', 'X', ' ', 'X'},
                {' ', ' ', ' ', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {'X', ' ', ' ', 'X', ' '}
        };
        boolean rsl = MatrixCheck.isWin(input);
        Assert.assertFalse(rsl);
    }
}