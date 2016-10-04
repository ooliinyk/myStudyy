package com.codewars.completed;

/**
 Description:

 Write a class Block that creates a block (Duh..)

 Requirements

 The constructor should take an array as an argument, this will contain 3 integers of the form [width, length, height] from which the Block should be created.

 Define these methods:

 `getWidth()` return the width of the `Block`

 `getLength()` return the length of the `Block`

 `getHeight()` return the height of the `Block`

 `getVolume()` return the volume of the `Block`

 `getSurfaceArea()` return the surface area of the `Block`
 Examples

 Block b = new Block(new int[]{2,4,6}) -> creates a `Block` object with a width of `2` a length of `4` and a height of `6`
 b.getWidth() // -> 2

 b.getLength() // -> 4

 b.getHeight() // -> 6

 b.getVolume() // -> 48

 b.getSurfaceArea() // -> 88

 */
public class Block {



    public static void main(String[] args) {
        Block b =new Block(new int[]{2,2,2});
        System.out.println(b.getVolume());
    }

     Block(int[] ints) {
        width=ints[0];
        length=ints[1];
        height=ints[2];
    }


    int width, length, height;
//    Block(int width3,int length3,int height3){
//        width=width3;
//        length=length3;
//        height=height3;
//    }


    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }
    public  int getVolume(){
        return width*length*height;
    }
    public  int getSurfaceArea(){
        return 2*(width*length+width*height+length*height);
}
}
