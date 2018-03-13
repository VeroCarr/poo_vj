/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Serializacion2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author T-102
 */
public class PersistenciaEmpleado {
    ArrayList<Empleado> empleados;

    public PersistenciaEmpleado() { //Constructor de defecto que inicializa el ArrayList 
        empleados=new ArrayList<>();
    }

    //generamos el metodo para serializar a nuestro usuario
    public void guardar(Empleado e){
       //Para serializar el primer paso es generar el archivo donde 
       //estara nuestro objeto usuario de tipo usuario 
       File file=new File("empleados.yo"); 
       if(file.exists()){
           empleados=buscarTodos();
       }
       //Despues lo abrimos para escribir sobre el 
       try{
       FileOutputStream fos=new FileOutputStream(file);
       //Luego Serializamos
       ObjectOutputStream oos=new ObjectOutputStream(fos);
       //Guardamos nuestro usuario
       empleados.add(e);
       oos.writeObject(empleados);
       //Ponemos un mensajito
           System.out.println("Objeto guardado con exito");
       }catch(Exception ex){
           System.out.println(ex.getMessage());
       }
    }  
    
    public ArrayList<Empleado> buscarTodos()
    {
        File file=new File("empleados.yo");
        try{
            FileInputStream fis=new FileInputStream(file);
            ObjectInputStream ois=new ObjectInputStream(fis);
            empleados=(ArrayList<Empleado>)ois.readObject();
        }catch(Exception e){
            
        }
        return empleados;
    }
   /* public Usuario recobrarUsuario(){
        File file=new File("archivaldo.yo"); 
        Usuario recobrado=null;
        //El proceso inverso
        try{
            FileInputStream fis=new FileInputStream(file);
            ObjectInputStream ois=new ObjectInputStream(fis);
            recobrado=(Usuario) ois.readObject();
        }catch(Exception e){
            
        }
        return recobrado;
    }*/   
}
