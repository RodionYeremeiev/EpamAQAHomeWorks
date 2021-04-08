package com.epam.test.automation.java.practice1;

import org.testng.Assert;
import org.testng.annotations.Test;


public class MainTest {

    @Test
    public void TaskOneTestPositive() throws Exception {
        Assert.assertEquals(16, Main.task1(4));
    }

    @Test
    public void TaskOneTestNegative() throws Exception {
        Assert.assertEquals(5, Main.task1(-5));
    }

    @Test
    public void TaskOneTestZero() throws Exception {
        Assert.assertEquals(0, Main.task1(0));
    }

    @Test
    public void TaskTwoTestAllDigitsEqual() throws Exception {
        Assert.assertEquals(666, Main.task2(666));
    }

    @Test
    public void TaskTwoTestTwoDigitsEqual() throws Exception {
        Assert.assertEquals(665, Main.task2(656));
    }

    @Test
    public void TaskTwoTestTwoDigits() throws Exception {
        Assert.assertEquals(-1, Main.task2(32));
    }

    @Test
    public void TaskTwoTestAllThreeValidDigits() throws Exception {
        Assert.assertEquals(651, Main.task2(165));
    }
}