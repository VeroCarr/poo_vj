
package Serializacion;

import java.io.*; //input output
public class PersistenciaUsuario {
    Usuario u;
    public Usuario getU() {
        return u;
    }

    public void setU(Usuario u) {
        this.u = u;
    }  
    //generamos el metodo para serializar a nuestro usuario
    public void guardar(){
       //Para serializar el primer paso es generar el archivo donde 
       //estara nuestro objeto usuario de tipo usuario 
       File file=new File("archivaldo.yo"); 
       //Despues lo abrimos para escribir sobre el 
       try{
       FileOutputStream fos=new FileOutputStream(file);
       //Luego Serializamos
       ObjectOutputStream oos=new ObjectOutputStream(fos);
       //Guardamos nuestro usuario
       oos.writeObject(u);
       //Ponemos un mensajito
           System.out.println("Objeto guardado con exito");
       }catch(Exception e){
           System.out.println(e.getMessage());
       }
    }  
 
    public Usuario recobrarUsuario(){
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
    }
}
