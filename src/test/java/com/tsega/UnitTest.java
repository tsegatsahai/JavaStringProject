package com.tsega;
import junit.framework.TestCase;
import org.junit.Test;
import static org.junit.Assert.*;

public class UnitTest {

    @Test
    public void testPalindrome(){
        Palindrome palindromeTest = new Palindrome("taco cat");
        assertTrue(palindromeTest.isPalindrome());
    }

    @Test
    public void testConsonants(){
        Consonants consonantsTest = new Consonants("hi there!");
        assertEquals(consonantsTest.numOfConsonants(), 4);
        assertEquals(consonantsTest.getNewWord(), "*i **e*e!");
    }

    @Test
    public void testVowels(){
        Vowels vowelsTest = new Vowels("My name is Tsega");
        assertEquals(vowelsTest.findVowels(), 5);
    }

    @Test
    public void testWord(){
        Word wordTest = new Word("The quick brown fox jumped over the lazy dog");
        assertEquals(wordTest.numOfWords(), 9);
    }

    @Test
    public void testLastLetterCount(){
        LastLetterCount lastLetterCountTest = new LastLetterCount("hey there, this is crazy");
        assertEquals(lastLetterCountTest.switchWords(), "this there hey is crazy ");
        assertEquals(lastLetterCountTest.getsWords(), 2);
        assertEquals(lastLetterCountTest.getyWords(), 2);

    }

}
