package practice6;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.math.BigDecimal;

/**
 * <summary>
 * Implement code according to description of task.
 * </summary>
 */
public class ManagerTest {
    Manager managerCALesserThan100 = new Manager("Jim", new BigDecimal(3500.75), 50);
    Manager managerCALGreaterThan100 = new Manager("Jim", new BigDecimal(3500.75), 110);
    Manager managerCALEquals100 = new Manager("Jim", new BigDecimal(3500.75), 100);

    Manager managerCALGreaterThan150 = new Manager("Jim", new BigDecimal(3500.75), 210);
    Manager managerCALEquals150 = new Manager("Jim", new BigDecimal(3500.75), 150);

    @Test
    public void constructorTest() {
        Assert.assertEquals(managerCALesserThan100.getName(), "Jim");
        Assert.assertEquals(managerCALesserThan100.getSalary(), new BigDecimal(3500.75));
        Assert.assertEquals(managerCALesserThan100.getQuantity(), 50);
    }

    @Test
    public void setBonusTestIfClientAmountLesserThan100() {
        managerCALesserThan100.setBonus(new BigDecimal(100));
        Assert.assertEquals(managerCALesserThan100.getBonus(), new BigDecimal(100));
    }

    @Test
    public void setBonusTestIfClientAmountEquals100() {
        managerCALEquals100.setBonus(new BigDecimal(100));
        Assert.assertEquals(managerCALEquals100.getBonus(), new BigDecimal(100));

    }


    @Test
    public void setBonusTestIfClientAmountGreaterThan100() {
        managerCALGreaterThan100.setBonus(new BigDecimal(100));
        Assert.assertEquals(managerCALGreaterThan100.getBonus(), new BigDecimal(600));
    }

    @Test
    public void setBonusTestIfPercentLesserThan150() {
        managerCALGreaterThan100.setBonus(new BigDecimal(100));
        Assert.assertEquals(managerCALGreaterThan100.getBonus(), new BigDecimal(600));
    }

    @Test
    public void setBonusTestIfClientAmountEquals150() {
        managerCALEquals150.setBonus(new BigDecimal(100));
        Assert.assertEquals(managerCALEquals150.getBonus(), new BigDecimal(600));
    }

    @Test
    public void setBonusTestIfClientAmountGreaterThan150() {
        managerCALGreaterThan150.setBonus(new BigDecimal(100));
        Assert.assertEquals(managerCALGreaterThan150.getBonus(), new BigDecimal(1100));
    }

    @Test
    public void toPayTestIfClientAmountLesserThan100() {
        managerCALesserThan100.setBonus(new BigDecimal(100));
        Assert.assertEquals(managerCALesserThan100.toPay(), new BigDecimal(3600.75));
    }

    @Test
    public void toPayTestIfClientAmountGreaterThan100() {
        managerCALGreaterThan100.setBonus(new BigDecimal(100));
        Assert.assertEquals(managerCALGreaterThan100.toPay(), new BigDecimal(4100.75));

    }

    @Test
    public void toPayTestIfClientAmountEquals100() {
        managerCALEquals100.setBonus(new BigDecimal(100));
        Assert.assertEquals(managerCALEquals100.toPay(), new BigDecimal(3600.75));

    }

    @Test
    public void toPayTestIfClientAmountLesserThan150() {
        managerCALGreaterThan100.setBonus(new BigDecimal(100));
        Assert.assertEquals(managerCALGreaterThan100.toPay(), new BigDecimal(4100.75));

    }

    @Test
    public void toPayTestIfClientAmountGreaterThan150() {
        managerCALGreaterThan150.setBonus(new BigDecimal(100));
        Assert.assertEquals(managerCALGreaterThan150.toPay(), new BigDecimal(4600.75));

    }

    @Test
    public void toPayTestIfClientAmountEquals150() {
        managerCALEquals150.setBonus(new BigDecimal(100));
        Assert.assertEquals(managerCALEquals150.toPay(), new BigDecimal(4100.75));
    }

}
