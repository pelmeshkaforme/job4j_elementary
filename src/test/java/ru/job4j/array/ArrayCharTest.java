package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayCharTest {

    @Test
    public void whenWordStartWithPrefThenTrue() {
        char[] word = {'S', 'i', 'd', 'e', 's', 't', 'i', 'c', 'k'};
        char[] pref = {'S', 'i', 'd', 'e'};
        boolean rsl = ArrayChar.startWith(word, pref);
        Assert.assertTrue(rsl);
    }

    @Test
    public void whenWordNotStartWithPrefThenFalse() {
        char[] word = {'W', 'i', 'n', 'g'};
        char[] pref = {'S', 'i'};
        boolean rsl = ArrayChar.startWith(word, pref);
        Assert.assertFalse(rsl);
    }
}