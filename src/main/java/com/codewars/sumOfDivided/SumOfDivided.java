package com.codewars.sumOfDivided;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by user on 21.06.2016.
 */
public class SumOfDivided {

    public static String sumOfDivided(int[] arr) {

        Set<Integer> set = new HashSet<Integer>();
        set.add(22);
//        System.out.println(set.toString());

        for (int i = 0; i <arr.length ; i++) {
            List<Integer> list = new ArrayList<Integer>();
            list = prime(arr[i]);
            Set<Integer> set2 = new HashSet<Integer>(list);
//            System.out.println(set2.toString());
            set.addAll(list);
//            System.out.println(set.toString());
        }
        StringBuilder stringBuilder = new StringBuilder();
//        stringBuilder.
        System.out.println(set.toString());

        return null;
    }


    public static List prime(int k) {
        List<Integer> list= new ArrayList<Integer>();


        for (int j = 2; j <=k/2 ; j++) {
            if (k%j ==0){
                list.add(j);
            }

        }
        return list;
    }


    public static void main(String[] args) {

        System.out.println(prime(141).toString());
        System.out.println(prime(11).toString());
        System.out.println(prime(30).toString());

        sumOfDivided(new int[] {141,11,30,4,15,144});
    }
}
