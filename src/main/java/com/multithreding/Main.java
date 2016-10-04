package com.multithreding;

/**
 * Created by user on 12.05.2016.
 */
public class Main {
    public static void main(String[] args) {
        new ExampleThread("Do it").start();
        new ExampleThread("Definetly").start();
    }
}
