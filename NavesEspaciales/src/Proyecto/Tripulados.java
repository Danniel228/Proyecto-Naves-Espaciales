
package Proyecto;

public class Tripulados extends NavesEspaciales {
    
    private String ejemplo;

    public Tripulados(String ejemplo, String nombre, String pais, String actividad) {
        super(nombre, pais, actividad);
        this.ejemplo = ejemplo;
    }

    public String getEjemplo() {
        return ejemplo;
    }
    
    
    @Override
    public void viajar(){
        System.out.println("Las naves tipo Tripulados viajan con tripulación a bordo");
    }
    
    @Override
    public void funcion(){
        System.out.println("Las naves tipo Tripulados transportan seres vivos hacia el espacio exterior");
    }
    
    public void LlevarTripulacion() {
        
        System.out.println("Estas naves tienen por mision llevar una tripulacion de 4 personas hacia la Luna");
    }
}
