package com.epam.test.automation.java.practice4;

public class Task3 {
    private Task3() {
    }

    /**
     * <summary>
     * Implement code according to description of task.
     * </summary>
     * if set invalid arguments in method, then method must throws
     * IllegalArgumentException
     */
    public static int multiArithmeticElements(int a1, int t, int n) {
        if (n <= 0) {
            throw new IllegalArgumentException();
        }
        int[] progression = new int[n];
        progression[0] = a1;
        int result = a1;
        for (int i = 1; i < progression.length; i++) {
            progression[i] = progression[i - 1] + t;
            result *= progression[i];
        }
        return result;
    }
}
