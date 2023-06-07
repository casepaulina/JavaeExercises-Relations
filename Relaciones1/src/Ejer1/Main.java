/*
 Realizar un programa para que una Persona pueda adoptar un Perro.

Vamos a contar de dos clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; 
y la clase Persona con atributos: nombre, apellido, edad, documento y Perro.

Ahora deberemos en el main crear dos Personas y dos Perros. 

Después, vamos a tener que pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo,
mostrar desde la clase Persona, la información del Perro y de la Persona.
 */
package Ejer1;

import Ejer1.Entidades.Perro;
import Ejer1.Entidades.Persona;
import Ejer1.Servicios.Servicio;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Perro> perros = new ArrayList();
        ArrayList<Persona> personas = new ArrayList();

        Servicio servi = new Servicio();

        //Persona 1  
        personas.add(servi.CrearPersona());

        //Persona 2  
        personas.add(servi.CrearPersona());

        //Perro 1  
        perros.add(servi.CrearPerro());

        //Perro 2            
        perros.add(servi.CrearPerro());
        
        //Seleccionar Perro
       servi.SeleccionarPerro(perros);
       
       //Asignar perro a persona
       servi.AsignarPerro(perros, personas);
      
       //Mostar datos de la persona
       servi.mostrarPersona(personas);
        

    }

}
