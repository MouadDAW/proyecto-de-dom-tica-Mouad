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
public class Puerta {

    private boolean estado;
    private int retardo;

    public Puerta(boolean estado, int retardo) {
        this.estado = estado;
        this.retardo = retardo;
    }

    Puerta() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getRetardo() {
        return retardo;
    }

    public void setRetardo(int retardo) {
        this.retardo = retardo;
    }

    @Override
    public String toString() {
        return "Puerta{" + "estado=" + estado + ", retardo=" + retardo + '}';
    }

    public void abrirPuerta() {
        if (estado == false) {
            this.estado = true;
        } else {
            System.out.println("La Puerta abierta");
        }
    }

    public void cerrarPuerta() {
        if (estado == true) {
            this.estado = false;
        } else {
            System.out.println("La Puerta cerrada");
        }
    }

}
