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
public class ValidarEdad {
       public static void validarValorEdad(int valor)throws NumeroEdadException{
        if(valor<18)throw new NumeroEdadException();
    }
}
