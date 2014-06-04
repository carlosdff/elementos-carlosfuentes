package fuentes.registro.model;


public  class Perro implements Mascota{
    private String nombre;

    @Override
      public String obtenerRegistro(){
        return "el perrito que registraste es:"+nombre;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
  
    
    
}
