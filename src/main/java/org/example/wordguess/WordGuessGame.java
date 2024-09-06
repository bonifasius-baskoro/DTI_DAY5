package org.example.wordguess;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class WordGuessGame {
    ArrayList<String> wordBank;
    int attemptsLeft;
    String wordToGuess = "";
    Scanner inputUser = new Scanner(System.in);
    StringBuilder hiddenWord = new StringBuilder("");
    String inputGuess="";
    boolean isRight;

    public StringBuilder getHiddenWord() {
        return hiddenWord;
    }

    Random rand = new Random();

    public WordGuessGame() {

        this.wordBank = new ArrayList<String>();
        this.wordBank.add("random");
        this.wordBank.add("nice");
        this.wordBank.add("place");




        this.attemptsLeft = 6;
        this.isRight = false;
    }

    public void  selectRandomWord(){
        int rand1 = rand.nextInt(3);
        this.wordToGuess=this.wordBank.get(rand1);
    }


    public StringBuilder hide_word(String wordToGuess){

        for(int i = 0 ; i < this.wordToGuess.length();i++){
            this.hiddenWord.append("_");
        }
        return this.hiddenWord;
    }

    public String getPlayerGuess(){
        System.out.println("Input your guess:");
        inputGuess = this.inputUser.nextLine();
        return this.inputUser.nextLine();

    }

    public boolean isGuessCorrect(String word, String guess){
        return word.contains(guess);
    }

    public void updateHiddenWord(String word, String guess){
        for (int i =0 ; i < word.length(); i++){
            if (guess.equalsIgnoreCase(word.charAt(i)+"") ){

            }
        }
    }

    public String getWordToGuess() {
        return wordToGuess;
    }
}
