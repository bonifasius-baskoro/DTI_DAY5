package org.example;

import org.example.day5task.ArrayEven;
import org.example.day5task.CurrencyConverter;
import org.example.day5task.FizzBuzz;
import org.example.day5task.addUpArray;
import org.example.wordguess.WordGuessGame;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        String test= "ayam";
//        System.out.println(test.indexOf("a"));
        WordGuessGame test1 = new WordGuessGame();
        System.out.println(test1.getWordToGuess());

        test1.run();
        FizzBuzz.doFizzBuzz(15);
        ArrayList<Integer> test2 = new ArrayList<Integer>();
        test2.add(1);
        test2.add(2);
        test2.add(3);
        test2.add(4);
        test2.add(5);
        test2.add(6);

        ArrayEven test2Class = new ArrayEven(test2);
        System.out.println(test2Class.removeOddNumber().toString());

        CurrencyConverter.convertCurrency();
        ArrayList<Integer> test3 = new ArrayList<Integer>();
        test3.add(1);
        test3.add(2);
        test3.add(3);
        test3.add(4);
        test3.add(5);
        test3.add(6);

        addUpArray.findAddUp(test3,7);


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