package com.gmail.norbert.sapi;

public class Main {

    public static void main(String[] args) {
        // write your code here
        // this is a while exercise
        //System.out.println(Motor.isEven(3));

        // initialising the variables
        int sum = 0;
        int countStart = 4;
        int counterEnd = 20;

        // while loop - counter
        while (countStart < counterEnd) {
            countStart++;
            System.out.println("flow: " + countStart);
        }
        System.out.println("last number " + countStart);
    }
}