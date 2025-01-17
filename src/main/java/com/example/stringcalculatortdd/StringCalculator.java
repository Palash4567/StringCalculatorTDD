package com.example.stringcalculatortdd;

public class StringCalculator {

    public static int add(String input) {
        if (input.isEmpty()) {
            return 0;
        }

        // Code for adding other delimiters
        String delimiter = ",|\n";
        if (input.matches("//(.*)\n(.*)")) {
            delimiter = Character.toString(input.charAt(2));
            input = input.substring(4);
        }
        String[] numbers = input.split(delimiter);
        return calculateSum(numbers);
    }

    private static int calculateSum(String[] numbers) {
        int sum = 0;
        for (String number : numbers) {
            int num = toInt(number);
            if (num < 0) {
                throw new IllegalArgumentException("Negatives not allowed: " + num);
            }
            sum += num;
        }
        return sum;
    }

    private static int toInt(String number) {
        return Integer.parseInt(number);
    }
}
