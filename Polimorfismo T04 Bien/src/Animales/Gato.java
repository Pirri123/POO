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
public class Gato extends Animales{
    //Atributos
    protected int patas;
    protected String reproduccion;
    /**
     * 
     * @param raza: Se pide la raza del animal, ejemplo Gran Danes, Pez Payaso, etc 
     * @param patas: La cantidad de patas que tiene el animal 
     * @param reproduccion: La forma de reproduccion de estos animales 
     */
    public Gato (String raza, int patas, String reproduccion) {
     super (raza);  
      this.patas = patas;
      this.reproduccion = reproduccion;
    }

    
    @Override
    public void getCuerpo() {
        System.out.println("Los gatos tienen " + this.patas + " patas");
    }

    @Override
    public void getReproduccion() {
        System.out.println("Los gatos son " + this.reproduccion);
    }
    
    
}
