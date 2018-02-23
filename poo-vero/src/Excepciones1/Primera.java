package Excepciones1;

public class Primera {
    public static void main(String[] args) {
        //Vamos a crear un arreglo
        int[] valores={2,6,-8,5};
        
        for(int i=0;i<=valores.length;i++){
         // System.out.println("valor "+valores[i]); ArrayIndexOutOfBoundsException
        }
        
        //Esta excepciones es muy truculenta
        int x=5; //float x=5; cambiar 
        int y=0;
        // System.out.println(x/y); Arthmetic exception
        
        int z=Integer.parseInt("x");
        //System.out.println(z*2); NumberFormatException
        
    }           
}