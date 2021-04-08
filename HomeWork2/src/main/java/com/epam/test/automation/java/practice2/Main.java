package com.epam.test.automation.java.practice2;

public class Main {
    Main() {
    }

    /**
     * <summary>
     * Implement code according to description of task 1.
     * </summary>
     */
    public static int task1(int value){
        if (value <= 0) {
            throw new IllegalArgumentException();
        }
        int digit;
        int result = 0;

        while (value != 0) {
            digit = value % 10;
            if (digit % 2 != 0) {
                result += digit;
            }
            value /= 10;
        }
        return result;
    }

    /**
     * <summary>
     * Implement code according to description of task 2.
     * </summary>
     */
    public static int task2(int value){
        if (value <= 0) {
            throw new IllegalArgumentException();
        }
        int count = 0;
        while (value > 0) {
            count += value & 1;
            value >>= 1;
        }
        return count;
    }

    /**
     * <summary>
     * Implement code according to description of task 3.
     * </summary>
     */
    public static int task3(int value){
        if (value <= 0) {
            throw new IllegalArgumentException();
        } else if (value == 1) {
            return 0;
        }
        int[] numbers = new int[value];
        numbers[0] = 0;
        numbers[1] = 1;

        int sum = numbers[0] + numbers[1];

        for (int i = 2; i < value; i++) {
            numbers[i] = numbers[i - 1] + numbers[i - 2];
            sum += numbers[i];
        }
        return sum;
    }
}
