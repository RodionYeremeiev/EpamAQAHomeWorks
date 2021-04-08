package com.epam.test.automation.java.practice3;

public class Main {
    private Main() {
    }

    /**
     * <summary>
     * Implement code according to description of task 1.
     * </summary>
     */
    public static int[] task1(int[] array) {
        if (array.length > 0) {
            for (int i = 0, j = array.length - 1; i < j; i++, j--) {
                if ((array[i] % 2 == 0) && (array[j] % 2 == 0)) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

    /**
     * <summary>
     * Implement code according to description of task 2.
     * </summary>
     */
    public static int task2(int[] array) {
        int result = 0;
        int max = getMax(array);
        for (int i = 0; i <= array.length - 1; i++) {
            if (array[i] != max) {
                continue;
            }
            for (int j = array.length - 1; j > 0; j--) {
                if ((array[i] == max) && (array[j] == max)) {
                    result = j - i;
                    return result;
                }
            }
        }
        return result;
    }

    private static int getMax(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int i : array) {
            if (max < i) {
                max = i;
            }
        }
        return max;
    }


    /**
     * <summary>
     * Implement code according to description of task 3.
     * </summary>
     */
    public static int[][] task3(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0, k = matrix[i].length - 1; j < matrix[i].length && k >= 0; j++, k--) {
                if (i > j) {
                    matrix[i][j] = 0;
                }
                if (i < k) {
                    matrix[i][k] = 1;
                }
            }
        }
        return matrix;
    }

}
