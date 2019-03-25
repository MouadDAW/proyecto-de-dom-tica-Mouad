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
public class Habitacion extends Estancia {

    private Orientacion orientacion;
    private Puerta puerta;
    private Luz luz;
    private Persiana persianas;

    public Habitacion(Orientacion orientacion, Puerta puerta, Luz luz, Persiana persianas, int m2) {
        super(m2);
        this.orientacion = orientacion;
        this.puerta = puerta;
        this.luz = luz;
        this.persianas = persianas;
    }
    

    public Luz getLuz() {
        return luz;
    }

    public void setLuz(Luz luz) {
        this.luz = luz;
    }

    public Orientacion getOrientacion() {
        return orientacion;
    }

    public void setOrientacion(Orientacion orientacion) {
        this.orientacion = orientacion;
    }

    public Puerta getPuerta() {
        return puerta;
    }

    public void setPuerta(Puerta puerta) {
        this.puerta = puerta;
    }

    public Persiana getPersianas() {
        return persianas;
    }

    public void setPersianas(Persiana persianas) {
        this.persianas = persianas;
    }

    @Override
    public String toString() {
        return "Habitacion{" + "orientacion=" + orientacion + ", puerta=" + puerta + ", luz=" + luz + ", persianas=" + persianas + '}';
    }

}
