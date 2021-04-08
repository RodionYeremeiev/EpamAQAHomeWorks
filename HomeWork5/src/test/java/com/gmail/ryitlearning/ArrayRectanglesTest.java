package com.gmail.ryitlearning;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ArrayRectanglesTest {

    ArrayRectangles arrayRectanglesTestFull = new ArrayRectangles(
            new Rectangle(10, 10),
            new Rectangle(5, 5),
            new Rectangle(6, 6),
            new Rectangle(7, 7),
            new Rectangle(1, 2)
    );
    Rectangle[] arrayRectanglesTestFree = {new Rectangle(1.1, 1.2), null};

    @Test
    public void testAddRectangleFreeArray() {
        Assert.assertTrue(new ArrayRectangles(arrayRectanglesTestFree).addRectangle(new Rectangle(1, 3)));
    }

    @Test
    public void testAddRectangleNoPlaceInArray() {
        Assert.assertFalse(arrayRectanglesTestFull.addRectangle(new Rectangle()));
    }

    @Test
    public void testNumberMaxArea() {
        Assert.assertEquals(arrayRectanglesTestFull.numberMaxArea(), 0);
    }

    @Test
    public void testNumberMinPerimeter() {
        Assert.assertEquals(arrayRectanglesTestFull.numberMinPerimeter(), 4);

    }

    @Test
    public void testNumberSquares() {
        Assert.assertEquals(arrayRectanglesTestFull.numberSquares(), 4);
    }

    @Test
    public void testFindMaxArea() {
        Assert.assertEquals(arrayRectanglesTestFull.findMaxArea(), 100);
    }

    @Test
    public void testFindMinPerimeter() {
        Assert.assertEquals(arrayRectanglesTestFull.findMinPerimeter(), 6);

    }
}