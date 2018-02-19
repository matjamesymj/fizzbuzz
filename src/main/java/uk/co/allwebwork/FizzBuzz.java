package uk.co.allwebwork;

import java.util.ArrayList;

public class FizzBuzz {

    public ArrayList<String> doFizzBuzzLoop(Integer howHighToGo){
        ArrayList<String> returnArray = new ArrayList<String>();
        for (int i = 1; i <= howHighToGo; i++) {
            if(isMultipleOfThreeAndFive(i)){
                returnArray.add(getTextForNumber(i));
            }
            else if(isMultipleOfThree(i)){
                returnArray.add(getTextForNumber(i));
            }else if(isMultipleOfFive(i))
            {
                returnArray.add(getTextForNumber(i));
            }else{
                returnArray.add(getTextForNumber(i));
            }

        }
        return returnArray;
    }

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
