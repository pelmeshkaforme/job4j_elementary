package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class EndsWithTest {

    @Test
    public void whenEq() {
        char[] word = {'T', 'a', 'b', 'l', 'e'};
        char[] post = {'b', 'l', 'e'};
        boolean rsl = EndsWith.end(word, post);
        assertTrue(rsl);
    }

    @Test
    public void whenNotEq() {
        char[] word = {'P', 'l', 'a', 't', 'e'};
        char[] post = {'o', 't', 'e'};
        boolean rsl = EndsWith.end(word, post);
        assertFalse(rsl);
    }
}