import java.sql.SQLOutput;
import java.util.Scanner;

public class ejer11 {
    public static void main(String []args){
        Scanner src= new Scanner(System.in);
        char numCar;
        System.out.println("Ingrese un numero entre 0 y 9");
        numCar= src.next().charAt(0);
        if (Character.isDigit(numCar)){
            System.out.println("El Caracter es un numero");
        }else{
            System.out.println("El Caracter no es un numero");
        }
    }
}
