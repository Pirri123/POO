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
public class POOERamirezT01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Instancia de la clase Artículo
        Articulo telefono = new Articulo(120899,11500.00,"Iphone 6s 16Gb");
        //Compra de 50 teléfonos
        telefono.compra(50, 9890.00);
        //Muestra la existencia en almacén
        System.out.println("La existencia en almacen del articulo es " + 
                            telefono.verificarExistencia());
        //Se realiza una venta
        System.out.println("Se venden 15 telefonos");
        telefono.venta(15);
        
        System.out.println("La nueva existencia despues de la venta es "+
                            telefono.verificarExistencia());
        //Se realiza actualización de precios
        System.out.println("Hay una promo, y el nuevo precio es $10,000.00");
        telefono.actualizaPrecio(10000.00);
    } 
}

