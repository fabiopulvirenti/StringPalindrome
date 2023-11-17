package org.example;

import java.util.Arrays;

public class PalindromeTester {

    public static void main(String[] args) {
        String word = "radar";

        if (isPalindrome(word)) {
            System.out.println("Yes, it is a palindrome.");
        } else {
            System.out.println("No, it is not a palindrome.");
        }

    }

    public static boolean isPalindrome(String wordToCheck) {
        char[] firstArray = wordToCheck.toCharArray();
        int lengthOfWord = firstArray.length;
        char[] secondArray = new char[lengthOfWord];

        for (int i = lengthOfWord - 1; i >= 0; i--) {
            secondArray[i] = firstArray[lengthOfWord - 1 - i];
        }

        return Arrays.equals(firstArray, secondArray);
    }

    public static String theLongestPalindrome(String[] palindromeList){
        String stringToReturn="";

        for (String word: palindromeList) {
            if(isPalindrome(word)) {
                if(word.length() > stringToReturn.length()) {
                    stringToReturn = word;
                }
            }
        }

        if(stringToReturn == ""){
            stringToReturn = "None of them is palindrome";
        }

        return stringToReturn;
    }

}









