package Clases;

public class Pelicula {
    //15.	Crea una clase Película con atributos como título,}
    // director y duración en minutos.
    // Implementa un método para mostrar la información de la película.
    private String  titulo;
    private String director;

    private int duracion;
    public Pelicula(String titulo,String director, int duracion){
        this.titulo=titulo;
        this.director=director;
        this.duracion=duracion;
    }
    public  void infoPel(){
        System.out.println("---------------------------------------------");

        System.out.println("Pelicula : "+ titulo);
        System.out.println("           dirigida por :"+ director);
        System.out.println("           con una duracion de : "+ duracion+ "minutos");
        System.out.println("---------------------------------------------");
    }

}
