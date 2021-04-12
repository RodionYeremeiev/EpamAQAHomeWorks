package practice6;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.math.BigDecimal;

/**
 * <summary>
 * Implement code according to description of task.
 * </summary>
 */
public class SalesPersonTest {
    SalesPerson salesPersonPercentLesserThan100 = new SalesPerson("Jim", new BigDecimal(3500.75), 50);
    SalesPerson salesPersonPercentGreaterThan100 = new SalesPerson("Jim", new BigDecimal(3500.75), 110);
    SalesPerson salesPersonPercentEquals100 = new SalesPerson("Jim", new BigDecimal(3500.75), 100);

    SalesPerson salesPersonPercentGreaterThan200 = new SalesPerson("Jim", new BigDecimal(3500.75), 210);
    SalesPerson salesPersonPercentEquals200 = new SalesPerson("Jim", new BigDecimal(3500.75), 200);

    @Test
    public void constructorTest() {
        Assert.assertEquals(salesPersonPercentLesserThan100.getName(), "Jim");
        Assert.assertEquals(salesPersonPercentLesserThan100.getSalary(), new BigDecimal(3500.75));
        Assert.assertEquals(salesPersonPercentLesserThan100.getPercent(), 50);
    }

    @Test
    public void setBonusTestIfPercentLesserThan100() {
        salesPersonPercentLesserThan100.setBonus(new BigDecimal(100));
        Assert.assertEquals(salesPersonPercentLesserThan100.getBonus(), new BigDecimal(100));
    }

    @Test
    public void setBonusTestIfPercentEquals100() {
        salesPersonPercentEquals100.setBonus(new BigDecimal(100));
        Assert.assertEquals(salesPersonPercentEquals100.getBonus(), new BigDecimal(100));
    }


    @Test
    public void setBonusTestIfPercentGreaterThan100() {
        salesPersonPercentGreaterThan100.setBonus(new BigDecimal(100));
        Assert.assertEquals(salesPersonPercentGreaterThan100.getBonus(), new BigDecimal(200));
    }

    @Test
    public void setBonusTestIfPercentLesserThan200() {
        salesPersonPercentGreaterThan100.setBonus(new BigDecimal(100));
        Assert.assertEquals(salesPersonPercentGreaterThan100.getBonus(), new BigDecimal(200));
    }

    @Test
    public void setBonusTestIfPercentEquals200() {
        salesPersonPercentEquals200.setBonus(new BigDecimal(100));
        Assert.assertEquals(salesPersonPercentEquals200.getBonus(), new BigDecimal(200));
    }

    @Test
    public void setBonusTestIfPercentGreaterThan200() {
        salesPersonPercentGreaterThan200.setBonus(new BigDecimal(100));
        Assert.assertEquals(salesPersonPercentGreaterThan200.getBonus(), new BigDecimal(300));
    }

    @Test
    public void toPayTestIfPercentLesserThan100() {
        salesPersonPercentLesserThan100.setBonus(new BigDecimal(100));
        Assert.assertEquals(salesPersonPercentLesserThan100.toPay(), new BigDecimal(3600.75));
    }

    @Test
    public void toPayTestIfPercentGreaterThan100() {
        salesPersonPercentGreaterThan100.setBonus(new BigDecimal(100));
        Assert.assertEquals(salesPersonPercentGreaterThan100.toPay(), new BigDecimal(3700.75));
    }

    @Test
    public void toPayTestIfPercentEquals100() {
        salesPersonPercentEquals100.setBonus(new BigDecimal(100));
        Assert.assertEquals(salesPersonPercentEquals100.toPay(), new BigDecimal(3600.75));
    }

    @Test
    public void toPayTestIfPercentLesserThan200() {
        salesPersonPercentGreaterThan100.setBonus(new BigDecimal(100));
        Assert.assertEquals(salesPersonPercentGreaterThan100.toPay(), new BigDecimal(3700.75));
    }

    @Test
    public void toPayTestIfPercentGreaterThan200() {
        salesPersonPercentGreaterThan200.setBonus(new BigDecimal(100));
        Assert.assertEquals(salesPersonPercentGreaterThan200.toPay(), new BigDecimal(3800.75));
    }

    @Test
    public void toPayTestIfPercentEquals200() {
        salesPersonPercentEquals200.setBonus(new BigDecimal(100));
        Assert.assertEquals(salesPersonPercentEquals200.toPay(), new BigDecimal(3700.75));
    }

}
