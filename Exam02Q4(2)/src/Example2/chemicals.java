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
public class chemicals {
    
    private String name;
    private String formula;

    public chemicals(String name, String formula) {
        this.name = name;
        this.formula = formula;
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFormula() {
        return formula;
    }

    public void setFormula(String formula) {
        this.formula = formula;
    }
    
    public String getforumla(){
        return formula;
    }

    @Override
    public String toString() {
        return "chemicals{" + "name=" + name + ", formula=" + formula + '}';
    }
    
    
    
}
