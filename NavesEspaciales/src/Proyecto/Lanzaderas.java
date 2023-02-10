
package Proyecto;


public class Lanzaderas extends NavesEspaciales {
    
    private String ejemplo;

    public Lanzaderas(String ejemplo, String nombre, String pais, String actividad) {
        super(nombre, pais, actividad);
        this.ejemplo = ejemplo;
    }

    public String getEjemplo() {
        return ejemplo;
    }
    
    
    @Override
    public void viajar(){
        System.out.println("Las naves tipo lanzaderas viajan por propulsión");
    }
    
    @Override
    public void funcion(){
        System.out.println("Las naves tipo lanzaderas transporta carga util desde la tierra al espacio");
    }
    
    public void volarMarte(){
        System.out.println("Estas naves tienen como mision volar hacia Marte");
    }
}
