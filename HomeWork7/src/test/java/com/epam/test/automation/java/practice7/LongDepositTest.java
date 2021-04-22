package com.epam.test.automation.java.practice7;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class LongDepositTest {
    LongDeposit longDepositIfLessThanSixMonth = new LongDeposit(new BigDecimal(1000), 3);
    LongDeposit longDepositIfMoreThanSixMonth = new LongDeposit(new BigDecimal(1000), 12);


    @Test
    public void constructorTestIfValidParameters() {
        Assert.assertEquals(longDepositIfLessThanSixMonth.amount, BigDecimal.valueOf(1000));
        Assert.assertEquals(longDepositIfLessThanSixMonth.period, 3);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void constructorTestIfInValidParameters() {
        LongDeposit longDepositWithZeroPeriod = new LongDeposit(new BigDecimal(1000), 0);
        LongDeposit longDepositWithNegativePeriod = new LongDeposit(new BigDecimal(1000), -7);
        LongDeposit longDepositWithZeroAmount = new LongDeposit(new BigDecimal(-1000), 6);
        LongDeposit longDepositWithNegativeAmount = new LongDeposit(new BigDecimal(-1000), 6);
        LongDeposit longDepositWithNullAmount = new LongDeposit(null, 6);
    }

    @Test
    public void incomeTestIfperiodMoreThanSixMonth() {
        Assert.assertEquals(longDepositIfMoreThanSixMonth.income(), BigDecimal.valueOf(1313.06));
    }

    @Test
    public void incomeTestIfperiodLessThanSixMonth() {
        Assert.assertEquals(longDepositIfLessThanSixMonth.income(), BigDecimal.valueOf(0).setScale(2, RoundingMode.HALF_DOWN));
    }
}
