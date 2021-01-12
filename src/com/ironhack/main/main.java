package com.ironhack.main;

import java.sql.SQLOutput;

public class main {
    public static void main(String[] args) {

        int [] numList  = {2,4,6,8};
        int [] newList = new int[4];


        for(int i = 0; i<numList.length; i++){
            if(i==numList.length-1){
                newList[i] = numList[i]*numList[0];
            }else{
                newList[i]= numList[i] * numList[i+1];
            }
            System.out.println(newList[i]);

           invertArray(numList);
        }

    }
    public static void invertArray (int[] numList){
        int length = numList.length;
        int[] output = new int[length];
        System.out.println("Matriz invertida");
                for (int i = 0; i<length; i++){
                    output[i] = numList[numList.length-1-i];
                    System.out.println(output[i]);



        }

    }
}
