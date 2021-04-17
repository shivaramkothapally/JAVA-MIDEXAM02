/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author S542269
 */
public enum planets {
    
    EARTH(460, 9.8, "moon"), MARS(480, 3.721, "phobos");
    private int speed;
    private double gravity;
    private String naturalsatellite;

    private planets(int speed, double gravity, String naturalsatellite) {
        this.speed = speed;
        this.gravity = gravity;
        this.naturalsatellite = naturalsatellite;
    }

    public static planets getEARTH() {
        return EARTH;
    }

    public static planets getMARS() {
        return MARS;
    }

    public int getSpeed() {
        return speed;
    }

    public double getGravity() {
        return gravity;
    }

    public String getNaturalsatellite() {
        return naturalsatellite;
    }

}
