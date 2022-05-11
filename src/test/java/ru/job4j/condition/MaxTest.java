package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void when0And3And2And9Then9() {
        int first = 0;
        int second = 3;
        int third = 2;
        int fourth = 9;
        int result = Max.max(first, second, third, fourth);
        int expected = 9;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void when3And8Then8() {
        int first = 3;
        int second = 8;
        int result = Max.max(first, second);
        int expected = 8;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void when9And20And0Then20() {
        int first = 9;
        int second = 20;
        int third = 0;
        int result = Max.max(first, second);
        int expected = 20;
        Assert.assertEquals(result, expected);
    }
}