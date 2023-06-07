/*
Esta clase posee los siguientes atributos: Jugadores (conjunto de
Jugadores) y Revolver
 */
package Ejer2.Entidades;

import java.util.HashSet;


public class Juego {

    //Atributos
    private HashSet<Juego> Jugadores = new HashSet();
    private int Revolver;
    
    //METODO VACIO
    public Juego() {
    }

    //METODO CON PARAMETROS
    public Juego(HashSet<Juego> Jugadores, int Revolver) {
        this.Jugadores = Jugadores;
        this.Revolver = Revolver;
    }

    //GET  y SET

    public HashSet<Juego> getJugadores() {
        return Jugadores;
    }

    public void setJugadores(HashSet<Juego> Jugadores) {
        this.Jugadores = Jugadores;
    }

    public int getRevolver() {
        return Revolver;
    }

    public void setRevolver(int Revolver) {
        this.Revolver = Revolver;
    }

    //To String

    @Override
    public String toString() {
        return "Juego{" + "Jugadores=" + Jugadores + ", Revolver=" + Revolver + '}';
    }


  
    
    
    
}
