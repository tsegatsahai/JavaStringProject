package com.tsega;

import java.util.Arrays;
import java.util.List;

public class Vowels {
    String word;
    List<Character> vowels;

    public Vowels(String word) {
        this.word = word;
        this.vowels = Arrays.asList('a', 'e', 'i', 'o', 'u');

    }

    public int findVowels(){
        int numOfVowels = 0;
        word = word.toLowerCase();
        for(int i = 0; i < word.length(); i++){
            if(vowels.contains(word.charAt(i))){
                numOfVowels ++;
            }
        }
       return numOfVowels;
    }
}


