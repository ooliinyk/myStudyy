package com.codewars.completed.QuickCalc;

/**
 * Created by user on 23.02.2016.
 */

import java.math.BigInteger;


public class QuickCalc {


    public static void main(String[] args) {

        System.out.println( QuickCalc.choose(5,5));
    }

// Ще можна оптимызувати.
            public static BigInteger choose(int n, int p) {
                if(n<p){
                    return BigInteger.ZERO;
                }
                if(n==p){
                    return BigInteger.ONE;
                }

                BigInteger k=factorialRecursion(n).divide((factorialRecursion(p).multiply(factorialRecursion((n-p)))));
                return k;
            }


            public static BigInteger factorialRecursion(int n) {
                BigInteger result;


                if (n == 1)
                    return BigInteger.ONE;
                result =factorialRecursion(n - 1).multiply(BigInteger.valueOf(n));
                return result;
            }


}


/*
 Треба буде розыбратися..

 public static BigInteger choose(int n, int p) {
    if (p == 0) {
      return BigInteger.ONE;
    }
    return choose(n,p-1).multiply(BigInteger.valueOf(n-p+1)).divide(BigInteger.valueOf(p));
  }
}*/