package org.example;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

    @Test
    public void theLongestPalindromeTest() {

        Assertions.assertEquals("radar", PalindromeTester.theLongestPalindrome(new String[]{"mum", "radar"}));
        Assertions.assertEquals("radar", PalindromeTester.theLongestPalindrome(new String[]{"mum", "radar", "fabio"}));
        Assertions.assertEquals("madam", PalindromeTester.theLongestPalindrome(new String[]{"madam", "radar", "mum"}));
        Assertions.assertEquals("None of them is palindrome", PalindromeTester.theLongestPalindrome(new String[]{"house", "table", "fabio"}));

    }
}
