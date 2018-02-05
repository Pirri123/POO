/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.tema4;

/**
 *
 * @author DanielAlexandro
 */
public abstract class Figuras implements iFiguras {
    //Atributos
    protected String color;
    
    /**
     * Constructor
     * @param color de la figura
     */
    public Figuras (String color) {
        System.out.println("Construyendo Figura");
        this.color = color;
    }
    
    /**
     * Method que imprime el color de la figura
     */
    public void getColor() {
        System.out.println("El color de la figura es: " + this.color);
    }
}
