package com.epam.test.automation.java.practice7;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        BaseDeposit baseDeposit = new BaseDeposit(
                new BigDecimal(1000), 3);

        System.out.println(baseDeposit.income());

//    baseDeposit.income();
        System.out.println("=============================================");
        SpecialDeposit specialDeposit = new SpecialDeposit(
                new BigDecimal(1000), 3);

        System.out.println(specialDeposit.income());

        System.out.println("=============================================");
        LongDeposit longDeposit = new LongDeposit(new BigDecimal(1000), 12);
        System.out.println(longDeposit.income());


        Client client = new Client();
        System.out.println(client.toString());
        client.addDeposit(baseDeposit);
        System.out.println(client.toString());
        client.addDeposit(specialDeposit);
        System.out.println(client.toString());
        client.addDeposit(longDeposit);
        System.out.println(client.toString());
        System.out.println("=========================");
        System.out.println("TotalIncome = " + client.totalIncome());
        System.out.println("=========================");
        System.out.println("MaxIncome = " + client.maxIncome());
        System.out.println("=========================");
        System.out.println("Income by number 1 = " + client.getIncomeByNumber(1));
        System.out.println("=========================");
        System.out.println("Income by number 2 = " + client.getIncomeByNumber(2));
        System.out.println("=========================");
        System.out.println("Income by number 3 = " + client.getIncomeByNumber(3));
        System.out.println("=========================");
        System.out.println("Income by number 4 = " + client.getIncomeByNumber(4));

        System.out.println("**************************************");
        System.out.println(new LongDeposit(new BigDecimal(1000), 2).income());
    }

}
