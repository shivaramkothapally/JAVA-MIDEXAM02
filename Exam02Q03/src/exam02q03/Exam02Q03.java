/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam02q03;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Shivaram kothapally
 */
public class Exam02Q03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Answer for question 3 : shivaram kothapally");
        ArrayList<Object>list = new ArrayList<>();
         Loan l = new Loan("home loan","gold loan");
        Date d = new Date();
         Circle c = new Circle("red",200);
         String s ="i am human";
         list.add(l);
         list.add(d);
         list.add(c);
         list.add(s);
         
         //System.out.println(list);
         
         for(Object o : list)
         {
            System.out.println(o);
         }
         
         
        
        
    }

        
    
}
