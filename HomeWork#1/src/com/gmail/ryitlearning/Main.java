package com.gmail.ryitlearning;

import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(calculate(4));
        System.out.println(calculate(-5));
        System.out.println(calculate(0));

        System.out.println("------------------");

        System.out.println(maxInt(666)); // -> 666
        System.out.println(maxInt(165)); // -> 651
        System.out.println(maxInt(656)); // -> 665
        System.out.println(maxInt(123)); // -> 321
        System.out.println(maxInt(453)); // -> 543
        System.out.println(maxInt(321)); // -> 321
        System.out.println(maxInt(23)); // -> -1 (or 32)

    }
    public static int calculate(int n) {
        if (n > 0) {
            return n * n;
        }
        if (n < 0) {
            return n * -1;
        }
        return 0;
    }

    //No array, if-only implementation
    public static int maxInt(int n) {
        if (n < 100 || n > 999) {
            return -1;
        }
        int a = n / 100;
        int b = (n % 100) / 10;
        int c = n % 10;
        if (a >= b && a >= c) {
            a *= 100;
            if (b > c) {
                return a + b * 10 + c;
            } else {
                return a + c * 10 + b;
            }
        }
        if (b >= a && b >= c) {
            b *= 100;
            if (a > c) {
                return b + a * 10 + c;
            } else {
                return b + c * 10 + a;
            }
        }
        c *= 100;
        if (a > b) {
            return c + a * 10 + b;
        } else {
            return c + b * 10 + a;
        }
    }

//    // int[] array, bubble sort & manual picking of elemnts
//    public static int maxInt(int n) {
//        if (n < 100 || n > 999) {
//            return -1;
//        }
//        int[] arr = {n / 100, (n % 100) / 10, n % 10};
//        int temp;
//        boolean sorted = false;
//        while (!sorted) {
//            sorted = true;
//            for (int i = arr.length - 1; i > 0; i--) {
//                if (arr[i] > arr[i - 1]) {
//                    temp = arr[i];
//                    arr[i] = arr[i - 1];
//                    arr[i - 1] = temp;
//                    sorted = false;
//                }
//            }
//        }
//        return arr[0] * 100 + arr[1] * 10 + arr[2];
//    }

//    // char[] array & StrinBuilder.reverse() implementation
//    public static int maxInt(int n) {
//            char[] arr = Integer.toString(n).toCharArray();
//            Arrays.sort(arr);
//            StringBuilder stringBuilder = new StringBuilder();
//            stringBuilder.append(arr).reverse();
//            return Integer.parseInt(String.valueOf(stringBuilder));
//    }

//    //Integer[] array & Collecetions.reverseOrder() sorting implementation
//    public static int maxInt(int n) {
//        if (n > 100 && n < 999) {
//            Integer[] arr = {n / 100, (n % 100) / 10, n % 10};
//            Arrays.sort(arr, Collections.reverseOrder());
//            return arr[0] * 100 + arr[1] * 10 + arr[2];
//        }
//        return -1;
//    }

//    // Teacher's implementation
//    public static int maxInt(int n) {
//        int a = n / 100;
//        int b = (n % 100) / 10;
//        int c = n % 10;
//
//        if (a >= b && a >= c) {
//            a *= 100;
//            if (b > c) {
//                b *= 10;
//            } else {
//                c *= 10;
//            }
//        } else if (b >= a && b >= c) {
//            b *= 100;
//            if (a > c) {
//                a *= 10;
//            } else {
//                c *= 10;
//            }
//        } else {
//            c *= 100;
//            if (a > b) {
//                return a *= 10;
//            } else {
//                b *= 10;
//            }
//        }
//        return a + b + c;
//    }

}

