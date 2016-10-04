package com.sorting;

import com.sun.deploy.util.ArrayUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by user on 25.02.2016.
 */
public class Main {

    public static void main(String[] args) {
        int[] arr = {1, 14, 12, 124, 1, 412, 421, 42, 43, 23, 45, 23, 4, 532, 4234, 12, 23};

//        int[] arrBubble=        BubbleSort.bubbleSort(arr);
//        int[] arrSelect= SelectionSort.selectionSort(arr);

        Integer[] myArr={1, 14, 12, 124, 1, 412, 421, 42, 43, 23, 45, 23, 4, 532, 4234, 12, 23};

//        List<Integer> myList= new ArrayList<Integer>();
//        List myList1= Arrays.asList(arr);
//        List<Integer> intList = Arrays.asList(ArrayUtils.toObject(a));
        int[] tmp= Teach.BubbleSort(arr);
//        System.out.println(myList1.toString());

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");

        }
//        for (int i = 0; i < arr.length ; i++) {
//            myList.add(myArr[i]);
//            myList1.add(myArr[i]);
//
//        }

//        myList.sort(Comparator.<Integer>naturalOrder());

//        System.out.println(myList.toString());
//        myList1.sort(Comparator.<Integer>reverseOrder());
//        System.out.println(myList1.toString());

//        for (int i = 0; i < arrBubble.length; i++) {
//            System.out.println("arrbbubl["+i+"]"+ arrBubble[i]);
//
//        }
//        for (int i = 0; i < arrSelect.length; i++) {
//            System.out.println("arrbbubl["+i+"]"+ arrBubble[i]);
//
//        }

//        DispalyArr.display(arrBubble, arrBubble.length);
    }
}
