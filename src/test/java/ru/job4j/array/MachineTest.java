package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MachineTest {

    @Test
    public void whenEquals() {
        int money = 100;
        int price = 100;
        int[] rsl = Machine.change(money, price);
        int[] expected = {};
        Assert.assertArrayEquals(expected, rsl);
    }

    @Test
    public void when100By42() {
        int money = 100;
        int price = 42;
        int[] rsl = Machine.change(money, price);
        int[] expected = {10, 10, 10, 10, 10, 5, 2, 1};
        Assert.assertArrayEquals(expected, rsl);
    }

    @Test
    public void when100By61() {
        int money = 100;
        int price = 61;
        int[] rsl = Machine.change(money, price);
        int[] expected = {10, 10, 10, 5, 2, 2};
        Assert.assertArrayEquals(expected, rsl);
    }

    @Test
    public void when50By17() {
        int money = 50;
        int price = 17;
        int[] rsl = Machine.change(money, price);
        int[] expected = {10, 10, 10, 2, 1};
        Assert.assertArrayEquals(expected, rsl);
    }
}