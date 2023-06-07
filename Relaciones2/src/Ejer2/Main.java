/*
 Realizar el juego de la ruleta rusa de agua en Java. Como muchos saben, el juego se
trata de un número de jugadores, que, con un revolver de agua, el cual posee una sola
carga de agua, se dispara y se moja
 */
package Ejer2;

import Ejer2.Entidades.Juego;
import Ejer2.Entidades.Jugador;
import Ejer2.Entidades.RevolverDeAgua;
import Ejer2.Servicios.Servicio;
import java.util.HashSet;


public class Main {

    
    public static void main(String[] args) {
 
        Servicio servi = new Servicio();
        RevolverDeAgua ra = servi.llenarRevolver();        
        servi.mojar(ra);
        servi.siguienteChorro(ra);
        servi.CrearJugador();
        HashSet<Juego> Jugadores = new HashSet(); 
        servi.AgregarJugadores(Jugadores);
        
       
                
       
        
        
        
    }
    
   
    
}
