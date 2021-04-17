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

    public class lineProducer extends producer{
    private String name;
    private int expenses;

    public lineProducer(String name, int expenses, String Name, int budget) {
        super(Name, budget);
        this.name = name;
        this.expenses = expenses;
    }

    

    

    public int remainingbudget(){
        //super.budget-expenses;
        return super.getBudget()-expenses;
    }

        @Override
        public String toString() {
            return "producer{" + "name=" + name + ", expenses=" + expenses + '}';
        }
    

    
}
