package com.in6k.Calculator;

import java.util.ArrayList;
import java.util.List;

public class Calculator {

    public static int add(String numbers) {
        String[] splittedNumbers;
        List<Integer> operands = new ArrayList<>();

        if (!numbers.equals("")) {
            splittedNumbers = numbers.split("\\.?[,|\\n]");
            for (int i = 0; i < splittedNumbers.length; i++) {
                operands.add(Integer.parseInt(splittedNumbers[i]));
            }
        } else {
            operands.add(0);
        }

        int result = 0;
        for (int i = 0; i < operands.size(); i++) {
            result += operands.get(i);
        }

        return result;
    }
}
