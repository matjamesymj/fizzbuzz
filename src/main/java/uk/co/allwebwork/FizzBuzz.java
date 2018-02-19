package uk.co.allwebwork;

public class FizzBuzz {

    public Boolean isMultipleOfThreeAndFive(Integer number){
        return isMultipleOfThree(number) && isMultipleOfFive(number);
    }
    public Boolean isMultipleOfThree(Integer number) {
        return number % 3 == 0;
    }

    public boolean isMultipleOfFive(Integer number) {
        return number % 5 == 0;
    }

    public String getTextForNumber(Integer number){
        if(isMultipleOfThreeAndFive(number)){
            return "FizzBuzz";
        }else if(isMultipleOfThree(number)){
            return "Fizz";
        }else if(isMultipleOfFive(number)){
            return "Buzz";
        }else{
            return number.toString();
        }
    }
}
