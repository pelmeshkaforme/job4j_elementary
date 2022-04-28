package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TurnTest {

    @Test
    public void whenQtyOfElementsIsEven() {
        int[] input = {1, 2, 3, 4, 5, 6};
        int[] rsl = Turn.back(input);
        int[] expected = {6, 5, 4, 3, 2, 1};
        Assert.assertArrayEquals(expected, rsl);
    }

    @Test
    public void whenQtyOfElementsIsNotEven() {
        int[] input = {1, 2, 3, 4, 5, 6, 7};
        int[] rsl = Turn.back(input);
        int[] expected = {7, 6, 5, 4, 3, 2, 1};
        Assert.assertArrayEquals(expected, rsl);
    }
}