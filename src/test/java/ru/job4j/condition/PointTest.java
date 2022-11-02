package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when00to20Then2() {
        double expected = 2;
        double out = Point.distance(0, 0, 2, 0);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when24to11Then3dot16() {
        double expected = 3.16;
        double out = Point.distance(2, 4, 1, 1);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when00to00Then0() {
        double expected = 0;
        double out = Point.distance(6, 6, 6, 6);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when43to10Then3dot61() {
        double expected = 3.61;
        double out = Point.distance(4, 3, 2, 0);
        Assert.assertEquals(expected, out, 0.01);
    }

}