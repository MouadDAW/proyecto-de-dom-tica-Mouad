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
    ENCENDER_LUCES_SALON, 
    ENCENDER_LUCES_DORMOTORIO,
    APAGAR_LUCES_GENERALES,
    APAGAR_LUCES_SALON, 
    APAGAR_LUCES_DORMOTORIO, 
    ENCENDER_CAMARAS, 
    APAGAR_CAMARAS,
    VER_CAMARAS,
    SUBIR_PERSIANAS_GENERALES, 
    SUBIR_PERSIANAS_SALON,
    SUBIR_PERSIANAS_DORMOTORIO,
    PERSIANA_A_LA_MITAD_GENERALES,
    PERSIANA_A_LA_MITAD_SALON,
    PERSIANA_A_LA_MITAD_DORMOTORIO,
    CERRAR_PERSIANAS_GENERALES,
    CERRAR_PERSIANAS_SALON, 
    CERRAR_PERSIANAS_DORMOTORIO,
    CONSULTA_HORA, 
    MODIFICAR_HORA, 
    CONSULTA_FECHA,
    MODIFICAR_FECHA,
    SUBIR_PUERTA_GARAJE,
    CERRAR_PUERTA_GARAJE;
    


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

