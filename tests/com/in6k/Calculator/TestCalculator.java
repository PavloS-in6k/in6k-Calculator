package com.in6k.Calculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

/**
 * Allow the Add method to handle an unknown amount of numbers
 * Allow the Add method to handle new lines between numbers (instead of commas).
 * The following input is ok: “1\n2,3” (will equal 6)
 * Support different delimiters
 * To change a delimiter, the beginning of the string will contain a separate line that looks like this:
   “//[delimiter]\n[numbers…]” for example “//;\n1;2” should return three where the default delimiter is ‘;’ .
 * The first line is optional. All existing scenarios should still be supported
 * Calling Add with a negative number will throw an exception “negatives not allowed” – and the negative that was passed.
   If there are multiple negatives, show all of them in the exception message stop here if you are a beginner.
 * Numbers bigger than 1000 should be ignored, so adding 2 + 1001 = 2
 * Delimiters can be of any length with the following format: “//[delimiter]\n” for example: “//[—]\n1—2—3” should return 6
 * Allow multiple delimiters like this: “//[delim1][delim2]\n” for example “//[-][%]\n1-2%3” should return 6.
 * Make sure you can also handle multiple delimiters with length longer than one char
 */
public class TestCalculator {

    @Test
    public void tryAddWithEmptyString() throws Exception {
        assertEquals(Calculator.add(""), 0);
    }

    @Test
    public void tryAddWithOneNumber() throws Exception {
        assertEquals(Calculator.add("1"), 1);
    }

    @Test
    public void tryAddWithTwoNumbers() throws Exception {
        assertEquals(Calculator.add("1,2"),3);
    }

    @Test
    public void tryAddWithThreeNumbers() throws Exception {
        assertEquals(Calculator.add("1,2,3"), 6);
    }

    @Test (expected = RuntimeException.class)
    public void tryWithNullValue() throws Exception {
        Calculator.add(null);
    }

    @Test
    public void tryWithSevenNumbers() throws Exception {
        assertEquals(Calculator.add("1,2,3,4,5,6,7"), 28);
    }
}
