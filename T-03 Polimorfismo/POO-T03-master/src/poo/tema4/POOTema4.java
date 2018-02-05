/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.tema4;

import Figuras.*;

/**
 *
 * @author DanielAlexandro
 */
public class POOTema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Figuras c = new Cuadrado("Verde", (float) 2);
        c.getArea();
        c.getDatos();
        c.getPerimetro();
        c.getColor();
        
        Rectangulo r = new Rectangulo("Rojo", (float) 3, (float) 4);
        r.getArea();
        r.getDatos();
        r.getPerimetro();
        r.getColor();
        
        Triangulo t = new Triangulo("Azul", (float) 4, (float) 2, (float) 3, (float) 5);
        t.getArea();
        t.getDatos();
        t.getPerimetro();
        t.getColor();
    }
    
}
