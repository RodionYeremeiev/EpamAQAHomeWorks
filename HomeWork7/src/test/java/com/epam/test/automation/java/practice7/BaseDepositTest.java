package com.epam.test.automation.java.practice7;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.math.BigDecimal;

public class BaseDepositTest {
    BaseDeposit baseDeposit = new BaseDeposit(new BigDecimal(1000), 3);


    @Test
    public void constructorTestIfValidParameters() {
        Assert.assertEquals(baseDeposit.amount, BigDecimal.valueOf(1000));
        Assert.assertEquals(baseDeposit.period, 3);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void constructorTestIfInValidParameters() {
        BaseDeposit baseDepositWithZeroPeriod = new BaseDeposit(new BigDecimal(1000), 0);
        BaseDeposit baseDepositWithNegativePeriod = new BaseDeposit(new BigDecimal(1000), -7);
        BaseDeposit baseDepositWithZeroAmount = new BaseDeposit(new BigDecimal(-1000), 6);
        BaseDeposit baseDepositWithNegativeAmount = new BaseDeposit(new BigDecimal(-1000), 6);
        BaseDeposit baseDepositWithNullAmount = new BaseDeposit(null, 6);
    }

    @Test
    public void incomeTestIfValidParameters() {
        Assert.assertEquals(baseDeposit.income(), BigDecimal.valueOf(157.62));
    }

}
