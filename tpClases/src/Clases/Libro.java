package Clases;

public class Libro {
    //8.	Crea una clase Libro con atributos como
    // título, autor y año de publicación.
    private String titulo;
    private String autor;
    private int anioPubl;

    public  Libro(String titulo,String autor , int anioPubl){
        this.titulo=titulo;
        this.autor=autor;
        this.anioPubl=anioPubl;
    }

    public void mostrarLibro(){
        System.out.println("El libro "+ titulo+ " fue escrito por : "+ autor+
                " y publicado en el anio "+ anioPubl)
                ;
    }
}
