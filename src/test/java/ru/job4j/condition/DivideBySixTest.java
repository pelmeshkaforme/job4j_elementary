package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DivideBySixTest {

    @Test
    public void whenNumberDivideBy6() {
        int in = 12;
        String result = DivideBySix.checkNumber(in);
        String expected = "Введенное число делится на 6";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenNumberDivideBy3ButNotEven() {
        int in = 15;
        String result = DivideBySix.checkNumber(in);
        String expected = "Введенное число делится на 3, но не является четным";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenNumberEvenButNotDivideBy3() {
        int in = 14;
        String result = DivideBySix.checkNumber(in);
        String expected = "Введенное число является четным, но не делится на 3";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenNumberNotEvenAndNotDivideBy3() {
        int in = 17;
        String result = DivideBySix.checkNumber(in);
        String expected = "Введенное число является нечетным и не делится на 3";
        Assert.assertEquals(expected, result);
    }
}