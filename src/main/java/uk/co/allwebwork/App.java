package uk.co.allwebwork;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {

        FizzBuzz fizzBuzz = new FizzBuzz();
        ArrayList<String> fizzBizzStrings = fizzBuzz.doFizzBuzzLoop(100);

        fizzBizzStrings.forEach(System.out::println);

    }


}
