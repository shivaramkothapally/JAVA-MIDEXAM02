/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Example1;

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
              System.out.println("Answer for question 4: Shivaram Kothapally");
        producer p = new producer("eshwar", 250000);
        System.out.println(p);
        lineProducer c = new lineProducer("ravi", 30000,"mahi",120000);
        System.out.println(c);
        //polymorpic substitution
        producer pc = new lineProducer("kevin", 25000, "rambo", 560000);
        ////late binding polumorphism
        System.out.println(pc);

    }
    
}
