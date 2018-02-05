/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.herencia.transportes;

/**
 * Programamos Superclase/Clase Base/Clase Padre
 * @author DanielAlexandro
 */
public class Vehiculo {
    //Atributos
    protected String placa, modelo;
    protected int pasajeros;
    
    //Methods
    /**
     * Constructor
     * @param placa Es la placa del vehiculo
     * @param modelo El modelo del vehiculo
     * @param pasajeros Numero de pasajeros
     */
    public Vehiculo(String placa, String modelo, int pasajeros){
        this.placa = placa;
        this.modelo = modelo;
        this.pasajeros = pasajeros;
    }
    
    /**
     * Metodo que devuleve la placa del vehiculo
     * @return la placa en formato String
     */
    public String getPlaca(){
        return this.placa;
    }
    
    /**
     * Metodo que devuelve el metodo del vehiculo
     * @return una cadena con el modelo del vehiculo
     */
    public String getModelo(){
        return this.modelo;
    }
    
    /**
     * Metodo para notificar la capacidad maxima del vehiculo
     * @return un entero con la cantidad maxima de pasajeros
     */
    public int getPasajeros(){
        return this.pasajeros;
    }
}
