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
public class NumeroEdadException extends Exception {
      public NumeroEdadException(){
        super("No es posible dar un valor en edad menor a 18");
    }
}
