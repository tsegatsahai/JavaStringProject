package com.tsega;

import java.util.Scanner;
/*
* @author = tsegatsahai
* */
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a word/phrase: ");
        String phrase = scanner.nextLine();

        Vowels vowels = new Vowels(phrase);
        Palindrome palindrome = new Palindrome(phrase);
        Word word = new Word(phrase);
        Consonants consonants = new Consonants(phrase);
        LastLetterCount lastLetterCount = new LastLetterCount(phrase);

        System.out.println("Number of vowels:\n\t---> " + vowels.findVowels());
        System.out.println("Is it a palindrome? ");
        if(palindrome.isPalindrome()){
            System.out.println("\t---> Yes");
        }else {
            System.out.println("\t---> No");
        }

        System.out.println("Number of words:\n\t---> " + word.numOfWords());

        System.out.println("Number of consonants:\n\t---> " + consonants.numOfConsonants());
        System.out.println("\t---> " + consonants.getNewWord());

        System.out.println("Phrase after rearrangement:\n" + "\t---> "+ lastLetterCount.switchWords() );
        System.out.println("Number of words that end with 's':\n\t---> " + lastLetterCount.getsWords());
        System.out.println("Number of words that end with 'y':\n\t---> " + lastLetterCount.getyWords());


    }
}
