package com.bridgelabz;

public class StaticDemo {
    // static variables
    public static int staticVariable = 0;

    // static block
    static {
        System.out.println("Static block executed!");
        staticVariable = 10;
    }

    // static method
    public static void staticMethod() {
        System.out.println("Static method called!");
        System.out.println("Static variable value: " + staticVariable);
    }

    public static void main(String[] args) {
        // calling static method
        staticMethod();

        // accessing static variable
        System.out.println("Static variable value: " + staticVariable);
    }
}