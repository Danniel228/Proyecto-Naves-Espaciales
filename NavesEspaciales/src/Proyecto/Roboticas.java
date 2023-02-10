
package Proyecto;


public class Roboticas extends NavesEspaciales {
    
  private String ejemplo;

    public Roboticas(String ejemplo, String nombre, String pais, String actividad) {
        super(nombre, pais, actividad);
        this.ejemplo = ejemplo;
    }

    public String getEjemplo() {
        return ejemplo;
    }
   
    
    
    @Override
    public void viajar(){
        System.out.println("Las naves tipo roboticas viajan orbitando los diferentes cuerpos celestes");
    }
    
    @Override
    public void funcion(){
        System.out.println("Las naves tipo roboticas son usadas para investigaciones cientificas");
    }
    
    public void Orbitar(){
        System.out.println("Estas naves tienen como mision realizar investigaciones orbitando sobre Jupiter y Marte");
    }
}
