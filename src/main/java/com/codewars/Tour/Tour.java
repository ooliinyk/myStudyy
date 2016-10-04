package com.codewars.Tour;

import java.util.*;

/**
 * Created by user on 23.02.2016.
 */
public class Tour {
    public static void main(String[] args) {
        String[] friends1 = new String[] { "A1", "A2", "A3", "A4", "A5" };
        String[][] fTowns1 = { new String[] {"A1", "X1"}, new String[] {"A2", "X2"}, new String[] {"A3", "X3"},
                new String[] {"A4", "X4"} };
        Map<String, Double> distTable1 = new HashMap<String, Double>();
        distTable1.put("X1", 100.0); distTable1.put("X2", 200.0); distTable1.put("X3", 250.0);
        distTable1.put("X4", 300.0);

        System.out.println(  Tour.tour(friends1, fTowns1, distTable1));
    }

    public static int tour(String[] arrFriends, String[][] ftwns, Map<String, Double> h) {
        double k=0;
        

        List<Double> myList=new ArrayList<Double>();

        for (int i = 0; i < ftwns.length; i++) {
            for (int j = 1; j <2; j++) {
                if (h.containsKey(ftwns[i][j])){
                    myList.add(h.get(ftwns[i][j]));
                }

            }

        }

        for(int i=0; i<(myList.size() - 1); i++){
            k+=findDist(myList.get(i),myList.get(i+1));
            System.out.println(i);
        }
        k+=myList.get(0);
        k+=myList.get(myList.size()-1);
        System.out.println(k);
        return (int)k;
    }

    public static double findDist(double i1, double i2){
        double t= Math.sqrt(i2*i2-i1*i1);
        return t;

        }

}
