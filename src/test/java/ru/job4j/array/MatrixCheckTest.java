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
}