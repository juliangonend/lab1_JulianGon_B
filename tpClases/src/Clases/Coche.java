public class Coche {
    //13.	Crea una clase Coche con atributos como marca, modelo y
    // año de fabricación.
    private String marca;
    private String modelo;
    private  int anioFab;
    int velocidad=10;
    public Coche(String marca, String modelo, int anioFab){
        this.marca=marca;
        this.modelo=modelo;
        this.anioFab=anioFab;

    }

    public void acelerar(){
         velocidad+=10;
        System.out.println("El coche esta andando a "+velocidad+" km por hora ");
    }
    public void frenar(){
         velocidad=0;
        System.out.println("El coche se freno a "+velocidad+" km por hora " );
    }
    public void imprCoche(){
        System.out.println("El coche modelo"+ modelo+" de la marca "+ marca+" fue fabricado en el anio "+ anioFab);
    }
}