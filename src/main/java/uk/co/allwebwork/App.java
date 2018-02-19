package uk.co.allwebwork;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {

        FizzBuzz fizzBuzz = new FizzBuzz();
        for (int i = 1; i < 101; i++) {
            if(fizzBuzz.isMultipleOfThreeAndFive(i)){
                System.out.println(fizzBuzz.getTextForNumber(i));
            }
            else if(fizzBuzz.isMultipleOfThree(i)){
                System.out.println(fizzBuzz.getTextForNumber(i));
            }else if(fizzBuzz.isMultipleOfFive(i))
            {
                System.out.println(fizzBuzz.getTextForNumber(i));
            }else{
                System.out.println(fizzBuzz.getTextForNumber(i));
            }

        }


    }


}
