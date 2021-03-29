package com.gmail.ryitlearning;

public class Main {

    public static void main(String[] args) {

//        System.out.println("---------------------------------------");
//        System.out.println("Task #1");
//        System.out.println("---------------------------------------");
//        System.out.println(sumOdd(Integer.MAX_VALUE)); // expected 18
//        System.out.println(sumOdd(Integer.MIN_VALUE)); // expected exception
//        System.out.println(sumOdd(1234)); // expected 4
//        System.out.println(sumOdd(246)); // expected 0
//        System.out.println(sumOdd(135)); // expected 9
//        System.out.println(sumOdd(35)); // expected 8
//        System.out.println(sumOdd(1)); // expected 1
//        System.out.println(sumOdd(-4)); // expected -1
//        System.out.println(sumOdd(0)); // expected 0
//
        System.out.println("---------------------------------------");
        System.out.println("Task #2");
        System.out.println("---------------------------------------");
        System.out.println(countBits(Integer.MAX_VALUE)); // expected 31
        System.out.println(countBits(14)); // expected 3
        System.out.println(countBits(128)); // expected 1
        System.out.println(countBits(5268)); // expected 5
        System.out.println(countBits(13)); // expected 3
//        System.out.println(countBits(-14)); // expected -1
//        System.out.println(countBits(0)); // expected 0

//        System.out.println("---------------------------------------");
//        System.out.println("Task #3");
//        System.out.println("---------------------------------------");
//        int n = 0;
//
//                n = 5241;
//        System.out.println("Sum of first " + n + " Fibonacci numbers is : " + sumFibonacci(n)); // expected ?
//
//        n = 1;
//        System.out.println("Sum of first " + n + " Fibonacci numbers is : " + sumFibonacci(n)); // expected 0 ?
//
//        n = 2;
//        System.out.println("Sum of first " + n + " Fibonacci numbers is : " + sumFibonacci(n)); // expected 1 ?
//
//        n = 3;
//        System.out.println("Sum of first " + n + " Fibonacci numbers is : " + sumFibonacci(n)); // expected 2
//
//        n = 8;
//        System.out.println("Sum of first " + n + " Fibonacci numbers is : " + sumFibonacci(n)); // expected 33
//
//        n = 11;
//        System.out.println("Sum of first " + n + " Fibonacci numbers is : " + sumFibonacci(n));  // expected 143
//
//        n = 22;
//        System.out.println("Sum of first " + n + " Fibonacci numbers is : " + sumFibonacci(n));  // expected ?
//
//        n = 0;
//        System.out.println("Sum of first " + n + " Fibonacci numbers is : " + sumFibonacci(n));  // expected IllegalArgumentException
//
//        n = -4;
//        System.out.println("Sum of first " + n + " Fibonacci numbers is : " + sumFibonacci(n)); // expected IllegalArgumentException

        System.out.println(isPalindrome("AbbCBBa"));
        System.out.println(isPalindrome("Ap;jl'kjnvsnd"));
        System.out.println(isPalindrome("rrrrrrrrrr"));


    }


    public static int sumOdd(int value) {
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

    public static int countBits(int value) {
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

    public static int sumFibonacci(int value){
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

    public static boolean isPalindrome(String stringToCheck) {
        int headIndex = 0;
        int tailIndex = stringToCheck.length() - 1;

        while (tailIndex > headIndex) {
            if (stringToCheck.toLowerCase().charAt(headIndex) != stringToCheck.toLowerCase().charAt(tailIndex)) {
                return false;
            }
            headIndex++;
            tailIndex--;
        }
        return true;
    }

}
