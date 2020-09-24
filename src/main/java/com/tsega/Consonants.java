package com.tsega;

import java.util.Arrays;
import java.util.List;

public class Consonants {
    String word;
    List<Character> vowels;
    String newWord;

    public Consonants(String word) {
        this.word = word;
        this.vowels = Arrays.asList('a', 'e', 'i', 'o', 'u');
        this.newWord = "";
    }

    public int numOfConsonants(){
        int counter = 0;
        char a = 'a';
        for(int i = 0; i < word.length(); i++){
            if(Character.isLetter(word.charAt(i)) && !vowels.contains(word.charAt(i))){
                counter++;
                this.newWord += '*';
            }else{
                this.newWord += word.charAt(i);
            }
        }
        return counter;
    }

    public String getNewWord(){
        return this.newWord;
    }
}
//- Count all consonants in a String and display the count
//        - Replace all consonants with '*' in a String