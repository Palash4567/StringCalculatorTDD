package com.example.stringcalculatortdd;

public class StringCalculator {
    public static int add(String input) {
        if(input.isEmpty()) {
            return 0;
        }
        return -1;   // Taking -1 just to pass the empty String test case.
    }
}
