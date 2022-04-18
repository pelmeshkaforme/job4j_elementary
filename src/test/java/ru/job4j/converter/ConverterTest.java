package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;

public class ConverterTest {

    @Test
    public void whenConvert140RubleThen2Euro() {
        float in = 140;
        float expected = 2;
        float out = Converter.ruToEu(in);
        float eps = 0.0001F;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void whenConvert180RubleThen3Dollar() {
        float in = 180;
        float expected = 3;
        float out = Converter.ruToDol(in);
        float eps = 0.0001F;
        Assert.assertEquals(expected, eps, out);

    }

    @Test
    public void whenConvert140EuroThen9800Ruble() {
        float in = 140;
        float expected = 9800;
        float out = Converter.euToRu(in);
        float eps = 0.0001F;
        Assert.assertEquals(expected, eps, out);
    }

    @Test
    public void whenConvert140DollarThen8400Ruble() {
        float in = 140;
        float expected = 8400;
        float out = Converter.dolToRu(in);
        float eps = 0.0001F;
        Assert.assertEquals(expected, eps, out);
    }
}