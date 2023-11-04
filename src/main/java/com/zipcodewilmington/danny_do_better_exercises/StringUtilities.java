package com.zipcodewilmington.danny_do_better_exercises;

import java.util.Arrays;

/**
 * Created by dan on 6/14/17.
 */
public class StringUtilities {
    /**
     * @return `Hello World` as a string
     */
    public static String getHelloWorld() {


        return "Hello World";
    }

    /**
     * @param firstSegment  a string to be added to
     * @param secondSegment a string to add
     * @return the concatenation of two strings, `firstSegment`, and `secondSegment`
     */
    public static String concatenation(String firstSegment, String secondSegment) {


        return firstSegment.concat(secondSegment);

        //return null;
    }

    /**
     * @param firstSegment  a string to be added to
     * @param secondSegment a string to add
     * @return the concatenation of an integer, `firstSegment`, and a String, `secondSegment`
     */
    public static String concatenation(int firstSegment, String secondSegment) {


        return firstSegment + secondSegment;
        //return null;
    }


    /**
     * @param input a string to be manipulated
     * @return the first 3 characters of `input`
     */
    public static String getPrefix(String input) {

        return input.substring(0, 3);

        // return null;
    }

    /**
     * @param input a string to be manipulated
     * @return the last 3 characters of `input`
     */
    public static String getSuffix(String input) {
        // i want to get the length of string.
        int pre = input.length() - 3;
        int fix = input.length();
        // subtract the length by 3.
        // create two int  pre,fix.
        // and enter them into sub string.


        return input.substring(pre, fix);
        //return null;
    }

    /**
     * @param inputValue      the value to be compared
     * @param comparableValue the value to be compared against
     * @return the equivalence of two strings, `inputValue` and `comparableValue`
     */
    public static Boolean compareTwoStrings(String inputValue, String comparableValue) {
        if (inputValue == comparableValue) {
            return true;
        } else
            return false;
    }

    /**
     * @param inputValue the value input from user
     * @return the middle character of `inputValue`
     */
    public static Character getMiddleCharacter(String inputValue) {
        int middle = inputValue.length() / 2;
        // take the number and in the string.
        return inputValue.charAt(middle-1);
        //return;
        //return null;
    }



    /**
     * @param spaceDelimitedString a string, representative of a sentence, containing spaces
     * @return the first sequence of characters
     */
    public static String getFirstWord(String spaceDelimitedString){
        // spilting a string but it space and returning the first sub string
        String[] spaceSpliter = spaceDelimitedString.split("");

        for(int i = 0; i<= spaceSpliter.length; i++){
            System.out.println( spaceSpliter[i]);

        }


        return null;
    }

    /**
     * @param spaceDelimitedString a string delimited by spaces
     * @return the second word of a string delimited by spaces.
     */
    public static String getSecondWord(String spaceDelimitedString){
        return null;
    }

    /**
     * @param stringToReverse
     * @return an identical string with characters in reverse order.
     */
    public static String reverse(String stringToReverse){
        StringBuilder putItInReverse = new StringBuilder();// the new output of the reverse string
      // separating the letter into piece to reassemble.
      // I want to take a string and reverse the input.
        for(int i = stringToReverse.length() - 1; i >= 0 ; i--) {
            //and  reverse the order from last charter to first.^
            putItInReverse.append(stringToReverse.charAt(i));
        }
        System.out.println(putItInReverse);
         return putItInReverse.toString(); //then return the sting as new string.


       //return null;
    }
}
