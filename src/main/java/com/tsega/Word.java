package com.tsega;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Word {
    String word;
    ArrayList<String> words;
    List<Character> specialCharExceptions;

    public Word(String word) {
        this.word = word;
        this.words = new ArrayList<String>();
        this.specialCharExceptions = Arrays.asList('\'', '-', '/', '\\');
    }

    public int numOfWords(){
        word = word.trim(); //to get rid of trailing spaces
        String dummyWord = "";
        for(int i = 0; i < word.length(); i++){
            if(Character.isLetter(word.charAt(i)) || specialCharExceptions.contains(word.charAt(i))){
                dummyWord += word.charAt(i);
                if(i == word.length() - 1){
                    words.add(dummyWord);
                }
            }else{
                if((i+1) < word.length()){
                    if(!Character.isLetter(word.charAt(i+1))){
                        continue;
                    }
                }
                words.add(dummyWord);
                dummyWord = "";
            }
        }
        return words.size();
    }
}
