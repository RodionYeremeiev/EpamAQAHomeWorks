package com.epam.test.automation.java.practice7;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;

public class Client {
    private Deposit[] deposits;

    public Client() {
        this.deposits = new Deposit[10];
    }

    public boolean addDeposit(Deposit deposit) {
        if (deposit == null) {
            throw new IllegalArgumentException();
        }
        for (int i = 0; i < this.deposits.length; i++) {
            if (this.deposits[i] == null) {
                this.deposits[i] = deposit;
                return true;
            }
        }
        return false;
    }

    public Deposit[] getDeposits() {
        return deposits;
    }

    public BigDecimal totalIncome() {
        if (deposits.length == 0) {
            throw new IllegalArgumentException();
        }
        BigDecimal totalIncome = BigDecimal.ZERO;
        for (Deposit deposit : deposits) {
            if (deposit != null) {
                totalIncome = totalIncome.add(deposit.income());
            }
        }
        return totalIncome;
    }

    public BigDecimal maxIncome() {
        BigDecimal maxIncome = deposits[0].income();
        for (int i = 0; i < deposits.length; i++) {
            if (deposits[i] != null && deposits[i + 1] != null) {
                maxIncome = deposits[i].income().max(deposits[i + 1].income());
            }
        }
        return maxIncome;
    }

    public BigDecimal getIncomeByNumber(int number) {
        if (number <= 0) {
            throw new IllegalArgumentException();
        }
        if (deposits[number] == null) {
            return BigDecimal.ZERO;
        }
        return deposits[number].income();
    }

    @Override
    public String toString() {
        return "Client{" +
                "deposits=" + Arrays.toString(deposits) +
                '}';
    }


}
