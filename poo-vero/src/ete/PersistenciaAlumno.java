/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ete;

import Serializacion2.Empleado;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author T-102
 */
public class PersistenciaAlumno {
     ArrayList<Alumno> alumnos;
     public PersistenciaAlumno(){
         alumnos=new ArrayList<>();
     }
     public ArrayList<Alumno> leerTodos(){
         File file=new File("alumnos");
         try {
             FileInputStream fis=new FileInputStream(file);
             ObjectInputStream ois=new ObjectInputStream(fis);
         } catch (Exception e) {
             System.out.println("Esto leer"+e.getMessage());
         }
         return alumnos;
     }
     
     public void guardar(Alumno alumno){
         try {
             File file=new File("alumnos");
             if(file.exists())alumnos=leerTodos();
             FileOutputStream fos=new FileOutputStream(file);
             ObjectOutputStream oos=new ObjectOutputStream(fos);
             
             alumnos.add(alumno);
             
             oos.writeObject(alumnos);
         } catch (Exception ex) {
             System.out.println(ex.getMessage());
         }
     }

   
    
}
