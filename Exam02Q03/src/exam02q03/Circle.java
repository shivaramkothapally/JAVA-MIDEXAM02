/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam02q03;

/**
 *
 * @author Shivaram kothapally
 */
class Circle {
    private String color;
    private int radius;

    public Circle(String color, int radius) {
        this.color = color;
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" + "color=" + color + ", radius=" + radius + '}';
    }
    
    

    
}
