/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domotica;

import java.util.Scanner;

/**
 *
 * @author mouad
 */
public class Vista {

    // Identificar
    private static Scanner teclado = new Scanner(System.in);

    public static int Login() {

        int a = 0;
        System.out.println("Dime El nombre del Usuario");
        String usuario = teclado.nextLine();
        System.out.println("Dime la contraseña");
        String pass = teclado.nextLine();

        return a;
    }

    public static Comando menu() {

        System.out.println("bienvenido a nuestra Sistema");
        System.out.println("----------------------------");
        System.out.println("por favor introduzca el número del operaccion lo qui quira");
        System.out.println("1.Encender luces Generales");
        System.out.println("2.Encender luces Salon");
        System.out.println("3.Encender luces Dormitorio");
        System.out.println("4.Apagar luces Generales");
        System.out.println("5.Apagar luces Salon");
        System.out.println("6.Apagar luces Dormitorio");
        System.out.println("7.Encender Camaras");
        System.out.println("8.Apagar Camaras");
        System.out.println("9.Ver Camaras");
        System.out.println("10.Subir persianas Generales");
        System.out.println("11.Subir persianas Salon");
        System.out.println("12.Subir persianas Dormitorio");
        System.out.println("13.El persiana a la mitad Generales");
        System.out.println("14.El persiana a la mitad Salon");
        System.out.println("15.El persiana a la mitad Dormitorio");
        System.out.println("16.Cerrar persianas Generales");
        System.out.println("17.Cerrar persianas salon");
        System.out.println("18.Cerrar persianas Dormitorio");
        System.out.println("19.Consulta hora");
        System.out.println("20.Modificar hora");
        System.out.println("21.Consulta fecha");
        System.out.println("22.Modificar fecha");
        System.out.println("23.Subir la puerta del garaje");
        System.out.println("24.Cerrar la puerta del garaje");

    }

}
