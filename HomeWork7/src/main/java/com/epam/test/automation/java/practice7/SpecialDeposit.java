package com.epam.test.automation.java.practice7;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class SpecialDeposit extends Deposit{
    public SpecialDeposit(BigDecimal amount, int period) {
        super(amount, period);
    }

    @Override
    public BigDecimal income() {
        BigDecimal income = amount;
        double interest = 1.0;
        int count = period;
        while (count > 0) {
            BigDecimal monthlyIncomeAmount = income.multiply(BigDecimal.valueOf(interest / 100));
            income = income.add(monthlyIncomeAmount);
            interest++;
            count--;
        }
        return income.subtract(amount).setScale(2, RoundingMode.HALF_DOWN);
    }

    @Override
    public String toString() {
        return "SpecialDeposit{" +
                " amount=" + this.amount +
                ", period=" + this.period +
                ", income=" + this.income() +
                '}';
    }
}
