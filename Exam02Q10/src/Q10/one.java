/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q10;

/**
 *
 * @author S542269
 */
public class one
{
   private int a;
    public one(int in)
    {
        a = in;
    }
    public int guess (int x)
    {
        System.out.println("One guess " + x);        
        return a + x;
    }
    
    public int apply (int x)
    {
        System.out.println("One guess " + x);
        return guess(x + 3);
    }
} // end class One


