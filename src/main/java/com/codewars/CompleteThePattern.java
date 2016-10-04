package com.codewars;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 09.10.2015.
 */
public class CompleteThePattern {

    public static void main(String[] args) {
        System.out.println(pattern(4));
    }

    public static String pattern(int n){

        String myPattern=null;

      ArrayList<Integer> list= new ArrayList<Integer>();

        for (int i=0; i<=n; i++){
            list.add(i);
        }

        myPattern=String.join("/n",list.toString());

        return myPattern;
    }
}
