package Ejer1.Servicios;

import Ejer1.Entidades.Perro;
import Ejer1.Entidades.Persona;
import java.util.ArrayList;
import java.util.Scanner;

public class Servicio {

    Scanner leer = new Scanner(System.in);

    //METODO PARA CREAR UNA PERSONA
    public Persona CrearPersona() {

        Persona p = new Persona();

        System.out.println("Ingres el nombre de una Persona: ");
        p.setNombre(leer.next());

        System.out.println("Ingrese el apellido: ");
        p.setApellido(leer.next());

        System.out.println("Ingrese la edad: ");
        p.setEdad(leer.nextInt());

        System.out.println("Ingrese el numero de documento: ");
        p.setDocumento(leer.nextInt());

        return p;
    }

    //METODO PARA CREAR UN PERRO
    public Perro CrearPerro() {

        System.out.println("Ingrese el nombre del perro ");
        String nombre = leer.next();

        System.out.println("Ingrese la raza ");
        String raza = leer.next();

        System.out.println("Ingrese la edad ");
        int edad = leer.nextInt();

        System.out.println("Ingrese el tamanio ");
        String tamanio = leer.next();

        return new Perro(nombre, raza, edad, tamanio);

    }

    //METODO PARA SELECIONAR EL PERRO A ADOPTAR
    public Perro SeleccionarPerro(ArrayList<Perro> perros) {

        System.out.println("Los Perros disponibles para adoptar son: ");

        //muestro los perros disponibles con un for each
        for (Perro aux : perros) {
            System.out.println(aux);
        }

        //le pido al usuario que seleccione el perro
        System.out.println("Seleccione el perro que desea adoptar");
        String nombrePerro = leer.next();

        //hacemos un comparator para la seleccion del perro
        for (Perro aux : perros) {
            if (aux.getNombre().equals(nombrePerro)) {
                return aux;
            }
        }
        return null;
    }

    //METODO PARA ASIGNARLE EL PERRO A LA PERSONA
    public void AsignarPerro(ArrayList<Perro> perros, ArrayList<Persona> personas) {

        System.out.println("Ingrese el nombre de la persona: ");
        String nombrePersona = leer.next();

        //Con el bucle le asignamos un perro antes seleccionado a la persona antes ingresada. 
        //Con equals se chequea que el nombre ingresado este en la lista de personas
        for (Persona aux : personas) {
            if (nombrePersona.equals(aux.getNombre())) {
                aux.setPerro(SeleccionarPerro(perros));
            }
        }

    }

    //METODO MOSTRAR PERSONA
    public void mostrarPersona(ArrayList<Persona> personas) {

        for (Persona aux : personas) {
            System.out.println(aux);
        }

    }
}
