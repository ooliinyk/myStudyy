package com.sorting;

/**
 * Created by user on 22.09.2016.
 */
public class Teach {

   


    public static int[] BubbleSort(int[] arr){

        for (int i = arr.length-1; i >0; i--) {
            for (int j = 0; j <i ; j++) {
                if (arr[j]> arr[j+1]){
                    int tmp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tmp;
                }

            }
            
        }

        return arr;

    }
}
