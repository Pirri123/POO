/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.composicion;

/**
 *
 * @author Netito
 */
public class Contacto {
  //Atributos 
    private String nombre, correo, numero;
    
    //Metodos
    //Constructor
    public Contacto(String nombre, String numero, String mail) {
        this.nombre = nombre;
        this.correo = mail;
        this.numero = numero;
    }

    /**
     * Method que imprime los datos del contacto
     */
    public void getContacto() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Numero: " + this.numero);
        System.out.println("mail: " + this.correo);
    }    
    
}
