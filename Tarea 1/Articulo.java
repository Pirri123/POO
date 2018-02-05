/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.eramirez.t01;

/**
 *
 * @author Netito
 */
public class Articulo {
    int sku;
    protected int existencia;
    protected double precio;
    protected double costo;
    String descripcion;
    
    public Articulo (int sku, double precio, String descripcion){
        this.sku = sku;
        this.existencia = 0;
        this.precio = precio;
        this.costo = 0;
        this.descripcion = descripcion;
    }
    
    public void compra (int cArt, double costo){
        this.existencia += cArt;
        this.costo = costo;  
    }
    
    public boolean venta (int cArt){
        if (verificarExistencia() >= cArt) {
            existencia -= cArt;
           return true;
       } else {
           return false;
       }
    }
    
    public int verificarExistencia (){
        return this.existencia;    
    }
    
    public void actualizaPrecio (double precio){
        this.precio = precio;
    }
}



