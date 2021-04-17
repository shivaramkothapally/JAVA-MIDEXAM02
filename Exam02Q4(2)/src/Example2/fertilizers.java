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
public class fertilizers extends chemicals {
    private String type;
    private String color;

    public fertilizers(String type, String color, String name, String formula) {
        super(name, formula);
        this.type = type;
        this.color = color;
    }
    
    public String getformula(){
        return super.getforumla()+color;
    }

    @Override
    public String toString() {
        return "fertilizers{" + "type=" + type + ", color=" + color + '}';
    }

    
    
    
    
}
