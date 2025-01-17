package com.example.stringcalculatortdd;

import static org.springframework.expression.common.ExpressionUtils.toInt;

public class StringCalculator {
    public static int add(String input) {
        if (input.isEmpty()) {
            return 0;
        }

        //code for adding new lines
        String[] numbers = input.split(",|\n");
        int sum = 0;
        for (String number : numbers) {
            sum += toInt(number);
        }
        return sum;
    }

    public static int toInt(String number) {
        return Integer.parseInt(number);
    }
}
