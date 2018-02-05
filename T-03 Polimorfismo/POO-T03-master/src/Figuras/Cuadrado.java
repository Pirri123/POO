/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Figuras;
import poo.tema4.Figuras;
/**
 *
 * @author DanielAlexandro
 */
public class Cuadrado extends Figuras {
    //Atributos
    protected float lado;
    
    /**
     * Constructor
     * @param color de la figura
     * @param lado medida de la figura
     */ 
    public Cuadrado(String color, float lado) {
        super(color);
        this.lado = lado;
    }

    /**
     * Metodo que imprime los datos de los lados de la figura
     */
    @Override
    public void getDatos() {
        System.out.println("Lado: " + this.lado);
    }

    /**
     * 
     * Metodo que imprime el area de la figura(lado*lado)
     */
    @Override
    public void getArea() {
        float area;
        area = this.lado * this.lado;
        System.out.println("Area: " + area);
    }

    /**
     * Metodo que imprime el perimetro de la figura (lado*4)
     */
    @Override
    public void getPerimetro() {
        float perimetro;
        perimetro = this.lado * 4;
        System.out.println("Perimetro: " + perimetro);
    }
    
}
