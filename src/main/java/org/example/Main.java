package org.example;

import org.example.wordguess.WordGuessGame;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String test= "ayam";
        System.out.println(test.indexOf("a"));
        WordGuessGame test1 = new WordGuessGame();
        System.out.println(test1.getWordToGuess());

        test1.run();

//        test1.selectRandomWord();
//        System.out.println(test1.hide_word(test1.getWordToGuess()));
//
//        StringBuilder stringTest= new StringBuilder("ayam");
//        stringTest.replace(1,2,"b");
//        System.out.println(stringTest);
//        Scanner input = new Scanner(System.in);
//        System.out.println((test.charAt(0) + "").equals(input.nextLine()));

    }
}