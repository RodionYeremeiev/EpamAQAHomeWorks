package practice4;

import org.testng.Assert;
import org.testng.annotations.Test;

public final class TestsTask3 {

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testForIllegalArgumentException() {
        Task3.multiArithmeticElements(1, 2, 0);
        Task3.multiArithmeticElements(1, 2, -5);
    }

    @Test
    public void testWithPositiveStartAndStepParameters() {
        Assert.assertEquals(6160, Task3.multiArithmeticElements(5, 3, 4),"test with starting element = 5, step = 3, progression length = 4 elements");
        Assert.assertEquals(15, Task3.multiArithmeticElements(1, 2, 3),"test with starting element = 1, step = 2, progression length = 3 elements");
    }

    @Test
    public void testWithNegativeStart() {
        Assert.assertEquals(-15, Task3.multiArithmeticElements(-5, 2, 3),"test with starting element = -5, step = 2, progression length = 3 elements");
        Assert.assertEquals(0, Task3.multiArithmeticElements(-2, 2, 3),"test with starting element = -2, step = 2, progression length = 3 elements");
    }

    @Test
    public void testWithZeroStep() {
        Assert.assertEquals(1, Task3.multiArithmeticElements(1, 0, 3),"test with starting element = 1, step = 0, progression length = 3 elements");
    }

    @Test
    public void testWithZeroStart() {
        Assert.assertEquals(0, Task3.multiArithmeticElements(0, 1, 3),"test with starting element = 0, step = 1, progression length = 3 elements");
    }

    @Test
    public void testWithNegativeStep() {
        Assert.assertEquals(1393557504, Task3.multiArithmeticElements(10, -4, 20),"test with starting element = 10, step = -4, progression length = 20 elements");
    }

    @Test
    public void testWithSingleElementProgression() {
        Assert.assertEquals(1, Task3.multiArithmeticElements(1, 2, 1),"test with starting element = 1, step = 2, progression length = 1 element");
    }
}
