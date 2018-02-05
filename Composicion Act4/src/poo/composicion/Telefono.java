/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.composicion;

import java.util.Scanner;
/**
 *
 * @author Netito
 */
public class Telefono {
    //Atributos, instanciar objetos
    
    botonApagar EA = new botonApagar();
    Scanner Input = new Scanner(System.in);
    Tecla [] [] Teclado = new Tecla [5][3];
    public static Contacto [] Lista = new Contacto [100];
    
     //Methods
    public Telefono (){
        
    }
    
   
    public static void guardaContactoEnN(int n, String name, String tel, String mail) {
        if (n < 100 && n >= 0) {
            Contacto Temp = new Contacto(name, tel, mail);
            Lista[n] = Temp;
        } else {
            System.out.println("El numero es invalido.");
        }
    }
    

    public static void guardaContacto(String name, String tel, String mail) {
        int espacio = buscaEspacio(Lista);
        if (espacio < 0) {
            System.out.println("Ya no hay mas espacio en la lista");
        } else {
            Contacto Temp = new Contacto(name, tel, mail);
            Lista[espacio] = Temp;
        }
    }

    
    private static int buscaEspacio(Contacto[] Lista) {
        int t = -1;
        for (int i = 0; i <= Lista.length; i++) {
            if (Lista[i] == null) {
                t = i;
                i = 101;
            }
        }
        return t;
    }

 
    public static void showContacto(int n) {
        Lista[n].getContacto();
    }
    
 
    public static void showLista() {
        for (int i = 0; i < Lista.length; i++) {
            if (Lista[i] == null) {
                System.out.println("Contacto " + i + ", no existe");
            } else {
                System.out.println("Contacto " + i);
                Lista[i].getContacto();
            }
        }
    }
    
    
    public void setTeclado (){
        int dig = 0;
          for (int i = 0; i < 5; i++){
            for (int j = 0; j < 3; j++){
                dig++;
                String d1 = String.valueOf(dig);
                Tecla temp = new Tecla();
                char d = d1.charAt(0);
                temp.setDigito(d);
           
        Teclado [i][j] = temp; 
        }
    }
        Tecla temp = new Tecla();
        Tecla temp1 = new Tecla();//Esto es critico, si no, el programa te va a tronar.
        Tecla temp2 = new Tecla();//Esto es critico, si no, el programa te va a tronar.
        Tecla temp3 = new Tecla();//Esto es critico, si no, el programa te va a tronar.
        Tecla temp4 = new Tecla();//Esto es critico, si no, el programa te va a tronar.
        Tecla temp5 = new Tecla();//Esto es critico, si no, el programa te va a tronar.
        Tecla temp6 = new Tecla();//Esto es critico, si no, el programa te va a tronar.
        
        temp1.setDigito('*');
        Teclado [3][0] = temp1;
        temp2.setDigito('0');
        Teclado [3][1] = temp2;
        temp3.setDigito('#');
        Teclado [3][2] = temp3;
        temp4.setDigito('c');
        Teclado [4][0] = temp4;
        temp5.setDigito('s');
        Teclado [4][1] = temp5;
        temp6.setDigito('m');
        Teclado [4][2] = temp6;

 
}
    
    }
    
   

