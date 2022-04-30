package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DefragmentTest {

    @Test
    public void nullFirst() {
        String[] input = {null, "I", "wanna"};
        String[] rsl = Defragment.compress(input);
        String[] expected = {"I", "wanna", null};
        Assert.assertArrayEquals(expected, rsl);
    }

    @Test
    public void nullNotFirst() {
        String[] input = {"I", null, "wanna", null, "be", null};
        String[] rsl = Defragment.compress(input);
        String[] expected = {"I", "wanna", "be", null, null, null};
        Assert.assertArrayEquals(expected, rsl);
    }

    @Test
    public void nullAll() {
        String[] input = {null, null, null};
        String[] rsl = Defragment.compress(input);
        String[] expected = {null, null, null};
        Assert.assertArrayEquals(expected, rsl);
    }

    @Test
    public void nullFirstLastMiddle() {
        String[] input = {null, null, null, "I", null, null, "wanna", null, "be", null, null, "compressed", null, null};
        String[] rsl = Defragment.compress(input);
        String[] expected = {"I", "wanna", "be", "compressed", null, null, null, null, null, null, null, null, null, null};
        Assert.assertArrayEquals(expected, rsl);
    }
}