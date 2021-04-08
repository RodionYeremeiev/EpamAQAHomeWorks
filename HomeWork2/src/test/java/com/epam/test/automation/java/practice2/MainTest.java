package com.epam.test.automation.java.practice2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MainTest {

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void TaskOneTest() {
        Assert.assertEquals(18, Main.task1(Integer.MAX_VALUE), "Test for Max integer value");
        Assert.assertEquals(9, Main.task1(135), "Test for odd-only value");
        Assert.assertEquals(0, Main.task1(246), "Test for even-only value");
        Assert.assertEquals(4, Main.task1(1234), "Test for odd & even value");
        Assert.assertEquals(0, Main.task1(2), "Test for single digit even value");
        Assert.assertEquals(1, Main.task1(1), "Test for single digit odd value");

        // Tests for Negative or Zero value
        Main.task1(-4);
        Main.task1(0);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void TaskTwoTest() {
        Assert.assertEquals(31, Main.task2(Integer.MAX_VALUE), "Test for Max integer value");
        Assert.assertEquals(3, Main.task2(14), "Test for 2 digit value");
        Assert.assertEquals(1, Main.task2(128), "Test for 2 digit value");
        Assert.assertEquals(5, Main.task2(5268), "Test for 2 digit value");

        // Tests for Negative or Zero value
        Main.task2(-4);
        Main.task2(0);
    }

    //
    @Test(expectedExceptions = IllegalArgumentException.class)
    public void TaskThreeTest() {
        Assert.assertEquals(4, Main.task3(4), "Test for single digit positive value");
        Assert.assertEquals(33, Main.task3(8), "Test for single digit positive value");
        Assert.assertEquals(143, Main.task3(11), "Test for 2 digit positive value");
        Assert.assertEquals(1744821526, Main.task3(5241), "Test for 4 digit positive value");
        Assert.assertEquals(0, Main.task3(1), "Test for input 1");
        Assert.assertEquals(1, Main.task3(2), "Test for input 2");

        // Tests for Negative or Zero value
        Main.task3(-4);
        Main.task3(0);
    }
}
