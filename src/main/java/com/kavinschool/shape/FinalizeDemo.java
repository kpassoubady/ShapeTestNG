/*
 * Kangeyan Passoubady
 * (c) Kavin School -2015
 */
package com.kavinschool.shape;

/**
 * The Class FinalizeDemo.
 */
public class FinalizeDemo {
    
    /**
     * The main method.
     *
     * @param args the arguments
     */
    public static void main(String[] args) {
        for(int i=0; i<=100000;i++){
            Cube cube = new Cube(i);
            cube.draw();
        }            
    }
}
