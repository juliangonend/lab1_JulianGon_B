import java.util.Scanner;

public class ejer12 {
    public static void main(String []args){
        Scanner src= new Scanner(System.in);
        int num1,num2;
        System.out.println("Ingrese el numero a dividir");
        num1=src.nextInt();
        System.out.println("Ingrese el divisor");
        num2=src.nextInt();
        if (num2==0){
            System.out.println("El divisor no puede ser 0");
        }else{
            float division=num1/num2;
            System.out.println("El resultado de la division de "+ num1 + "/"+ num2 + "= "+ division);
        }
    }
}
