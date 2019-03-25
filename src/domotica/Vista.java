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

    
    int comando = teclado.nextInt();

        switch (comando) {
            case 1:
                return Comando.ENCENDER_LUCES_GENERALES;
            case 2:
                return Comando.ENCENDER_LUCES_SALON;
            case 3:
                return Comando.ENCENDER_LUCES_DORMOTORIO;
            case 4:
                return Comando.APAGAR_LUCES_GENERALES;
            case 5:
                return Comando.APAGAR_LUCES_SALON;
            case 6:
                return Comando.APAGAR_LUCES_DORMOTORIO;
            case 7:
                return Comando.ENCENDER_CAMARAS;
            case 8:
                return Comando.APAGAR_CAMARAS;
            case 9:
                return Comando.VER_CAMARAS;
            case 10:
                return Comando.SUBIR_PERSIANAS_GENERALES;
            case 11:
                return Comando.SUBIR_PERSIANAS_SALON;
            case 12:
                return Comando.SUBIR_PERSIANAS_DORMOTORIO;
            case 13:
                return Comando.PERSIANA_A_LA_MITAD_GENERALES;
            case 14:
                return Comando.PERSIANA_A_LA_MITAD_SALON;
            case 15:
                return Comando.PERSIANA_A_LA_MITAD_DORMOTORIO;
            case 16:
                return Comando.CERRAR_PERSIANAS_GENERALES;
            case 17:
                return Comando.CERRAR_PERSIANAS_SALON;
            case 18:
                return Comando.CERRAR_PERSIANAS_DORMOTORIO;
            case 19:
                return Comando.CONSULTA_HORA;
            case 20:
                return Comando.MODIFICAR_HORA; 
            case 21:
                return Comando.CONSULTA_FECHA;
            case 22:
                return Comando.MODIFICAR_FECHA;
            case 23:
                return Comando.SUBIR_PUERTA_GARAJE;
            case 24:
                return Comando.CERRAR_PUERTA_GARAJE;
          

        }
        return null;

    }

}
