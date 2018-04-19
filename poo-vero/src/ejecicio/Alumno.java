package ejecicio;


public class Alumno {
    private String nombre;
    private String num_cuenta;
    private int edad;

    public Alumno() {
    }

    public Alumno(String nombre, String num_cuenta, int edad) {
        this.nombre = nombre;
        this.num_cuenta = num_cuenta;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNum_cuenta() {
        return num_cuenta;
    }

    public void setNum_cuenta(String num_cuenta) {
        this.num_cuenta = num_cuenta;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
}
