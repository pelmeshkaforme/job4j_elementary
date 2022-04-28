package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class EqLastTest {

    @Test
    public void whenEq() {
        int[] left = {1, 3, 3};
        int[] right = {2, 3, 3};
        boolean rsl = EqLast.check(left, right);
        Assert.assertTrue(rsl);
    }

    @Test
    public void whenNotEq() {
        int[] left = {0, 0, 0};
        int[] right = {2, 3, 3};
        boolean rsl = EqLast.check(left, right);
        Assert.assertFalse(rsl);
    }
}