package com.epam.test.automation.java.practice7;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class LongDeposit extends Deposit {
    public LongDeposit(BigDecimal amount, int period) {
        super(amount, period);
    }

    @Override
    public BigDecimal income() {
        if (period <= 6) {
            return BigDecimal.ZERO;
        }
        int count = period - 6;
        BigDecimal income = amount;

        while (count > 0) {
            BigDecimal monthlyIncomeAmount = income.multiply(BigDecimal.valueOf(0.15));
            income = income.add(monthlyIncomeAmount);
            count--;
        }
        return income.subtract(amount).setScale(2, RoundingMode.HALF_DOWN);
    }

    @Override
    public String toString() {
        return "LongDeposit{" +
                " amount=" + this.amount +
                ", period=" + this.period +
                ", income=" + this.income() +
                '}';
    }
}
