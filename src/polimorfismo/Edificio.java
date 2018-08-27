
package polimorfismo;

/**
 *
 * @author danie
 */
public class Edificio {
 private String direccion;
 private int pisos;

    public Edificio(String direccion, int pisos) {
        this.direccion = direccion;
        this.pisos = pisos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getPisos() {
        return pisos;
    }

    public void setPisos(int pisos) {
        this.pisos = pisos;
    }
    
      public String getDatos(){
        return "Direccion: " + direccion + " Pisos" + pisos;
   
   
   }
    
    
    
    
    
    
}
