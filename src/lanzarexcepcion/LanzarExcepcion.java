/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lanzarexcepcion;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hola
 */
public class LanzarExcepcion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Usuario u1 = new Usuario("Pepe",10);
        try {
            u1.verificarEdad();
        } catch (InstantiationException ex) {
            System.out.println("Es menor de edad");
        }
    }
    
}
