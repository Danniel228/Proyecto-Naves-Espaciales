
package Proyecto;

import java.util.ArrayList;
import java.util.Scanner;

/*
    El ejercicio debe tener ejecucion infinita
      poder buscar naves

*/

public class Principal {
    
        /*creamos arreglo para almacenar las naves espaciales tipo Lanzaderas*/
        static ArrayList<NavesEspaciales> naves = new ArrayList<NavesEspaciales>();
        
        static Scanner entrada = new Scanner(System.in);
        
        static NavesEspaciales lanzadera1 = new Lanzaderas("Cohetes","Energía","Rusia","1987-1988");
        static NavesEspaciales lanzadera2 = new Lanzaderas("Cohetes","Falcon IX","EE.UU","2010 – Act");
        static NavesEspaciales lanzadera3 = new Lanzaderas("Cohetes","H-IIA","Japon","2001-Act");
        
        static NavesEspaciales robotica1 = new Roboticas("Satelites","Soho","Europa","1995- Act");
        static NavesEspaciales robotica2 = new Roboticas("Satelites","Luna I","Rusia","1959 – Act");
        static NavesEspaciales robotica3 = new Roboticas("Satelites","Galileo","EE.UU","1989 – 1995");
        
        static NavesEspaciales tripulado1 = new Tripulados("Transbordador", "Apolo","EE.UU","1966-1975");
        static NavesEspaciales tripulado2 = new Tripulados("Transbordador","Mir","Rusia","1986-2001");
        static NavesEspaciales tripulado3 = new Tripulados("Transbordador","Shenzou","China","1999-Act");
        
        
    
    public static void main(String[] args) {
        
        naves.add(lanzadera1);
        naves.add(lanzadera2);
        naves.add(lanzadera3);
        
        naves.add(robotica1);
        naves.add(robotica2);
        naves.add(robotica3);
        
        naves.add(tripulado1);
        naves.add(tripulado2);
        naves.add(tripulado3);
        
        menu();
            
    }
    
    public static void menu(){
        
        int opcion;
        
        do{
            System.out.println(":..MENU..:");
            System.out.println("1. Descripcion de naves disponibles");
            System.out.println("2. Para que viajan las naves");
            System.out.println("3. Cuál es la funcion de las naves");
            System.out.println("4. Mision de las naves");
            System.out.println("5. Ejemplo tipo de naves");  
            System.out.print("Opcion: ");
            opcion = entrada.nextInt();
            
            
            switch(opcion){
                
                case 1: System.out.println("");
                        lasNaves();
                         break;
                
                case 2: System.out.println("");
                        viajarNaves();
                         break;
                         
                case 3: System.out.println("");
                        funcion();
                        break;
                        
                case 4: System.out.println("");
                        misionNaves();
                        break;
                       
                case 5: System.out.println("");
                        Ejemplo();
                       break;
                 
                default: System.out.println("Error, se equivoco de opcion de menu");
                 break;
            }
                System.out.println("");
            
        }while (opcion !=5);
    }
    
    public static void lasNaves(){
        System.out.println("Tipo de naves: Lanzaderas, Tripuladas y Roboticas");
        System.out.println("");
        for(NavesEspaciales iterador: naves){
            System.out.println("Nombre: " + iterador.getNombre()+" Pais: "+ iterador.getPais()+" Actividad: "+ iterador.getActividad());
        }
    }
    
    public static void viajarNaves(){
        
        
        lanzadera1.viajar();
        robotica1.viajar();
        tripulado1.viajar();
 
    }
    
    public static void funcion(){
        lanzadera1.funcion();
        robotica1.funcion();
        tripulado1.funcion();
    }
    
    public static void misionNaves(){
        
        System.out.println("Las naves segun su clase tienen diferentes misiones ");
        System.out.println("");
  
        System.out.println("Lanzaderas: ");
        ((Lanzaderas)lanzadera3).volarMarte();
        
        System.out.println("\nRoboticas: ");
        
        ((Roboticas)robotica1).Orbitar();
   
        System.out.println("\nTripuladas: ");
        ((Tripulados)tripulado1).LlevarTripulacion();

    }
    
    public static void Ejemplo(){
        
        System.out.println("");
        System.out.println("Ejemplo lanzadera: " + ((Lanzaderas)lanzadera1).getEjemplo() + " " + "\nEjemplo Roboticas: "+((Roboticas)robotica1).getEjemplo() + "\nEjemplo Tripulados: "+ " " +((Tripulados)tripulado1).getEjemplo());
        
        
    }
    
    
    
}
