package com.codewars.completed;

import java.util.ArrayList;

/**
 Some numbers have funny properties. For example:

 89 --> 8? + 9? = 89 * 1

 695 --> 6? + 9? + 5?= 1390 = 695 * 2

 46288 --> 4? + 6?+ 2? + 8? + 8? = 2360688 = 46288 * 51
 Given a positive integer n written as abcd... (a, b, c, d... being digits) and a positive integer p we want to find a positive integer k, if it exists, such as the sum of the digits of n taken to the successive powers of p is equal to k * n. In other words:

 Is there an integer k such as : (a ^ p + b ^ (p+1) + c ^(p+2) + d ^ (p+3) + ...) = n * k
 If it is the case we will return k, if not return -1.

 Note: n, p will always be given as strictly positive integers.

 digPow(89, 1) should return 1 since 8? + 9? = 89 = 89 * 1
 digPow(92, 1) should return -1 since there is no k such as 9? + 2? equals 92 * k
 digPow(695, 2) should return 2 since 6? + 9? + 5?= 1390 = 695 * 2
 digPow(46288, 3) should return 51 since 4? + 6?+ 2? + 8? + 8? = 2360688 = 46288 * 51
 */


public class DigPow {

    public static void main(String[] args) {
        System.out.println(digPow(92,1));

    }

    public static long digPow(int n, int p){
        int sum=0;

        int a = n;
        StringBuilder s = new StringBuilder();
        ArrayList<Integer> myList = new ArrayList<Integer>();
        while(a>0) {
            myList.add(a%10);
            a = a / 10;
        }
        int pow= p+myList.size()-1;
        for (Integer i: myList){
            sum+=Math.pow(i,pow);
            pow--;

        }
        if (sum%n!=0){
            return -1;
        }
        else {return sum/n;}

    }

}


/* NICE SOLUTION
  String[] number = Integer.toString(n).split("");
        long trueN=0;
        for (int i = 0; i < number.length; i++) {
            trueN+= Math.pow(Integer.parseInt(number[i]), p+i);
        }
        if (trueN%n!=0){
            return -1;
        } else{
            return trueN/n;
        }
 */