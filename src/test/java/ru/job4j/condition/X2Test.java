package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class X2Test {

    @Test
    public void whenA10B0B0X0Then40() {
        int out = X2.calc(10, 0, 0, 2);
        int expected = 40;
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenA1B1C1X1Then3() {
        int out = X2.calc(1, 1, 1, 1);
        int expected = 3;
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenA0B1C1X1Then2() {
        int out = X2.calc(0, 1, 1, 1);
        int expected = 2;
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenA1B1C0X1Then2() {
        int out = X2.calc(1, 1, 0, 1);
        int expected = 2;
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenA1B1C1X0Then1() {
        int out = X2.calc(1, 1, 1, 0);
        int expected = 1;
        Assert.assertEquals(expected, out);
    }
}
