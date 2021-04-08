package com.gmail.ryitlearning;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RectangleTest {
    Rectangle noRags = new Rectangle();
    Rectangle oneArg = new Rectangle(1);

    Rectangle oneArgIsSquare = new Rectangle(5);
    Rectangle twoArgsIsNotSquare = new Rectangle(10, 5);
    Rectangle twoArgsIsSquare = new Rectangle(5, 5);


    @Test
    public void testTwoArgsConstructor() {
        Assert.assertEquals(twoArgsIsNotSquare.getSideA(), 10.0);
        Assert.assertEquals(twoArgsIsNotSquare.getSideB(), 5.0);

        Assert.assertEquals(twoArgsIsSquare.getSideA(), 5.0);
        Assert.assertEquals(twoArgsIsSquare.getSideB(), 5.0);

    }

    @Test
    public void testOneArgConstructor() {
        Assert.assertEquals(oneArg.getSideA(), 1.0);
        Assert.assertEquals(oneArg.getSideB(), 5.0);
    }

    @Test
    public void testNoArgsConstructor() {
        Assert.assertEquals(noRags.getSideA(), 4.0);
        Assert.assertEquals(noRags.getSideB(), 3.0);
    }

    @Test
    public void testAreaDefaultConstructor() {
        Assert.assertEquals(noRags.area(), 12.0);
    }

    @Test
    public void testAreaOneArgConstructor() {
        Assert.assertEquals(oneArg.area(), 5.0);
    }

    @Test
    public void testAreaTwoArgsConstructor() {
        Assert.assertEquals(twoArgsIsNotSquare.area(), 50.0);
        Assert.assertEquals(twoArgsIsSquare.area(), 25.0);
    }

    @Test
    public void testPerimeterDefaultConstructor() {
        Assert.assertEquals(noRags.perimeter(), 14.0);
    }

    @Test
    public void testPerimeterOneArgConstructor() {
        Assert.assertEquals(oneArg.perimeter(), 12.0);
    }

    @Test
    public void testPerimeterTwoArgsConstructor() {
        Assert.assertEquals(twoArgsIsNotSquare.perimeter(), 30.0);
        Assert.assertEquals(twoArgsIsSquare.perimeter(), 20.0);
    }

    @Test
    public void testIsSquareDefaultConstructor() {
        Assert.assertFalse(noRags.isSquare());
    }

    @Test
    public void testIsSquareWhenIsFalseAndHasSingleArgConstructor() {
        Assert.assertFalse(oneArg.isSquare());
    }

    @Test
    public void testIsSquareWhenIsFalseAndHasTwoArgsConstructor() {
        Assert.assertFalse(twoArgsIsNotSquare.isSquare());
    }

    @Test
    public void testIsSquareWhenIsTrueAndHasSingleArgConstructor() {
        Assert.assertTrue(oneArgIsSquare.isSquare());
    }

    @Test
    public void testIsSquareWhenIsTrueAndHasTwoArgsConstructor() {
        Assert.assertTrue(twoArgsIsSquare.isSquare());
    }

    @Test
    public void testReplaceSidesDefaultConstructor() {
        Rectangle noArgsReplace = new Rectangle(noRags.getSideA(), noRags.getSideB());
        noArgsReplace.replaceSides();

        Assert.assertEquals(noArgsReplace.getSideA(), noRags.getSideB());
        Assert.assertEquals(noArgsReplace.getSideB(), noRags.getSideA());
    }

    @Test
    public void testReplaceSidesSingleArgConstructor() {
        Rectangle oneArgsReplace = new Rectangle(oneArg.getSideA(), oneArg.getSideB());
        oneArgsReplace.replaceSides();

        Assert.assertEquals(oneArgsReplace.getSideA(), oneArg.getSideB());
        Assert.assertEquals(oneArgsReplace.getSideB(), oneArg.getSideA());
    }

    @Test
    public void testReplaceSidesTwoArgsConstructor() {
        Rectangle twoArgsReplace = new Rectangle(twoArgsIsNotSquare.getSideA(), twoArgsIsNotSquare.getSideB());
        twoArgsReplace.replaceSides();

        Assert.assertEquals(twoArgsReplace.getSideA(), twoArgsIsNotSquare.getSideB());
        Assert.assertEquals(twoArgsReplace.getSideB(), twoArgsIsNotSquare.getSideA());
    }
}