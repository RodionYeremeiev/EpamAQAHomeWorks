package com.epam.test.automation.java.practice7;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BaseDeposit extends Deposit {
    public BaseDeposit(BigDecimal amount, int period) {
        super(amount, period);
    }

    @Override
    public BigDecimal income() {
        BigDecimal income = amount;
        int count = period;
        while (count > 0) {
            BigDecimal monthlyIncomeAmount = income.multiply(BigDecimal.valueOf(0.05));
            income = income.add(monthlyIncomeAmount);
            count--;
        }
        return income.subtract(amount).setScale(2, RoundingMode.HALF_DOWN);
    }

    @Override
    public String toString() {
        return "BaseDeposit{" +
                " amount=" + this.amount +
                ", period=" + this.period +
                ", income=" + this.income() +
                '}';
    }
}
