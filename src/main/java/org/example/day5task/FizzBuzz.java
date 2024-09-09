package org.example.day5task;

public class FizzBuzz {
    public static void doFizzBuzz(int n){
        for (int i = 1 ; i <= n ; i ++){
            if(i%3 == 0 && i%5==0){
                System.out.print("\t"+"FizzBuzz");
            } else if (i%3 == 0) {
                System.out.print("\t"+"Fizz");
            } else if (i%5==0) {
                System.out.print("\t"+"Buzz");
            }
            else{
                System.out.print("\t"+ i);
            }
        }
        System.out.println("");
    }
}
