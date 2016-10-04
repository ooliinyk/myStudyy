package com.codewars.completed;import java.lang.String;import java.util.Random;

/**
 Description:

 Color Ghost

 Create a class Ghost

 Ghost objects are instantiated without any arguments.

 Ghost objects are given a random color attribute of white" or "yellow" or "purple" or "red" when instantiated

 Ghost ghost = new Ghost();
 ghost.getColor(); //=> "white" or "yellow" or "purple" or "red"
 c# Ghost ghost = new Gost(); ghost.GetColor(); // => "white" or "yellow" or "purple" or "red"
 */
public class Ghost {
    final Random random = new Random();
    String atr;
    String [] colors=   {"white","yellow","purple","red"};

    Ghost(){
        atr= colors[random.nextInt(3)];
    }
    public  String getColor(){
        return atr;
    }
}
