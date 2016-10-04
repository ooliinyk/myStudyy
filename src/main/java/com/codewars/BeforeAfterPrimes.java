package com.codewars;

/**
 We need a function prime_bef_aft() that gives the largest prime below a certain given value n,

 befPrime or bef_prime (depending on the language),

 and the smallest prime larger than this value,

 aftPrime/aft_prime (depending on the language).

 The result should be output in a list like the following:

 primeBefAft == {befPrime, aftPrime}
 If n is a prime number it will give two primes, n will not be included in the result.

 Let's see some cases:

 primeBefAft(100) --> {97, 101}

 primeBefAft(97) --> {89, 101}

 primeBefAft(101) --> {97, 103}
 Happy coding!!
 */
public class BeforeAfterPrimes {

    public static void main(String[] args) {
        System.out.println(check(98));
        System.out.println(primeBefAft(34).toString());
    }

    public static boolean check(long n){
        for (int i=2; i<=9; i++){
            if(n%i==0){
                System.out.println("sadas" + i);
                return false;
            }
        }
        return true;
    }


    public static long[] primeBefAft(long num) {
        long before=num;
        long after=num;
        while (check(before)){
            before--;
            System.out.println("before "+ before);
        }
        while (check(after)){
            after++;
        }
        System.out.println(before +" "+ after);
        long[] primes={before, after};

        return primes;
    }
}
