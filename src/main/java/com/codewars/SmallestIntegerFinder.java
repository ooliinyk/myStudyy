package com.codewars;

/**
 * Created by user on 09.10.2015.
 */
public class SmallestIntegerFinder {

    public static int findSmallestInt(int[] args) {
        int minValue=args[0];
        for (int i : args) {
            if(i<minValue){
                minValue=i;
            }


        }
        return minValue;

    }
}

