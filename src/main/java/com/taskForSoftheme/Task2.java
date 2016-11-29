package com.taskForSoftheme;

import java.util.ArrayList;
import java.util.Scanner;

public class Task2 {

    public static void main(String args[]){
        int n;
        int count = 0;
        System.out.print("Введіть натуральне число - ");
        Scanner sr = new Scanner(System.in);
        n = sr.nextInt();
        ArrayList<Integer> arrayList= new ArrayList<Integer>();

        for(int i = 1; i <= n/2; i++){
            if ((n % i) == 0){
                arrayList.add(i);
                count++;

            }
        }
        System.out.print("Число " + n + " ділиться на - " );
        System.out.println(arrayList.toString());
        System.out.println("Кількість дільників - " + count);
    }
}
