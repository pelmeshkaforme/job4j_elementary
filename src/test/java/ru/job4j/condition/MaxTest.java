package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void whenLeft25Right10ThanLeft() {
        int left = 25;
        int right = 10;
        int result = Max.max(left, right);
        int expected = 25;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenLeft10Right25ThanLeft() {
        int left = 1;
        int right = 15;
        int result = Max.max(left, right);
        int expected = 15;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenLeft100Right100ThanAny() {
        int left = 100;
        int right = 100;
        int result = Max.max(left, right);
        int expected = 100;
        Assert.assertEquals(result, expected);
    }
}