package ru.calculator;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FitTest {

    @Test
    public void manWeight() {
        short in = 172;
        double expected = 82.8;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void womanWeight() {
        short in = 160;
        double expected = 57;
        double result = Fit.womanWeight(in);
        Assert.assertEquals(expected, result, 1);
    }
}