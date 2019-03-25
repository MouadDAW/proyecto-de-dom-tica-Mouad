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


    ENCENDER_LUCES_GENERALES(1, "Encender luces Generales"),
    ENCENDER_LUCES_SALON(2, "Encender luces Salon"), 
    ENCENDER_LUCES_DORMOTORIO(3, "Encender luces Dormitorio"),
    APAGAR_LUCES_GENERALES(4, "Apagar luces Generales"),
    APAGAR_LUCES_SALON(5, "Apagar luces Salon"), 
    APAGAR_LUCES_DORMOTORIO(6, "Apagar luces Dormitorio"), 
    ENCENDER_CAMARAS(7, "Encender Camaras"), 
    APAGAR_CAMARAS(8, "Encender Camaras"),
    VER_CAMARAS(9, "Ver Camaras"),
    SUBIR_PERSIANAS_GENERALES(10, "Subir persianas Generales"), 
    SUBIR_PERSIANAS_SALON(11, "Subir persianas Salon"),
    SUBIR_PERSIANAS_DORMOTORIO(12, "Subir persianas Dormitorio"),
    PERSIANA_A_LA_MITAD_GENERALES(13, "El persiana a la mitad Generales"),
    PERSIANA_A_LA_MITAD_SALON(14, "El persiana a la mitad Salon"),
    PERSIANA_A_LA_MITAD_DORMOTORIO(15, "El persiana a la mitad Dormitorio"),
    CERRAR_PERSIANAS_GENERALES(16, "Cerrar persianas Generales"),
    CERRAR_PERSIANAS_SALON(17, "Cerrar persianas salon"), 
    CERRAR_PERSIANAS_DORMOTORIO(18, "Cerrar persianas Dormitor"),
    CONSULTA_HORA(19, "Consulta hora"), 
    MODIFICAR_HORA(20, "Modificar hora"), 
    CONSULTA_FECHA(21, "Consulta fecha"),
    MODIFICAR_FECHA(22, "Modificar fecha"),
    SUBIR_PUERTA_GARAJE(23, "Subir la puerta del garaje"),
    CERRAR_PUERTA_GARAJE(24, "Cerrar la puerta del garaje");
    


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

