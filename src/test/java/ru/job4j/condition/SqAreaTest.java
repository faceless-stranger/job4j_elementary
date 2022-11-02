package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SqAreaTest {

    @Test
    public void whenP6K2Then2() {
        double expected = 2;
        double out = SqArea.square(6, 2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP12K3Then6dot75() {
        double expected = 6.75;
        double out = SqArea.square(12, 3);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP77K12Then105dot25() {
        double expected = 105.25;
        double out = SqArea.square(77, 12);
        Assert.assertEquals(expected, out, 0.01);
    }
}