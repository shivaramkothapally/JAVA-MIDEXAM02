/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example8;

/**
 *
 * @author S542269
 */
public class driver {
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]){
		//coding in terms of abstract classes
		Person student = new jobholder("shriya","Female",0);
		Person jobholder = new jobholder("ravi","Male",123);
		student.work();
		jobholder.work();
		//using method implemented in abstract class - inheritance
		
		System.out.println(jobholder.toString());
	}

}