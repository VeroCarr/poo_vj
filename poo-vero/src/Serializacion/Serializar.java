
package Serializacion;

import java.io.*;
public class Serializar {
    public static void main(String[] args) {
        //Primero generamos un usuario
        Usuario u=new Usuario(20,"Pedro");
        //Generamos un modelo de la clase que serializaba 
        PersistenciaUsuario p=new PersistenciaUsuario();
        //Ajustamos su atribuot usuario
        p.setU(u);
        //Ahora si comprimimos
        p.guardar();
    }
}
