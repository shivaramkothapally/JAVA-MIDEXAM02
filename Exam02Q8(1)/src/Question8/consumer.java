/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question8;

/**
 *
 * @author S542269
 */
public class consumer extends farmer {
    private String name;
    private int vegetablespurchased;
    public int costofvegetables;

    public consumer(String name, int vegetablespurchased, int costofvegetables) {
        this.name = name;
        this.vegetablespurchased = vegetablespurchased;
        this.costofvegetables = costofvegetables;
    }

    
    
    @Override
    public int calculateprice() {
       return vegetablespurchased*costofvegetables;
    }

    @Override
    public String toString() {
        return "consumer{" + "name=" + name + ", vegetablespurchased=" + vegetablespurchased + ", costofvegetables=" + costofvegetables + '}';
    }
}


   
