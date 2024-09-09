package org.example.day5task;

import java.util.Scanner;

public class CurrencyConverter {

    public static void convertCurrency(){
        double USD_TO_EUR = 0.92;
        double USD_TO_GBP = 0.79;
        double USD_TO_JPY = 147.65;
        double EUR_TO_USD = 1/USD_TO_EUR;
        double GBP_TO_USD = 1/USD_TO_GBP;
        double JPY_TO_USD = 1/USD_TO_JPY;
        Scanner input = new Scanner(System.in);
        double result = 0.0;
        System.out.println("Enter the amount to convert:");
        String amountInput = input.nextLine();

        System.out.println("Enter the source currency (USD, EUR, GBP, or JPY):");
        String sourceInput = input.nextLine();
        System.out.println("Enter the target currency (USD, EUR, GBP, or JPY): ");
        String targetInput = input.nextLine();

        switch(sourceInput){
            case "USD":
                switch(targetInput){
                    case "GBP":
                        result += Integer.parseInt(amountInput)* USD_TO_GBP;
                        System.out.println(amountInput +" "+sourceInput+" is equal to "+ result + " "+ targetInput);
                        break;
                    case "JPY":
                        result += Integer.parseInt(amountInput)* USD_TO_JPY;
                        System.out.println(amountInput +" "+sourceInput+" is equal to "+ result + " "+ targetInput);
                        break;
                }
                break;
            case "GBP":
                switch(targetInput){
                    case "USD":
                        result += Integer.parseInt(amountInput)* GBP_TO_USD;
                        System.out.println(amountInput +" "+sourceInput+" is equal to "+ result + " "+ targetInput);
                        break;
                    case "JPY":
                        result += Integer.parseInt(amountInput)* GBP_TO_USD*USD_TO_JPY;
                        System.out.println(amountInput +" "+sourceInput+" is equal to "+ result + " "+ targetInput);
                        break;
                }
                break;
            case "JPY":
                switch(targetInput){
                    case "GBP":
                        result += Integer.parseInt(amountInput)* JPY_TO_USD*USD_TO_GBP;
                        System.out.println(amountInput +" "+sourceInput+" is equal to "+ result + " "+ targetInput);
                        break;
                    case "USD":
                        result += Integer.parseInt(amountInput)* JPY_TO_USD;
                        System.out.println(amountInput +" "+sourceInput+" is equal to "+ result + " "+ targetInput);
                        break;
                }
                break;
        }



    }
}
