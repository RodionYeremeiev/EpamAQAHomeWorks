package com.epam.test.automation.java.practice4;

public class Task1 {
    private Task1() {
    }

    /**
     * <summary>
     * Implement code according to description of task.
     * </summary>
     * if set invalid arguments in method, then method must throws
     * IllegalArgumentException
     */
    public static boolean isSorted(int[] array, SortOrder order) {
        if (array == null || order == null || array.length == 0) {
            throw new IllegalArgumentException();
        }
        for (int i = array.length - 1; i > 0; i--) {
            if ((array[i] < array[i - 1]) && (order == SortOrder.ASC)) {
                return false;
            }
            if ((array[i] > array[i - 1]) && (order == SortOrder.DESC)) {
                return false;
            }
        }
        return true;
    }
}
