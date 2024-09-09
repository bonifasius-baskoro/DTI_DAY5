package org.example.day5task;

//import java.lang.reflect.Array;
import java.util.ArrayList;

public class ArrayEven {
    ArrayList<Integer> numberArray = new ArrayList<>();
    ArrayList<Integer> returnArray = new ArrayList<>();

    public ArrayEven(ArrayList<Integer> numberArray) {
        this.numberArray = numberArray;
    }

    public   ArrayList<Integer> removeOddNumber(){
        for (int i =0; i< this.numberArray.size();i++){
//            System.out.println(this.numberArray.get(i));
            if(this.numberArray.get(i)%2 == 0){
                this.returnArray.add(this.numberArray.get(i));
            }
        }
        return this.returnArray;
    }
}
