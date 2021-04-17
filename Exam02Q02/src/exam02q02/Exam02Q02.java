/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam02q02;

import java.util.Scanner;

/**
 *
 * @author Shivaram kothapally
 * 
 */
public class Exam02Q02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Answer for question 2: Shivaram kothapally");
        Scanner scan = new Scanner(System.in);
        
        int[][] m1 = new int[3][3];
        int[][] m2 = new int[3][3];
        
        System.out.print("Enter list1: ");
        
        for(int i =0; i<3;i++){
            for(int j=0; j<3;j++){
            int second = scan.nextInt();
            m1[i][j] = second;
            }
        }
        System.out.print("Enter list2: ");
        for(int i =0; i<3;i++){
            for(int j=0; j<3;j++){
            int car = scan.nextInt();
            m2[i][j] = car;
            }
        }
        boolean bike =equals(m1, m2);
        if(bike==true){
            System.out.println("The two arrays are strictly identical");
        }
        else{
            System.out.println("The two arrays are not strictly identical");
        }
    }
    public static boolean equals(int[][] m1, int[][] m2){
        boolean bike = false;
        for(int i =0; i<3;i++){
            for(int j=0; j<3;j++){
                if(m1[i][j] == m2[i][j]){
                    bike = true;
                }
                else{
                    bike = false;
                    return bike;
                }
            }
        }
        return bike;
    }
    
}

    

