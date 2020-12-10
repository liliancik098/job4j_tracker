package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.oop.Point;

public class PointTest {

    @Test
    public void when00to20then2() {
        int expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when11to41then3() {
        int expected = 3;
        Point a = new Point(1, 1);
        Point b = new Point(4, 1);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when40to04thensqrt32() {
        double expected = Math.sqrt(32);
        Point a = new Point(4, 0);
        Point b = new Point(0, 4);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when33to68thensqrt34() {
        double expected = Math.sqrt(34);
        Point a = new Point(3, 3);
        Point b = new Point(6, 8);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }


    @Test
    public void when000to200() {
        int expected = 2;
        Point a = new Point(0, 0, 0);
        Point b = new Point(2, 0, 0);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when000to111() {
        double expected = Math.sqrt(3);
        Point a = new Point(0, 0, 0);
        Point b = new Point(1, 1, 1);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}