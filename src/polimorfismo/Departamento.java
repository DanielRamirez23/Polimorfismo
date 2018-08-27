
package polimorfismo;

/**
 *
 * @author danie
 */
public class Departamento extends Edificio {
    private int numero_interior;
    private int numero_cuartos;

    public Departamento(String direccion, 
                        int pisos,
                        int numero_interior,
                        int numero_cuartos) {
        
        super(direccion, pisos);
        this.numero_interior = numero_interior;
        this.numero_cuartos = numero_cuartos;

            
    }

    public int getNumero_interior() {
        return numero_interior;
    }

    public void setNumero_interior(int numero_interior) {
        this.numero_interior = numero_interior;
    }

    public int getNumero_cuartos() {
        return numero_cuartos;
    }

    public void setNumero_cuartos(int numero_cuartos) {
        this.numero_cuartos = numero_cuartos;
    }
    
   public String getDatos(){
        return "Direccion: " + getDireccion() +
                  " cantidad de pisos: " + numero_interior +
                  "numero de cuartos" + numero_cuartos;
   
   
   }
    
}
