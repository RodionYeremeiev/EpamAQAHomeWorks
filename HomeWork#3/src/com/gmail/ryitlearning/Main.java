package com.gmail.ryitlearning;

import java.util.Arrays;

public class Main {
    /**
     * In a given array of integers nums swap values of the first and the last array elements,
     * the second and the penultimate etc., if the two exchanged values are even.
     * <p>
     * Example:
     * {10, 5, 3, 4} =>  {4, 5, 3, 10}
     * <p>
     * {100, 2, 3, 4, 5} => {100, 4, 3, 2, 5}
     * <p>
     * {100, 2, 3, 45, 33, 8, 4, 54} => {54, 4, 3, 45, 33, 8, 2, 100}
     * <p>
     * Task 2:
     * In a given array of integers nums calculate integer result value,
     * that is equal to the distance between the first and the last entry
     * of the maximum value in the array.
     * <p>
     * Example:
     * {4, 100, 3, 4} result = 0
     * <p>
     * {5, 50, 50, 4, 5} result = 1
     * <p>
     * {5, 350, 350, 4, 350} result = 3
     * <p>
     * {10, 10, 10, 10, 10} result = 4
     * <p>
     * Task 3:
     * In a predetermined two-dimensional integer array (square matrix) matrix
     * insert 0 into elements to the left side of the main diagonal,
     * and 1 into elements to the right side of the diagonal.
     * <p>
     * Example:
     * {{2, 4, 3, 3}   =>  {{2, 1, 1, 1}
     * {5, 7, 8, 5}   =>   {0, 7, 1, 1}
     * {2, 4, 3, 3}   =>   {0, 0, 3, 1}
     * {5, 7, 8, 5}}  =>   {0, 0, 0, 5}}
     */

    public static void main(String[] args) {
        System.out.println("---------------------------------------");
        System.out.println("Task #1");
        System.out.println("---------------------------------------");
//        int[] array = {10, 5, 3, 4};
//        int[] array = new int[0];
        int[] array = {-10, -5, -3, -4};
        System.out.println(getMax(array));
        System.out.println(Arrays.toString(array) + " result =  " + Arrays.toString(task1(array)));
//        int[] array2 = {100, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(array2) + " -> " + Arrays.toString(task1(array2)));
//        int[] array3 = {100, 2, 3, 45, 33, 8, 4, 54};
//        System.out.println(Arrays.toString(array3) + " -> " + Arrays.toString(task1(array3)));

//        System.out.println("---------------------------------------");
//        System.out.println("Task #2");
//        System.out.println("---------------------------------------");
//        int[] array4 = {4, 100, 3, 4};
//        System.out.println(Arrays.toString(array4) + " -> " + task2(array4)); // expected result = 0
//        int[] array5 = {5, 50, 50, 4, 5};
//        System.out.println(Arrays.toString(array5) + " -> " + task2(array5)); // expected result = 1
//        int[] array6 = {5, 350, 350, 4, 350};
//        System.out.println(Arrays.toString(array6) + " -> " + task2(array6)); // expected result = 3
//        int[] array7 = {10, 10, 10, 10, 10};
//        System.out.println(Arrays.toString(array7) + " -> " + task2(array7)); // expected result = 4

//        int[] array8 = {10};
//        System.out.println(Arrays.toString(array8) + " -> " + task2(array8)); // expected result = 0
//
//        System.out.println("---------------------------------------");
//        System.out.println("Task #3");
//        System.out.println("---------------------------------------");
//
//
//        int[][] matrix = {{2, 4, 3, 3}, {5, 7, 8, 5}, {2, 4, 3, 3}, {5, 7, 8, 5}};

//        int[][] matrix = {{3, 2, 7, 12, 9}, {1, 14, 25, 3, 0}, {22, 7, 6, 8, 11}, {4, 9, 13, 7, 66}, {1, 1, 0, 27, 6}}; // expected -> {{3, 1, 1, 1, 1}, {0, 14, 1, 1, 1}, {0, 0, 6, 1, 1}, {0, 0, 0, 7, 1}, {0, 0, 0, 0, 6}}

//        int[][] matrix = {{1,2},{1,2}};
//        printMatrix(matrix);
//        task3(matrix);
//        printMatrix(matrix);
    }

    public static int[] task1(int[] array) {
        if (array.length < 0) {
            throw new NegativeArraySizeException();
        }
        if (array.length>0) {
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
        if (array.length < 0) {
            throw new NegativeArraySizeException();
        }
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
//    public static int[][] task3(int[][] matrix) {
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = matrix[i].length - 1; j > 0; j--) {
//                if (j > i) {
//                    matrix[i][j] = 1;
//                }
//                for (int k = 0; k < matrix[i].length; k++) {
//                    if (k < i) {
//                        matrix[i][k] = 0;
//                    }
//                }
//            }
//        }
//        return matrix;
//    }
    public static int[][] task3(int[][] matrix) {
        if (matrix.length < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
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

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
        System.out.println();
    }

}



