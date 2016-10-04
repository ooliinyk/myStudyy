package com.codewars;

import java.awt.geom.Point2D;

/**
 Write a simple function that takes polar coordinates (an angle in degrees and a radius) and returns the equivalent cartesian coordinates (rouded to 10 places).

 For example:

 coordinates(90,1)
 => (0.0, 1.0)

 coordinates(45, 1)
 => (0.7071067812, 0.7071067812)
 */




public class CoordinatesInspector {

    public static void main(String[] args) {
        CoordinatesInspector coordinatesInspector=new CoordinatesInspector();
        Point2D result = new CoordinatesInspector().coordinates(90.0,1.0);
        System.out.println(result.getX()+ result.getY());
//        System.out.println(coordinatesInspector.coordinates(90.0,1.0));

    }
    public double roundResult (double d, int precise) {

        precise = 10^precise;
        d = d*precise;
        int i = (int) Math.round(d);
        return (double) i/precise;

    }

    public Point2D coordinates(Double degrees, Double radius){
        CoordinatesInspector coordinatesInspector=new CoordinatesInspector();

            double x=Math.cos(degrees);
        System.out.println(x);
        double y=coordinatesInspector.roundResult(Math.sin(degrees)*radius,10);
            Point2D point2D= new Point2D() {
                @Override
                public double getX() {
                    return 0;
                }

                @Override
                public double getY() {
                    return 0;
                }

                @Override
                public void setLocation(double x, double y) {

                }
            };
        point2D.setLocation(x,y );
        return point2D;
    }
}
