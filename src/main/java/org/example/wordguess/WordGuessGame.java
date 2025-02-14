package org.example.wordguess;

import java.util.ArrayList;
import java.util.Objects;
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
        return this.hiddenWord;
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
        System.out.println("Input your guess (1 character):");
        this.inputGuess = this.inputUser.nextLine();
        return this.inputGuess;

    }

    public boolean isGuessCorrect( String guess){
        return this.wordToGuess.contains(guess);
    }

    public void updateHiddenWord(String wordToGuess, String guess){
        for (int i =0 ; i < wordToGuess.length(); i++){
            if (guess.equalsIgnoreCase(wordToGuess.charAt(i)+"") ){
                this.hiddenWord.setCharAt(i,wordToGuess.charAt(i));
            }
        }
    }

    public void updateIsRight(){
        if(this.wordToGuess.equalsIgnoreCase(this.hiddenWord.toString())){
            this.isRight = true;
        }
        else{
            this.isRight= false;
        }
    }

    public void displayGameResult() {
        if(this.wordToGuess.equalsIgnoreCase(this.hiddenWord.toString())){
            System.out.println("Congratulation you guess the word: "+this.wordToGuess);
            System.out.println("You clear the game in " + (6-this.attemptsLeft) + " attempts");
        }
        else{
            System.out.println("BOOOOOO you can't guess the word, the word is :" + this.wordToGuess);
        }
    }

    public void run(){
        this.selectRandomWord();
        System.out.println(wordToGuess);
        System.out.println("Let's start the game!");
        this.hide_word(this.wordToGuess);
        while (!isRight || this.attemptsLeft > 0 ){
            System.out.println(this.hiddenWord);
            String guessTry =this.getPlayerGuess();
            if(isGuessCorrect(guessTry)){
                this.updateHiddenWord(this.wordToGuess,guessTry);
                System.out.println("Correct answer");
                this.attemptsLeft--;
                System.out.println("attempts left: "+ this.attemptsLeft);
                this.updateIsRight();
                continue;
            }
            else{
                System.out.println("Wrong Answer");
                this.updateIsRight();
                this.attemptsLeft--;
            }

        }
        this.displayGameResult();

    }
    public String getWordToGuess() {
        return wordToGuess;
    }
}
