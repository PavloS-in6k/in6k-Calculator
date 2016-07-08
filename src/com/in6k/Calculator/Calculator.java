package com.in6k.Calculator;

import java.util.List;

public class Calculator {

    public static int add(String numbers) {
        String[] splittedNumbers = new String[0];
        int firstOperand = 0, secondOperand = 0;

        if (!numbers.equals("")) {
            splittedNumbers = numbers.split("\\.?,");
            if (splittedNumbers.length>=3) throw new RuntimeException();
        }

        if (splittedNumbers.length < 3) {
            if (splittedNumbers.length >= 1)
                firstOperand = Integer.parseInt(splittedNumbers[0]);
            if (splittedNumbers.length >= 2)
                secondOperand = Integer.parseInt(splittedNumbers[1]);
        }
        return firstOperand + secondOperand;
    }
}
