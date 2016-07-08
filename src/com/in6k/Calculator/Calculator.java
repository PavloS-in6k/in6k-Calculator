package com.in6k.Calculator;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calculator {

    public static int add(String numbers) {
        String[] splittedNumbers;
        List<Integer> operands = new ArrayList<>();

        //[delimiter]\n[numbers…]” for example “//;\n1;2”
        String regexForOperands = "\\.?[,\\n]";
        String regexForDelimeter = "//(.)\\n.*";


        Pattern pattern = Pattern.compile(regexForDelimeter);
        Matcher matcher = pattern.matcher(numbers);

        if (matcher.find()) {
            int indexOfRegexDelimetersBegins = 5;
            StringBuilder temporaryString = new StringBuilder();
            temporaryString.append(regexForOperands);
            temporaryString.insert(indexOfRegexDelimetersBegins, matcher.group(1));
            regexForOperands = temporaryString.toString();
            numbers = numbers.substring(numbers.indexOf("\n") + 1, numbers.length());
        }

        if (!numbers.equals("")) {
            splittedNumbers = numbers.split(regexForOperands);
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
