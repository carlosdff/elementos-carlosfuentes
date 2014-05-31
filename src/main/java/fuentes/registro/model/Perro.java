package fuentes.registro.model;


public class Perro {
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String obtenerRegistro(){
        return "el perrito que registraste es:"+nombre;
    }
    
    
    
}
