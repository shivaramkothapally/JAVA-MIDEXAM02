/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam02q03;

/**
 *
 * @author S542269
 */
public class Loan {
 private String fixedloan;
private String  depoistloan;

    public Loan(String fixedloan, String depoistloan) {
        this.fixedloan = fixedloan;
        this.depoistloan = depoistloan;
    }

    @Override
    public String toString() {
        return "Loan{" + "fixedloan=" + fixedloan + ", depoistloan=" + depoistloan + '}';
    }

   
   
}
