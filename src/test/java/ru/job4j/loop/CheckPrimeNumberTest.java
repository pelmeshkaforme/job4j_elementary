package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckPrimeNumberTest {

    @Test
    public void when5ThenTrue() {
        int number = 5;
        boolean rsl = CheckPrimeNumber.check(number);
        boolean extended = true;
        Assert.assertEquals(extended, rsl);
    }

    @Test
    public void when2ThenFalse() {
        int number = 2;
        boolean rsl = CheckPrimeNumber.check(number);
        boolean extended = true;
        Assert.assertEquals(extended, rsl);
    }

    @Test
    public void when1ThenFalse() {
        int number = 1;
        boolean rsl = CheckPrimeNumber.check(number);
        boolean extended = false;
        Assert.assertEquals(extended, rsl);
    }
}