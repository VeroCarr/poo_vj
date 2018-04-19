/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Thread1;

import java.time.LocalTime;



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
               // System.out.println("Un threaed bueno");
                while (true) {
                    try {
                        LocalTime tiempo = LocalTime.now();
                        int hora = tiempo.getHour();
                        int min = tiempo.getMinute();
                        int sec = tiempo.getSecond();
                        System.out.println("La hora es " + hora + ":" + min + ":" + sec);
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {

                    }
                }
            } //Se cierra el metodod run
        }//Se cierra la interna anonima
        ); //Se cierra el constructor
        t1.start();
    }//se cierra el metodo main
}//se cierra ña clase