package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Counter1Test {

    @Test
    public void whenSumEvenFrom0To10Then30() {
        int start = 0;
        int finish = 10;
        int rsl = Counter1.sumByEven(start, finish);
        int expected = 30;
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenSumFrom5To9Then35() {
        int start = 5;
        int finish = 9;
        int rsl = Counter1.sum(start, finish);
        int expected = 35;
        Assert.assertEquals(expected, rsl);
    }
}