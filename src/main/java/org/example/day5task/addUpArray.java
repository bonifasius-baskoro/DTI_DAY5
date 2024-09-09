package org.example.day5task;

import java.util.ArrayList;

public class addUpArray {
     public static void findAddUp(ArrayList<Integer> inputArray, int target){
         ArrayList<Integer> arrayResult = new ArrayList<Integer>();

         for(int i =0 ; i < inputArray.size()-1; i ++){
             int leftInt = inputArray.get(i);
             for(int j = inputArray.size()-1 ; j>i ;j--){
                 int rightInt = inputArray.get(j);
                 if(leftInt+rightInt == target){
                     arrayResult.add(i);
                     arrayResult.add(j);
                     System.out.println(arrayResult.toString());
                     return;
                 }
             }
         }
         System.out.println("No Pair Exist");

     }
}
