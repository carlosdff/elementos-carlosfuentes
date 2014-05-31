/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fuentes.registro.model;

/**
 *
 * @author T107
 */
public class ProbarRegistro {
    
    public static void main(String args[]){
        Perro p=new Perro();
        p.setNombre("spot");
    Persona x=new Persona();
    x.setPerro(p);
    //el siguente es lo que recibira el cliente en el paso 4
    System.out.println(x.getPerro().getNombre());
    
    
    }
    
    
}
