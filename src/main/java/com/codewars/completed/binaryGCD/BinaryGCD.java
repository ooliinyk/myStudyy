package com.codewars.completed.binaryGCD;

/**
 * Created by user on 18.06.2016.
 */
public class BinaryGCD {

    public static int gcdBinary(int x, int y) {
        int d = gcd(Math.abs(x), Math.abs(y));
        System.out.println("d=" + d);
        int a=0;
        String s= Integer.toBinaryString(d);
        System.out.println("s="+s);
        for (int i = 0; i <s.length() ; i++) {
            if (s.charAt(i)=='1'){
                a++;
//                System.out.println("a=" + a);
            }

        }
        return a;
    }

    public static int gcd(int a,int b) {
        while (b !=0) {
            int tmp = a%b;
            a = b;
            b = tmp;
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(gcd(12, 6667));
        System.out.println(gcd(144, -12));
        System.out.println(gcd(6, 144));
    }




}
