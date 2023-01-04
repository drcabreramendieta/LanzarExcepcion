/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lanzarexcepcion;

/**
 *
 * @author hola
 */
public class Usuario {
    private String nombre;
    private int edad;

    public Usuario(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public void verificarEdad() throws java.lang.InstantiationException{
        if(edad < 18){
            throw new java.lang.InstantiationException("Es menor de edad con "+edad+" años");
        }
        else{
            System.out.println("Es mayor de edad");
        }
    }
}
