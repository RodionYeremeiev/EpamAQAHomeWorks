package com.epam.test.automation.java.practice1;

public class Main {
    Main() {
    }

    /**
     * <summary>
     * Implement code according to description of task 1.
     * </summary>
     */
    public static int task1(int n) {
        if (n > 0) {
            return n * n;
        }
        if (n < 0) {
            return Math.abs(n);
        }
        return 0;
    }

    /**
     * <summary>
     * Implement code according to description of task 2.
     * </summary>
     */
    public static int task2(int n) {
        if (n < 100 || n > 999) {
            return -1;
        }
        int[] arr = {n / 100, (n % 100) / 10, n % 10};
        int temp;
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for (int i = arr.length - 1; i > 0; i--) {
                if (arr[i] > arr[i - 1]) {
                    temp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = temp;
                    sorted = false;
                }
            }
        }
        return arr[0] * 100 + arr[1] * 10 + arr[2];
    }
}


