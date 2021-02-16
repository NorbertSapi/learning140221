package com.gmail.norbert.sapi;

public class Main {
    public static void main(String[] args) {
        // initialising the variables
        int countStart = 4;
        int counterEnd = 20;
        int fiveEven = 0;
        int sumEven = 0;

        // while loop - counter
        while (countStart < counterEnd) {
            countStart++;
            if(!isEven(countStart)) {
                continue;
            }
            System.out.println("flow: " + countStart);

            // return the sum of even number
            sumEven += countStart;

            // this extra block stops the program, when we find 5 even number
            //BREAK OUT if 5 even number is found.
            fiveEven++;
            if (fiveEven == 5) {
            break;
            }
        }
        System.out.println("last number " + countStart);
        System.out.println("Sum of even numbers: " + sumEven);
    }

    private static boolean isEven(int num) {
        return num % 2 == 0;
    }
}