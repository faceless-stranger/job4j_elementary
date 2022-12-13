package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00to20Then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when02to12Then1() {
        Point a = new Point(0, 2);
        Point b = new Point(1, 2);
        double out = a.distance(b);
        double expected = 1;
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when22to15Then3dot162() {
        double expected = 3.162;
        Point a = new Point(2, 2);
        Point b = new Point(1, 5);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when32to64Then3dot605() {
        double expected = 3.605;
        Point a = new Point(3, 2);
        Point b = new Point(6, 4);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

}