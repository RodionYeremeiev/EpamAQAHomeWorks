package com.epam.test.automation.java.practice7;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class DepositTest {

    @Test
    public void testIsAbstract() {
        Class<Deposit> depositClass = Deposit.class;

        Assert.assertTrue(Modifier.isAbstract(depositClass.getModifiers()));
    }

    @Test
    public void testHasCorrectAmountField() {
        Field[] allFields = Deposit.class.getDeclaredFields();

        Assert.assertEquals(allFields.length, 2);
    }

    @Test
    public void testHasCorrectAbstractIncomeMethod() {
        Class<Deposit> depositClass = Deposit.class;
        String methodName = "income";
        Class[] parameterType = null;
        try {
            Method method = depositClass.getDeclaredMethod(methodName, parameterType);
            Assert.assertTrue(Modifier.isAbstract(method.getModifiers()));

        } catch (Exception e) {

        }
    }
}
