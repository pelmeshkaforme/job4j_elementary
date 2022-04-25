package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MortgageTest {

    @Test
    public void when3YearsRequired() {
        double amount = 100;
        int salary = 50;
        double percent = 0.2;
        int rsl = Mortgage.year(amount, salary, percent);
        int expected = 3;
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void when0Years() {
        double amount = 100;
        int salary = 10;
        double percent = 0.5;
        int rsl = Mortgage.year(amount, salary, percent);
        int expected = 0;
        Assert.assertEquals(expected, rsl);
    }
}