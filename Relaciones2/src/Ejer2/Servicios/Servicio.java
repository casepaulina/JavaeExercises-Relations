package Ejer2.Servicios;

import Ejer2.Entidades.Juego;
import Ejer2.Entidades.Jugador;
import Ejer2.Entidades.RevolverDeAgua;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class Servicio {

    Scanner leer = new Scanner(System.in);

//REVOLVER DE AGUA Métodos:
//• llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los valores deben ser aleatorios.
    public RevolverDeAgua llenarRevolver() {
        RevolverDeAgua ra = new RevolverDeAgua(); //Creo un objeto + instanciar
        int min = 1;
        int max = 5;
//Relleno Posicion Actual del revolver         
        Random random = new Random();
        ra.setPosicionActual(random.nextInt(max + min) + min);
        System.out.println("Posicion Actual del Revolver: " + ra.getPosicionActual());

        //Relleno Posicion del agua del revolver          
        ra.setPosicionAgua(random.nextInt(max + min) + min);
        System.out.println("Posicion del agua: " + ra.getPosicionAgua());
        return ra;
    }

    // • mojar(): devuelve true si la posición del agua coincide con la posición actual
    public boolean mojar(RevolverDeAgua ra) {
        boolean posicion = false;
        if (ra.getPosicionAgua() == ra.getPosicionActual()) {
            posicion = true;
            System.out.println(posicion);
        }
        return posicion;
    }

    //• siguienteChorro(): cambia a la siguiente posición del tambor
    public void siguienteChorro(RevolverDeAgua ra) {
        if (ra.getPosicionActual() == 6) {
            ra.setPosicionActual(1);
            System.out.println("Se reinicia el tambor");
        } else {
            ra.setPosicionActual(ra.getPosicionActual() + 1);
            System.out.println("Posicion actual: " + ra.getPosicionActual() + ". Posicion del agua: " + ra.getPosicionAgua());
        }
    }

    /*JUGADOR Métodos:
    
• disparo(Revolver r): el método, recibe el revolver de agua y llama a los métodos de
mojar() y siguienteChorro() de Revolver. El jugador se apunta, aprieta el gatillo y si el
revolver tira el agua, el jugador se moja. El atributo mojado pasa a false y el método
devuelve true, sino false.*/
    public Jugador CrearJugador( ) {
        
        Jugador j = new Jugador();
        
        
        //crear jugadores
                  
            System.out.println("Ingrese el ID del jugador");
            j.setId(leer.nextInt());
            
            System.out.println("Ingrese el nombre del jugador");
            j.setNombre(leer.next());
            
        return j;
        
    }

    public Juego AgregarJugadores(HashSet<Juego> Jugadores){
        Servicio s = new Servicio();
        String respuesta = null;
     
                do{
                Jugadores.addAll(Jugadores);
                
                System.out.println("Desea agregar otr jugador? s/n ");
            respuesta = leer.next();
            
        } while (!respuesta.equals("n") && !respuesta.equals("N"));
                
          for(Juego Jugador: Jugadores){        
            System.out.println("Los jugadores son: " +Jugadores);
        }       
        return null;      
      
    }
    public void disparo(RevolverDeAgua ra) {

        Servicio s = new Servicio();
        s.mojar(ra);
        s.siguienteChorro(ra);

    }

    /*JUEGO Métodos:
• llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los
jugadores y el revolver para guardarlos en los atributos del juego.
    
• ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego,
sino se moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se
tiene que mojar. Al final del juego, se debe mostrar que jugador se mojó.
Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego.*/
    public void llenarJuego(ArrayList<Jugador> jugadores) {

    }

    public void ronda() {

    }

}
