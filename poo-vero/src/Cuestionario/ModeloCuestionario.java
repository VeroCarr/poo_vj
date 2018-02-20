
package Cuestionario;

import java.util.*;

public class ModeloCuestionario {
    ArrayList<Pregunta> preguntas;
    public ModeloCuestionario(){
        //Aqui vamos a generar nuestro cuestionario 
        preguntas=new ArrayList<>();
    }
    
    public void agregarPregunta(Pregunta p){
        preguntas.add(p);
    }
    
    public ArrayList<Pregunta> obtenerCuestionario(){
        return preguntas;
    }
}
