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
public class Two extends one
{
    public Two()
    {
        super(11);
    }
    
    @Override
    public int guess(int x)
    {
        System.out.println("Two guess " + x);
        return super.guess(x)+10; 
    }
    
}	// end class Two
