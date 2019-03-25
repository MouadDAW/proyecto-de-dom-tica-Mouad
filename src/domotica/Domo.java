/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domotica;

/**
 *
 * @author mouad
 */
public class Domo {

    public static void main(String[] args) {

        Garaje g1 = new Garaje();

        Salon s1 = new Salon();

        Dormitorio d1 = new Dormitorio();

        Usuario user = new Usuario("usuario", "usuario");

        Centralita centralita = new Centralita("Centralita 1", g1, s1, d1, user);
    }
}
