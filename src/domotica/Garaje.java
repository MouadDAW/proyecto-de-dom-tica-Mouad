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
public class Garaje extends Estancia {

    private int capacidadVehiculos;
    private Puerta puerta;

    public Garaje(int capacidadVehiculos, Puerta puerta, int m2) {
        super(m2);
        this.capacidadVehiculos = capacidadVehiculos;
        this.puerta = puerta;
    }

    public int getCapacidadVehiculos() {
        return capacidadVehiculos;
    }

    public void setCapacidadVehiculos(int capacidadVehiculos) {
        this.capacidadVehiculos = capacidadVehiculos;
    }

    public Puerta getPuertaGaraje() {
        return puerta;
    }

    public void setPuerta(Puerta puerta) {
        this.puerta = puerta;
    }

    public Garaje() {

        this.capacidadVehiculos = 0;
        this.puerta = new Puerta();
    }

    @Override
    public String toString() {
        return super.toString() + "\nGaraje{" + "capacidadVehiculos=" + capacidadVehiculos + ", puerta=" + puerta + '}';
    }
}
