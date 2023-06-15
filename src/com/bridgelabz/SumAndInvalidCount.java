package com.bridgelabz;


public class SumAndInvalidCount {
    public static void main(String[] args) {
        int sum = 0;
        int invalidCount = 0;

        for (int i = 0; i < args.length; i++) {
            try {
                int num = Integer.parseInt(args[i]);
                sum += num;
            } catch (NumberFormatException e) {
                invalidCount++;
            }
        }

        System.out.println("Sum of valid integers: " + sum);
        System.out.println("Invalid integers entered: " + invalidCount);
    }
}