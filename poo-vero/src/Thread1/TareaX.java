/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Thread1;

/**
 *
 * @author T-102
 * primera forma de crear un thread
 * heredando la clase thread
 */
public class TareaX extends Thread{

    @Override
    public void run() {
        
        System.out.println("Soy un thread muy sencillo"
        +" y me llamo "+Thread.currentThread().getName());
    }
}
