package Clases;

public class Estudiantes {
    //Estudiante con atributos como nombre, edad y número de
    private String nombre;
    private int edad;
    private long numeroIdent;
    public Estudiantes(String nombre, int edad, long numeroIdent){
        this.nombre=nombre;
        this.edad=edad;
        this.numeroIdent=numeroIdent;
    }


    public String getNombre() {
        return nombre;
    }



    public int getEdad() {
        return edad;
    }


    public long getNumeroIdent() {
        return numeroIdent;
    }
}
