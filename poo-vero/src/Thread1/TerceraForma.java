/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Thread1;

import java.time.LocalTime;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author T-102
 */
public class TerceraForma {
    public static void main(String[] args) {
        Thread t1=new Thread(new Runnable(){//oontiene una 
            //implementacion del metodo run
            //de la Thread pero es abstracta
            public void run(){
                System.out.println("Un threaed bueno");
            } //Se cierra el metodod run
        }//Se cierra la interna anonima
        ); //Se cierra el constructor
        t1.start();
    }//se cierra el metodo main
}//se cierra ña clase