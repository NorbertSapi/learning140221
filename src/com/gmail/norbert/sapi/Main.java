package com.gmail.norbert.sapi;

public class Main {
    public static void main(String[] args) {
        // initialising the variables
        int countStart = 4;
        int counterEnd = 20;

        // while loop - counter
        while (countStart < counterEnd) {
            countStart++;
            if(!isEven(countStart)) {
                continue;
            }
            System.out.println("flow: " + countStart);
        }
        System.out.println("last number " + countStart);
    }

    private static boolean isEven(int num) {
        return num % 2 == 0;
    }
}