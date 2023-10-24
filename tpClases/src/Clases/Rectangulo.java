package Clases;

public class Rectangulo {
    //12.	Crea una clase Rectángulo con atributos de
    // ancho y alto y métodos para calcular su área y perímetro.

    private double ancho;
    private double alto;
    public Rectangulo(double alto, double ancho){
        this.ancho=ancho;
        this.alto=alto;
    }
    public double calArea(double ancho, double alto){
        return alto * ancho;
    }
    public double calPerimetro(double ancho, double alto){
        return 2 * (ancho + alto);
    }
    public void impRentan(){
        System.out.println("Rectangulo");
        System.out.println("Si su ancho es de "+ ancho);
        System.out.println("Si su alto es de " + alto);
        System.out.println("El area del rectangulo es "+ calArea(ancho,alto)+ "cm y el perimetro es : "+ calPerimetro(ancho,alto)+" cm" );
    }
}
