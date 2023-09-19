import java.util.Scanner;

public class ejer1 {
    public static void main(String[]args){
        Scanner src= new Scanner(System.in);
        int num ;
        System.out.println("Ingrese un numero ");
        num=src.nextInt();
        if (num%2==0) {
            System.out.println("El numero "+ num +" es par ");
        }else{
            System.out.println("El numero "+ num +" es impar ");
        }
    }
}
