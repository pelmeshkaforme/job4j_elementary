package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortSelectedTest {

    @Test
    public void whenSorted5Elements() {
        int[] input = {1, 7, 0, 3, 5};
        int[] rsl = SortSelected.sort(input);
        int[] expected = {0, 1, 3, 5, 7};
        Assert.assertArrayEquals(expected, rsl);
    }

    @Test
    public void whenSorted3Elements() {
        int[] input = {9, 7, 5};
        int[] rsl = SortSelected.sort(input);
        int[] expected = {5, 7, 9};
        Assert.assertArrayEquals(expected, rsl);
    }
}