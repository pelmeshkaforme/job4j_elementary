package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {

    @Test
    public void whenCalculateFactorialFor3Then6() {
        int number = 3;
        int rsl = Factorial.sum(number);
        int expected = 6;
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenCalculateFactorialFor0Then1() {
        int number = 0;
        int rsl = Factorial.sum(number);
        int expected = 1;
        Assert.assertEquals(expected, rsl);
    }
}