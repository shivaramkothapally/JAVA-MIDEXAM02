/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam02q1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author S542269
 */
public class Exam02q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here1
        System.out.println("Answer for question 1 : Shivaram kothapally");
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter ten integers: ");
        String sr = scan.nextLine();
        String arr[] = sr.split(" ", 10);
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i<arr.length;i++){
            int ks = Integer.parseInt(arr[i]);
            list.add(ks);
        }
        removeDuplicate(list);
         
    }
    
    public static void removeDuplicate(ArrayList<Integer> list){
        ArrayList<Integer> different = new ArrayList<>();
        for(int j =0; j<list.size();j++){
           if(different.contains(list.get(j))){
               
           }
           else{
               different.add(list.get(j));
           }
              
       }
       
        
        System.out.println("The distinct integers are " +different.toString().replace("[", "").replace("]", "").replaceAll(",", ""));
    }
}