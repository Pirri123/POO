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
public class Rectangulo extends Figuras {
    //Atributos
    private float base;
    private float altura;
    
    /**
     * Constructor
     * @param color de la figura
     * @param base medida de la figura
     * @param altura medida de la figura
     */
    public Rectangulo(String color, float base, float altura) {
        super(color);
        this.base = base;
        this.altura = altura;
    }

    /**
     * Metodo que imprime los datos de los lados de la figura
     */
    @Override
    public void getDatos() {
        System.out.println("Base: " + this.base);
        System.out.println("Altura: " + this.altura);
    }

    /**
     * 
     * Metodo que imprime el area de la figura(base*altura)
     */
    @Override
    public void getArea() {
        float area;
        area = this.base * this.altura;
        System.out.println("Area: " + area);
    }

    /**
     * Metodo que imprime el perimetro de la figura ((base*2) + (altura*2))
     */
    @Override
    public void getPerimetro() {
        float perimetro;
        perimetro = (this.base * 2) + (this.altura * 2);
        System.out.println("Perimetro: " + perimetro);
    }
    
}
