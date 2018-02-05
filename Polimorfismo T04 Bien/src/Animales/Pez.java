/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Animales;
import poo.eramirez.t04.Animales;
/**
 *
 * @author Netito
 */
public class Pez extends Animales{
    //Atributos
    protected int aletas;
    protected String reproduccion;
    /**
     * 
     * @param raza: Se pide la raza del animal, ejemplo Gran Danes, Pez Payaso, etc 
     * @param aletas: La cantidad de aletas que tiene el animal 
     * @param reproduccion: La forma de reproduccion de estos animales 
     */
    public Pez (String raza, int aletas, String reproduccion) {
     super (raza);  
      this.aletas = aletas;
      this.reproduccion = reproduccion;
    }

    @Override
    public void getCuerpo() {
        System.out.println("Los peces tienen " + this.aletas + " aletas");
    }

    @Override
    public void getReproduccion() {
        System.out.println("Los peces son " + this.reproduccion);
    }
    
    
}

