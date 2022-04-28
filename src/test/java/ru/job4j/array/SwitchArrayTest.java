package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SwitchArrayTest {

    @Test
    public void whenSwap0To3() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int dest = input.length - 1;
        int[] rsl = SwitchArray.swap(input, source, dest);
        int[] expected = {4, 2, 3, 1};
        Assert.assertArrayEquals(expected, rsl);
    }

    @Test
    public void whenSwap4To6() {
        int[] input = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int source = 4;
        int dest = 6;
        int[] rsl = SwitchArray.swap(input, source, dest);
        int[] expected = {1, 2, 3, 4, 7, 6, 5, 8, 9};
        Assert.assertArrayEquals(expected, rsl);
    }
}