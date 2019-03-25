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


    ENCENDER_LUCES_GENERALES(1, ""),
    ENCENDER_LUCES_SALON(2, ""), 
    ENCENDER_LUCES_DORMOTORIO(3, ""),
    APAGAR_LUCES_GENERALES(4, ""),
    APAGAR_LUCES_SALON(5, ""), 
    APAGAR_LUCES_DORMOTORIO(6, ""), 
    ENCENDER_CAMARAS(7, ""), 
    APAGAR_CAMARAS(8, ""),
    VER_CAMARAS(9, ""),
    SUBIR_PERSIANAS_GENERALES(10, ""), 
    SUBIR_PERSIANAS_SALON(11, ""),
    SUBIR_PERSIANAS_DORMOTORIO(12, ""),
    PERSIANA_A_LA_MITAD_GENERALES(13, ""),
    PERSIANA_A_LA_MITAD_SALON(14, ""),
    PERSIANA_A_LA_MITAD_DORMOTORIO(15, ""),
    CERRAR_PERSIANAS_GENERALES(16, ""),
    CERRAR_PERSIANAS_SALON(17, ""), 
    CERRAR_PERSIANAS_DORMOTORIO(18, ""),
    CONSULTA_HORA(19, ""), 
    MODIFICAR_HORA(20, ""), 
    CONSULTA_FECHA(21, ""),
    MODIFICAR_FECHA(22, ""),
    SUBIR_PUERTA_GARAJE(23, ""),
    CERRAR_PUERTA_GARAJE(24, "");
    


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

