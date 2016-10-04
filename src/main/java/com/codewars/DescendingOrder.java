package com.codewars;

import java.util.ArrayList;

/**
 * Created by user on 09.10.2015.
 */
public class DescendingOrder {

    public static void main(String[] args) {
        System.out.println(sortDesc(123456789));
    }

    public static int sortDesc(final int num) {

            String str=""+num;
        System.out.println(str);
        char[] charArr=str.toCharArray();
        ArrayList<Integer> arrayList= new ArrayList<Integer>();

        for (char i: charArr){
            arrayList.add((int)i);
        }

    /*
            int result = 0;
            int numm=num;
            while(numm > 0) {
                result = result * 10 + numm % 10;
                numm /= 10;
            }


    */
        return  0;

    }
}