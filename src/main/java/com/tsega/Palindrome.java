package com.tsega;

import java.util.ArrayList;

public class Palindrome {
    String word;
    ArrayList<String> words;

    public Palindrome(String word) {
        this.word = word;
        this.words = new ArrayList<String>();
    }
    public boolean isPalindrome(){
        //getting rid of white space and special characters
        String cleanWord = "";
        for(int i = 0; i < word.length(); i++){
            if(Character.isLetter(word.charAt(i))){
                cleanWord += word.charAt(i);
            }
        }
        //reversing the cleaned up word
        String wordReversed = "";
        for(int i = cleanWord.length() - 1 ; i >= 0; i--){
            if(Character.isLetter(cleanWord.charAt(i))){
                wordReversed += cleanWord.charAt(i);
            }
        }
        return cleanWord.equalsIgnoreCase(wordReversed);
    }
}
