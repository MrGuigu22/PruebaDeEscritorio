/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pruebadeescritorio;

/**
 *
 * @author santi
 */
public class PruebaDeEscritorio {

    public static void main(String[] args) {
        
        float suma = 0;
        float x = 20;
        suma = (suma + x );
        float y = 40;
        x = (float)(x + Math.pow(y,2));
        suma = (suma + (x/y)) ;
        System.out.println("el valor de la suma es: " + suma);
    }
}
