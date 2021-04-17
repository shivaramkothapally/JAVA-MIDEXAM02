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
public class producer {
    private String Name;  
    private int budget;

    public producer(String producerName, int budget) {
        this.Name = producerName;
        this.budget = budget;
    }
    public int remainingbudget(){
        return budget;
    }

    public int getBudget() {
        return budget;
    }
    
    

    @Override
    public String toString() {
        return "producer{" + "Name=" + Name + ", budget=" + budget + '}';
    }
    
}

    