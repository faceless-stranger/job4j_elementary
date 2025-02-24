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

    @Test
    public void when000to222Then3dot464() {
        double expected = 3.464;
        Point a = new Point(0, 0, 0);
        Point b = new Point(2, 2, 2);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when111to456Then7dot071() {
        double expected = 7.071;
        Point a = new Point(1, 1, 1);
        Point b = new Point(4, 5, 6);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenSamePointsThen0() {
        double expected = 0;
        Point a = new Point(5, 5, 5);
        Point b = new Point(5, 5, 5);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}