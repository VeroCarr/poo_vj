package ejecicio;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Veronica
 */
public class AplicacionAlumno {
       public static void main(String[] args) {
        
        Alumno x=new Alumno();
        x.setNombre("Veronica");
        x.setNum_cuenta("16425629");
        x.setEdad(21);
        MetodoMensaje message=new MetodoMensaje();
        System.out.println(message.mostrarMensaje());
        
        
    }
    
}
