package uk.co.allwebwork;

import junit.framework.TestCase;

public class FizzBuzzTest extends TestCase {
    public void testGetTextForNumber() throws Exception {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertTrue(fizzBuzz.getTextForNumber(5).equals("Buzz"));
        assertTrue(fizzBuzz.getTextForNumber(3).equals("Fizz"));
        assertTrue(fizzBuzz.getTextForNumber(30).equals("FizzBuzz"));
        assertTrue(fizzBuzz.getTextForNumber(31).equals("31"));
    }

    public void testIsMultipleOfThreeAndFive() throws Exception {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertTrue(fizzBuzz.isMultipleOfThreeAndFive(30));
        assertFalse(fizzBuzz.isMultipleOfThreeAndFive(5));
        assertFalse(fizzBuzz.isMultipleOfThreeAndFive(3));
        assertTrue(fizzBuzz.isMultipleOfThreeAndFive(60));
    }

    public void testIsMultipleOfFive() throws Exception {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertTrue(fizzBuzz.isMultipleOfFive(5));
        assertFalse(fizzBuzz.isMultipleOfFive(4));
        assertTrue(fizzBuzz.isMultipleOfFive(10));
        assertTrue(fizzBuzz.isMultipleOfFive(60));

    }

    public void testIsMultipleOfThree() throws Exception {

        FizzBuzz fizzBuzz = new FizzBuzz();
        assertTrue(fizzBuzz.isMultipleOfThree(3));
        assertFalse(fizzBuzz.isMultipleOfThree(4));
        assertTrue(fizzBuzz.isMultipleOfThree(6));
        assertTrue(fizzBuzz.isMultipleOfThree(60));

    }

}