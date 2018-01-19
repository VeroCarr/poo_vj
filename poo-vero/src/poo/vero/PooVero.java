/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.vero;

/**
 *
 * @author T-102
 */
public class PooVero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Tenemos que generar antes los objetos de las clases anteriores
        Usuario x=new Usuario();
        x.altura=1.68f;
        x.peso=71f;
        Imc algo=new Imc();
        algo.u=x;
        //calculamos el imc a traves de su objeto 
        System.out.println(algo.calcular());
        
        
    }
    
}
