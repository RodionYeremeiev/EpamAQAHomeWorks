package com.epam.test.automation.java.practice3;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MainTest {

    @Test
    public void TaskOneShouldReturnTrueIfNoEvenElements() {
        int[] noEvenElements = {11, 5, 3, 7};
        Assert.assertEquals(noEvenElements, Main.task1(noEvenElements));
    }

    @Test
    public void TaskOneShouldReturnTrueIfEvenOnlyElements() {
        int[] actual = {2, 4, 6, 8, 10, 12, 14};
        int[] expected = {14, 12, 10, 8, 6, 4, 2};
        Assert.assertEquals(expected, Main.task1(actual));
    }

    @Test
    public void TaskOneShouldReturnTrueIfFirstAndLastEvenElements() {
        int[] actual = {10, 5, 3, 4};
        int[] expected = {4, 5, 3, 10};
        Assert.assertEquals(expected, Main.task1(actual));
    }

    @Test
    public void TaskOneShouldReturnTrueIfEvenElementsInside() {
        int[] actual = {100, 2, 3, 45, 33, 8, 4, 54};
        int[] expected = {54, 4, 3, 45, 33, 8, 2, 100};
        Assert.assertEquals(expected, Main.task1(actual));

    }

    @Test
    public void TaskOneShouldReturnTrueIfContainsZeroValues() {
        int[] actual = {0, 2, 3, 45, 33, 8, 0, 54};
        int[] expected = {54, 0, 3, 45, 33, 8, 2, 0};
        Assert.assertEquals(expected, Main.task1(actual));
    }

    @Test
    public void TaskOneShouldReturnTrueIfEmpty() {
        int[] empty = new int[0];
        Assert.assertEquals(empty, Main.task1(empty));
    }

    @Test
    public void TaskTwoShouldReturnTrueIfAllEquals() {
        int[] actual = {10, 10, 10, 10, 10};
        int expected = 4;
        Assert.assertEquals(expected, Main.task2(actual));
    }

    @Test
    public void TaskTwoShouldReturnTrueIfOneByOneAndLast() {
        int[] actual = {5, 350, 350, 4, 350};
        int expected = 3;
        Assert.assertEquals(expected, Main.task2(actual));
    }

    @Test
    public void TaskTwoShouldReturnTrueIfOneByOne() {
        int[] actual = {5, 50, 50, 4, 5};
        int expected = 1;
        Assert.assertEquals(expected, Main.task2(actual));
    }

    @Test
    public void TaskTwoShouldReturnTrueIfNoMaxPairs() {
        int[] actual = {4, 100, 3, 4};
        int expected = 0;
        Assert.assertEquals(expected, Main.task2(actual));
    }

    @Test
    public void TaskTwoShouldReturnTrueIfSingleElement() {
        int[] actual = {4};
        int expected = 0;
        Assert.assertEquals(expected, Main.task2(actual));
    }

    @Test
    public void TaskThreeShouldReturnTrueIfFourByFourMatrix() {
        int[][] actual = {{2, 4, 3, 3}, {5, 7, 8, 5}, {2, 4, 3, 3}, {5, 7, 8, 5}};
        int[][] expected = {{2, 1, 1, 1}, {0, 7, 1, 1}, {0, 0, 3, 1}, {0, 0, 0, 5}};
        Assert.assertEquals(expected, Main.task3(actual));
    }

    @Test
    public void TaskThreeShouldReturnTrueIfFiveByFiveMatrix() {
        int[][] actual = {{3, 2, 7, 12, 9}, {1, 14, 25, 3, 0}, {22, 7, 6, 8, 11}, {4, 9, 13, 7, 66}, {1, 1, 0, 27, 6}};
        int[][] expected = {{3, 1, 1, 1, 1}, {0, 14, 1, 1, 1}, {0, 0, 6, 1, 1}, {0, 0, 0, 7, 1}, {0, 0, 0, 0, 6}};
        Assert.assertEquals(expected, Main.task3(actual));
    }
}