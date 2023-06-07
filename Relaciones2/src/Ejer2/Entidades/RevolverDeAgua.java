/*
Esta clase posee los siguientes atributos: posición actual
(posición del tambor que se dispara, puede que esté el agua o no) y posición agua (la
posición del tambor donde se encuentra el agua). Estas dos posiciones, se generarán
aleatoriamente.
 */
package Ejer2.Entidades;

public class RevolverDeAgua {
    
    
    //Atributos
    private int PosicionActual;
    private int  PosicionAgua;
    
    //METODO VACIO
    public RevolverDeAgua(){
    }
    
    //METODO CON PARAMETROS
    public RevolverDeAgua(int  PosicionActual, int  PosicionAgua){
        
        this.PosicionActual = PosicionActual;
        this.PosicionAgua=PosicionAgua;
    }
    
    //GET  y SET

    public int  getPosicionActual() {
        return PosicionActual;
    }

    public void setPosicionActual(int PosicionActual) {
        this.PosicionActual = PosicionActual;
    }

    public int getPosicionAgua() {
        return PosicionAgua;
    }

    public void setPosicionAgua(int PosicionAgua) {
        this.PosicionAgua = PosicionAgua;
    }

    //To String

    @Override
    public String toString() {
        return "RevolverDeAgua{" + "PosicionActual=" + PosicionActual + ", PosicionAgua=" + PosicionAgua + '}';
    }
    
    
}
