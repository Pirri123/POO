/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.eramirez.t04;
import Animales.*;
/**
 *
 * @author Netito
 */
public class POOERamirezT04 {

    /**
     * 
     * @param args 
     */
    public static void main(String[] args) {
     Perro P = new Perro ("Schnauzer", 4, "Viviparos");
        P.getRaza();
        P.getCuerpo();
        P.getReproduccion();
        System.out.println("");
    
    Gato G = new Gato ("Egipcio", 4, "Viviparos");      
        G.getRaza();
        G.getCuerpo();
        G.getReproduccion();
        System.out.println("");
        
    Pez P1 = new Pez ("Koi", 0, "Oviparos");
    P1.getRaza();
    P1.getCuerpo();
    P1.getReproduccion();
    System.out.println("");
    
    }
            
}
