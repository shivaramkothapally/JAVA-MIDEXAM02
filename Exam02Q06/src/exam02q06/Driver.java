/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam02q06;

import java.util.Scanner;

/**
 *
 * @author Shivaram kothapally
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         System.out.println("Answer for question 6: shivaram kothapally");
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter triangle first side");
        double firstSide = sc.nextDouble();
        
        System.out.println("Enter triangle second side");
        double secondSide = sc.nextDouble();
        
        System.out.println("Enter triangle third side");
        double thirdSide = sc.nextDouble();
        
        System.out.println("Enter triangle color");
        String color = sc.next();
        
        System.out.println("Enter triangle filled");
        boolean filled = sc.nextBoolean();
        
        Triangle tr = new Triangle(firstSide, secondSide, thirdSide,color, filled);
        
        System.out.println("Answer for question 6 : Shivaram Kothapally");
        
        System.out.println("Area of Triangle: "+ tr.getArea());
        
        System.out.println("Perimeter of Triangle: " + tr.getPerimeter());
        
        System.out.println("Color of Triangle: " + tr.color());
        System.out.println("isFilled: " + tr.isFilled());
    }
    
}
