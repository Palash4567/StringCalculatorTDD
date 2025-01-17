package com.example.stringcalculatortdd;

import static org.springframework.expression.common.ExpressionUtils.toInt;

public class StringCalculator {
    public static int add(String input) {
        if (input.isEmpty()) {
            return 0;
        }

        //code for adding other delimeters
        String delimiter = ",|\n";
        if (input.matches("//(.*)\n(.*)")) {
            delimiter = Character.toString(input.charAt(2));
            input = input.substring(4);
        }
        String[] numbers = input.split(delimiter);
        int sum = 0;
        for (String number : numbers) {
            int num = toInt(number);
            if (num < 0) {
                throw new IllegalArgumentException("Negatives not allowed: " + num);
            }
            sum = sum + num;
        }
        return sum;
    }

    public static int toInt(String number) {
        return Integer.parseInt(number);
    }
}
