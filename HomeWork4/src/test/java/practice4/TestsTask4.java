package practice4;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestsTask4 {

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testForIllegalArgumentException() {
        Task4.sumGeometricElements(100, -0.1, 20); // test with negative step
        Task4.sumGeometricElements(100, 0, 20); // test with zero step
        Task4.sumGeometricElements(100, 1, 20); // test with step = 1
        Task4.sumGeometricElements(100, 1.1, 20); // test with step > 1
        Task4.sumGeometricElements(0, 0.5, 20); // test with zero start
        Task4.sumGeometricElements(10, 0.5, 20); // test with positive start and alim start < alim
        Task4.sumGeometricElements(0, 0.5, 0); // test with zero start and alim
        Task4.sumGeometricElements(100, 0.9, 100); // test with start = alim
        Task4.sumGeometricElements(-100, 0.5, -20); // test with negative start and alim (start < alim)
        Task4.sumGeometricElements(1, 0.9, -1); // test with negative alim
    }

    @Test
    public void testWithValidParameters() {
        Assert.assertEquals(2200, Task4.sumGeometricElements(2000, 0.1, 50), "test with starting element = 2000, step = 0.1, alim = 50");
        Assert.assertEquals(175, Task4.sumGeometricElements(100, 0.5, 20), "test with starting element = 100, step = 0.5, alim = 20");
        Assert.assertEquals(200, Task4.sumGeometricElements(100, 0.5, 0), "test with starting element = 100, step = 0.5, alim = 0");
        Assert.assertEquals(522, Task4.sumGeometricElements(100, 0.9, 50), "test with starting element = 100, step = 0.9, alim = 50");
        Assert.assertEquals(50, Task4.sumGeometricElements(5, 0.9, 0), "test with starting element = 5, step = 0.9, alim = 0");
    }

}
