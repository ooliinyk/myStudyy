package com.codewars.completed.areSame;

import java.util.Arrays;

/**
 * Created by user on 16.06.2016.
 */
public class AreSame {


    public static boolean comp(int[] arr1, int[] arr2) {

        if (arr1 == null || arr2 == null) {
            return false;
        }
        if (arr1.length != arr2.length) {
            return false;
        }
        if (arr1.length == 0 && arr2.length == 0) {
            return true;
        }
        arr1 = abc(arr1);
        arr2 = abc(arr2);
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for (int i = 0; i < arr1.length; i++) {

            if (arr1[i] * arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static int[] abc(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Math.abs(arr[i]);

        }
        return arr;
    }


}
