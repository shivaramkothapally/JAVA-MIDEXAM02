/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Example2;

/**
 *
 * @author S542269
 */
public class driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Answer for question 4: Shivaram kothapally");
        chemicals c = new chemicals("sodium", "Na");
        fertilizers s = new fertilizers("base", "red","nitrate","n2");
        //polymorpic substitution
        chemicals ks = new fertilizers("acid", "red", "ca", "base");
        //late binding polymorphism
        System.out.println(ks);
    }

    }
    

