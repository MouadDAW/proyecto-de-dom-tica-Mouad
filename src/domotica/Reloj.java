/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domotica;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author Mouad
 */
public class Reloj {

    public static void mostrarHora() {
        LocalTime now = LocalTime.now();
        System.out.println("La Hora actual es: " + now);
    }

    public static void mostrarFecha() {
        LocalDate now = LocalDate.now();
        System.out.println("Hoy es " + now);
    }

}
