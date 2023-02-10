
package Proyecto;

public abstract class NavesEspaciales {
    
    protected String nombre;
    protected String pais;
    protected String actividad;

    public NavesEspaciales(String nombre, String pais, String actividad) {
        this.nombre = nombre;
        this.pais = pais;
        this.actividad = actividad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPais() {
        return pais;
    }

    public String getActividad() {
        return actividad;
    }
    
    public abstract void viajar();
    
    public abstract void funcion();
    
    
}
