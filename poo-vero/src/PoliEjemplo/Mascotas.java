/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PoliEjemplo;

import java.util.ArrayList;

/**
 *
 * @author T-102
 */
public class Mascotas {
    public static void main(String[] args) {
        Animal animales[]=new Animal[12];
        
        //Primero generamos a los gatos 
        animales[0]=new Gato();
        animales[1]=new Gato();
        animales[2]=new Gato();
        //Segundo generamos los perros
        animales[3]=new Perro();
        animales[4]=new Perro();
        //Siguen los Pollos
        animales[5]=new Pollo();
        animales[6]=new Pollo();
        animales[7]=new Pollo();
        animales[8]=new Pollo();
        animales[9]=new Pollo();
        
        animales[10]=new Raton();
        animales[11]=new Raton();
        
        ServicioAnimales s=new ServicioAnimales();
        //La mgia de la polimorfismo 
        
        for(Animal a : animales){
           s.servicioHacerRuido((ComportamientoAnimal) a); //Expresion Expresiva
        }
        //vamos a generar un ArrayList y poner allo algunos animales
        ArrayList<Animal> animalitos=new ArrayList<>();
    animalitos.add(new Pollo());
    animalitos.add(new Raton());
    animalitos.add(new Raton());
    animalitos.add(new Perro());
    animalitos.add(new Gato());
    for(Animal a:animalitos){
        s.servicioHacerRuido((ComportamientoAnimal)a);
    }
    animalitos.get(0).setEdad(1);
        System.out.println(animalitos.get(0).getEdad());
    }
}
