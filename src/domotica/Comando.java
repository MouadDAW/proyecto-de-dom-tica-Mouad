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
public enum Comando {

    ABRIR_PUERTA(1, "Abrir puerta"),/**
     * 1 Este método abrir la puerta
     */
    CERRAR_PUERTA(2, "Cerrar puerta");
    /**
     * 2 Este método cerrar la puerta
     */


    private int codigo;
    private String descripcion;

    private Comando(int codigo, String descripcion) {
        this.codigo = codigo;
        this.descripcion = descripcion;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public String getDescripcion() {
        return this.descripcion;
    }
}

