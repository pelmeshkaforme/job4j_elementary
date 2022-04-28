package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckTest {

    @Test
    public void whenTrueTrueTrueThenTrue() {
        boolean[] input = {true, true, true};
        boolean rsl = Check.mono(input);
        Assert.assertTrue(rsl);
    }

    @Test
    public void whenTrueFalseTrueThenFalse() {
        boolean[] input = {true, false, true};
        boolean rsl = Check.mono(input);
        Assert.assertFalse(rsl);
    }

    @Test
    public void whenTFalseFalseFalseThenTrue() {
        boolean[] input = {false, false, false};
        boolean rsl = Check.mono(input);
        Assert.assertTrue(rsl);
    }

    @Test
    public void whenTFalseTrueFalseThenFalse() {
        boolean[] input = {false, true, false};
        boolean rsl = Check.mono(input);
        Assert.assertFalse(rsl);
    }
}