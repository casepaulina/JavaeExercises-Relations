/*
Clase Jugador: esta clase posee los siguientes atributos: id (representa el número del
jugador), nombre (Empezara con Jugador más su ID, “Jugador 1” por ejemplo) y mojado
(indica si está mojado o no el jugador). El número de jugadores será decidido por el
usuario, pero debe ser entre 1 y 6. Si no está en este rango, por defecto será 6.
 */
package Ejer2.Entidades;

public class Jugador {

    //Atributos
    private int id;
    private String nombre;
    private String mojado;

    //METODO VACIO
    public Jugador() {
    }

    //METODO CON PARAMETROS
    public Jugador(int id, String nombre, String mojado) {

        this.id = id;
        this.nombre = nombre;
        this.mojado = mojado;
    }

     //GET  y SET

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMojado() {
        return mojado;
    }

    public void setMojado(String mojado) {
        this.mojado = mojado;
    }

   
    
    //To String

    @Override
    public String toString() {
        return "Jugador{" + "id=" + id + ", nombre=" + nombre + ", mojado=" + mojado + '}';
    }

 
    
}
