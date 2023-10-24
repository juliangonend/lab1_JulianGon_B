package Clases;

public class Circulo {
    private double radio;
    public void setRadio(double radio){
        this.radio=radio;
    }
    public double getRadio(){
        return radio;
    }
    public double calcularArea(){
        double area = Math.PI * Math.pow(radio, 2);
        return area;
    }
    public double calcularCircunferencia(){
        return 2 * Math.PI * radio;
    }
}
