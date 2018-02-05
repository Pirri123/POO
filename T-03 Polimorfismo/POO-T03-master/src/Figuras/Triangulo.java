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
public class Triangulo extends Figuras {
    //Atributos
    float lado1;
    float lado2;
    float lado3;
    float altura;
    
    /**
     * Constructor
     * @param color de la figura
     * @param lado1, el ladoy mayor de la figura, su medida
     * @param lado2 medida del lado 2
     * @param lado3 medida del lado 3
     * @param altura medida de la figura
     */
    public Triangulo(String color, float lado1, float lado2, float lado3, float altura) {
        super(color);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    /**
     * Metodo que imprime los datos de los lados de la figura
     */
    @Override
    public void getDatos() {
        System.out.println("Lado mayor: " + this.lado1);
        System.out.println("Lado 2: " + this.lado2);
        System.out.println("Lado 3: " + this.lado3);
        System.out.println("Altura: " + this.altura);
    }

    /**
     * 
     * Metodo que imprime el area de la figura((base*altura)/2)
     */
    @Override
    public void getArea() {
        float area;
        area = (this.lado1 * this.altura) / 2;
        System.out.println("Area: " + area);
    }

    /**
     * Metodo que imprime el perimetro de la figura (lado1+lado2+lado3)
     */
    @Override
    public void getPerimetro() {
        float perimetro;
        perimetro = (this.lado1 + this.lado2 + this.lado3);
        System.out.println("Perimetro: " + perimetro);
    }
}
