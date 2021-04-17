/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam02q06;

/**
 *
 * @author S542269
 */

    public class Triangle extends geometricobject{

     private double firstSide;
     private double secondSide;
     private double thirdSide;
     private String color;
     private boolean filled;

    public Triangle(double firstSide,double secondSide,double thirdSide, String color, boolean filled) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
        this.color = color;
        this.filled = filled;
    }

    public double getArea() {
       return (firstSide *secondSide)/2;
    }

    public double getPerimeter() {
       return firstSide +secondSide+thirdSide;
    }

    public String color() {
        return color;
    }

    public boolean isFilled() {
       return filled;
    }

    public String toString() {
        return "Triangle{" + "firstSide=" + firstSide + ", secondSide=" + secondSide + ", thirdSide=" + thirdSide + ", color=" + color + ", filled=" + filled + '}';
    }
    }
    


    

