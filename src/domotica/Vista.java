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

        public static int Login(){

            int a = 0;
            System.out.println("Dime El nombre del Usuario");
            String usuario = teclado.nextLine();
            System.out.println("Dime la contraseña");
            String pass = teclado.nextLine();
            
            return a;
        }
        
        public static Comando menu(){
            System.out.println("");
            System.out.println("");
    }
    
}
