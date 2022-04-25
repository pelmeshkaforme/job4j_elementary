package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PrimeNumberTest {

    @Test
    public void whenUpTo3Then2() {
        int number = 3;
        int rsl = PrimeNumber.calc(number);
        int extended = 2;
        Assert.assertEquals(extended, rsl);
    }

    @Test
    public void whenUpTo2Then1() {
        int number = 2;
        int rsl = PrimeNumber.calc(number);
        int extended = 1;
        Assert.assertEquals(extended, rsl);
    }

    @Test
    public void whenUpTo11Then5() {
        int number = 11;
        int rsl = PrimeNumber.calc(number);
        int extended = 5;
        Assert.assertEquals(extended, rsl);
    }
}