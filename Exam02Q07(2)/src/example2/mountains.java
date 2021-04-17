/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example2;

/**
 *
 * @author S542269
 */
public enum mountains {
    EASTERNGHATS("block",5500,860.3), WESTERNGHATS("folded",6245,589.7);
    private String type;
    private int distance;
    private double height;

    private mountains(String type, int distance, double height) {
        this.type = type;
        this.distance = distance;
        this.height = height;
    }

    public static mountains getEASTERNGHATS() {
        return EASTERNGHATS;
    }

    public static mountains getWESTERNGHATS() {
        return WESTERNGHATS;
    }

    public String getType() {
        return type;
    }

    public int getDistance() {
        return distance;
    }

    public double getHeight() {
        return height;
    }
    
    
    
}
