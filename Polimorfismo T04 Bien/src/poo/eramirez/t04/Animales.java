/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package poo.eramirez.t04;

/**
 *
 * @author Netito
 */
public abstract class Animales implements iAnimales{
   //Atributos
    protected String raza;

    
    /**
     * 
     * @param raza: Se pide la raza del animal, ejemplo Gran Danes, Pez Payaso, etc 
     *  
     */
    public Animales (String raza){
        this.raza = raza;
        
    }
    
    
   public void getRaza() {
       System.out.println("La raza del animal es: " + this.raza);
          
    } 
    
}
