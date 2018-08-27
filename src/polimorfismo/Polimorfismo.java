
package polimorfismo;


public class Polimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    Edificio edificio = new Edificio("celaya", 10);
    System.out.println(edificio.getDatos());
    
    Edificio edificio_poli = new Departamento("celaya", 10, 12, 4);
    System.out.println(edificio_poli.getDatos());
    
    
    
    
    
    
    }
   
    
    
    
}
