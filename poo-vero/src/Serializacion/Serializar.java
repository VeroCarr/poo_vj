
package Serializacion;

import java.util.ArrayList;

import java.io.*;
public class Serializar {
    public static void main(String[] args) {
        //Primero generamos un usuario
        Arraylist<Empleado> emp=new Arraylist<>();
        //Generamos un modelo de la clase que serializaba 
        PersistenciaUsuario p=new PersistenciaUsuario();
        //Ajustamos su atribuot usuario
        p.setU(u);
        //Ahora si comprimimos
        p.guardar();
    }
}
