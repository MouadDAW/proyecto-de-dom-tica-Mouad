/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domotica;

/**
 *
 * @author Mouad
 */
public class Salon extends Habitacion {

    private boolean terraza;

    public Salon(Orientacion orientacion, Puerta puerta, Luz luz, Persiana persianas, int m2) {
        super(orientacion, puerta, luz, persianas, m2);

    }

    @Override
    public String toString() {
        return "Salon{" + "terraza=" + terraza + '}';
    }

    public boolean isTerraza() {
        return terraza;
    }

    public void setTerraza(boolean terraza) {
        this.terraza = terraza;
    }

    public Salon(boolean terraza, Orientacion orientacion, Puerta puerta, Luz luz, Persiana persianas, int m2) {
        super(orientacion, puerta, luz, persianas, m2);
        this.terraza = terraza;
    }

}
