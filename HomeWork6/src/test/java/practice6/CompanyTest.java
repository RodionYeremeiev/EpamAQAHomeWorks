package practice6;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.math.BigDecimal;

/**
 * <summary>
 * Implement code according to description of task.
 * </summary>
 */
public class CompanyTest {
    Company company = new Company(new Manager("John", new BigDecimal(355.50), 50),
            new Manager("Mark", new BigDecimal(100), 50),
            new SalesPerson("Jane", new BigDecimal(100), 50));

    Company companyToGiveBonus = new Company(new Manager("John", new BigDecimal(355.50), 50),
            new Manager("Mark", new BigDecimal(100), 50),
            new SalesPerson("Jane", new BigDecimal(100), 50));


    @Test
    public void nameMaxSalaryTest() {
        Employee[] employees = company.getEmployees();
        Assert.assertEquals(company.nameMaxSalary(), employees[0].getName());
    }

    @Test
    public void giveEveryBodyBonusTest() {
        companyToGiveBonus.giveEverybodyBonus(new BigDecimal(100));
        Employee[] employees = companyToGiveBonus.getEmployees();
        Assert.assertEquals(employees[0].getBonus(), new BigDecimal(100));
        Assert.assertEquals(employees[1].getBonus(), new BigDecimal(100));
        Assert.assertEquals(employees[2].getBonus(), new BigDecimal(100));
    }

    @Test
    public void totalToPayTestWithBonus() {
        companyToGiveBonus.giveEverybodyBonus(new BigDecimal(100));
        Assert.assertEquals(companyToGiveBonus.totalToPay(), new BigDecimal(855.5));
    }

}
