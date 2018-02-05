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
public class botonApagar {
 //atributos
    public Boolean Io;
    
    public botonApagar(){
        this.Io = false;
    }
    public void presionar (){
        this.Io = !this.Io;
    }
}
