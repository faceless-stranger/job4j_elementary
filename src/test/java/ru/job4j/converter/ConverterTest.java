package ru.job4j.converter;

import org.junit.Test;
import org.junit.Assert;

public class ConverterTest {

    @Test
    public void whenConvert140RblThen2Euro() {
        float in = 140;
        float expected = 2;
        float out = Converter.rubToEur(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void whenConvert5eurThen350Rub() {
        float in = 5;
        float expected = 350;
        float out = Converter.eurToRub(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void whenConvert1031rubThen17dot183332Dol() {
        float in = 1031;
        double expected = 17.183332;
        float out = Converter.rubToDol(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void whenConvert10dolThen600Rub() {
        float in = 10;
        float expected = 600;
        float out = Converter.dolToRub(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }
}