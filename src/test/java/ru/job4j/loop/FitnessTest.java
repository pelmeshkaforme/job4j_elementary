package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FitnessTest {

    @Test
    public void whenIvan20AndNicola50Then3() {
        int ivan = 20;
        int nicola = 50;
        int rsl = Fitness.force(ivan, nicola);
        int expected = 3;
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenIvan10AndNicola50Then3() {
        int ivan = 10;
        int nicola = 50;
        int rsl = Fitness.force(ivan, nicola);
        int expected = 4;
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenIvan10AndNicola5Then0() {
        int ivan = 10;
        int nicola = 5;
        int rsl = Fitness.force(ivan, nicola);
        int expected = 0;
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenIvan10AndNicola10Then0() {
        int ivan = 10;
        int nicola = 10;
        int rsl = Fitness.force(ivan, nicola);
        int expected = 1;
        Assert.assertEquals(expected, rsl);
    }
}