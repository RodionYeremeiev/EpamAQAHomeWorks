package com.epam.test.automation.java.practice7;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.math.BigDecimal;

public class SpecialDepositTest {
    SpecialDeposit specialDeposit = new SpecialDeposit(new BigDecimal(1000), 3);

    @Test
    public void constructorTestIfValidParameters() {
        Assert.assertEquals(specialDeposit.amount, BigDecimal.valueOf(1000));
        Assert.assertEquals(specialDeposit.period, 3);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void constructorTestIfInValidParameters() {
        SpecialDeposit specialDepositWithZeroPeriod = new SpecialDeposit(new BigDecimal(1000), 0);
        SpecialDeposit specialDepositWithNegativePeriod = new SpecialDeposit(new BigDecimal(1000), -7);
        SpecialDeposit specialDepositWithZeroAmount = new SpecialDeposit(new BigDecimal(-1000), 6);
        SpecialDeposit specialDepositWithNegativeAmount = new SpecialDeposit(new BigDecimal(-1000), 6);
        SpecialDeposit specialDepositWithNullAmount = new SpecialDeposit(null, 6);
    }

    @Test
    public void incomeTestIfValidParameters() {
        Assert.assertEquals(specialDeposit.income(), BigDecimal.valueOf(61.11));
    }

}
