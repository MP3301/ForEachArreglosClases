/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import domain.Persona;

/**
 *
 * @author s
 */
public class TestForEach {
    
    
    public static void main(String[] args) {
        Persona personas[] = {new Persona("Pancho"),new Persona("Pedro"),new Persona("Esteban Dido"),new Persona("Rosa Meltrozo")};
        //este es un ejemplo de un for each con objectos
        for(Persona persona: personas){
            System.out.println("edad ="+persona);
        }
    }
    
}
