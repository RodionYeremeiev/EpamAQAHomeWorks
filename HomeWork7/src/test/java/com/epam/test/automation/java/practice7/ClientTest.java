package com.epam.test.automation.java.practice7;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ClientTest {
    BigDecimal initialAmount = new BigDecimal(1000.00);
    int period = 3;

    @Test
    public void constructorTest() {
        Client client = new Client();

        Assert.assertEquals(client.getDeposits().length, 10);

        for (Deposit deposit : client.getDeposits()) {
            Assert.assertNull(deposit);
        }
    }

    @Test
    public void addDepositTest() {
        Client client = new Client();

        // filling empty array with 10 elements
        Assert.assertTrue(client.addDeposit(new BaseDeposit(initialAmount, period)));
        Assert.assertTrue(client.addDeposit(new BaseDeposit(initialAmount, period)));
        Assert.assertTrue(client.addDeposit(new BaseDeposit(initialAmount, period)));

        Assert.assertTrue(client.addDeposit(new SpecialDeposit(initialAmount, period)));
        Assert.assertTrue(client.addDeposit(new SpecialDeposit(initialAmount, period)));
        Assert.assertTrue(client.addDeposit(new SpecialDeposit(initialAmount, period)));

        Assert.assertTrue(client.addDeposit(new LongDeposit(initialAmount, period)));
        Assert.assertTrue(client.addDeposit(new LongDeposit(initialAmount, period)));
        Assert.assertTrue(client.addDeposit(new LongDeposit(initialAmount, period)));
        Assert.assertTrue(client.addDeposit(new LongDeposit(initialAmount, 12)));

        //Attempt to add in full array
        Assert.assertFalse(client.addDeposit(new BaseDeposit(initialAmount, period)));
    }

    @Test
    public void totalIncomeTest() {

    }

    @Test
    public void maxIncomeTest() {
        Client client = new Client();

        client.addDeposit(new BaseDeposit(initialAmount, period));
        client.addDeposit(new SpecialDeposit(initialAmount, period));
        client.addDeposit(new LongDeposit(initialAmount, 12));

        Assert.assertEquals(client.maxIncome(), BigDecimal.valueOf(1313.06).setScale(2, RoundingMode.HALF_DOWN));
    }

    @Test
    public void getIncomeByNumberTestIfExist() {
        Client client = new Client();

        client.addDeposit(new BaseDeposit(initialAmount, period));
        client.addDeposit(new SpecialDeposit(initialAmount, period));
        client.addDeposit(new LongDeposit(initialAmount, 12));

        Assert.assertEquals(client.getIncomeByNumber(4), BigDecimal.ZERO);



    }

    @Test
    public void getIncomeByNumberTestIfNotExist() {
        Client client = new Client();

        client.addDeposit(new BaseDeposit(initialAmount, period));
        client.addDeposit(new SpecialDeposit(initialAmount, period));
        client.addDeposit(new LongDeposit(initialAmount, 12));

        Assert.assertEquals(client.getIncomeByNumber(1), BigDecimal.valueOf(157.62).setScale(2, RoundingMode.HALF_DOWN));
        Assert.assertEquals(client.getIncomeByNumber(2), BigDecimal.valueOf(61.11).setScale(2, RoundingMode.HALF_DOWN));
        Assert.assertEquals(client.getIncomeByNumber(3), BigDecimal.valueOf(1313.06).setScale(2, RoundingMode.HALF_DOWN));
    }


}
