/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example9;

/**
 *
 * @author S542269
 */
    public class Library implements LibraryResources
{
    //Instance Variable(s)
    protected String resourceType = "book";
    protected int noOfComputers = 2;

    @Override
    //Overriding the method from interface by adding some behaviour of the body    
    public void rosourceTypeAndCount()
    {
       //Assigning the values to the instance variables in the overridden method of Library class 
       resourceType = "Computers";
       noOfComputers = 30;
       System.out.println("Resource Type ="+resourceType+", No Of Computers ="+noOfComputers);       
    }

    @Override
    public String toString() {
        return "Library{" + "resourceType=" + resourceType + ", noOfComputers=" + noOfComputers + '}';
    }
    
    
}
    

