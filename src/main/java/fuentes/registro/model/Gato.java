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
public class Gato implements Mascota{
    
    private String nombre;
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    @Override

      public String obtenerRegistro(){
        return "el gato que registraste es:"+nombre;
    }
    
}
