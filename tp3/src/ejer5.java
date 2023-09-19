import java.util.Scanner;

public class ejer5 {
    public static void main(String[]args){
        Scanner src = new Scanner(System.in);
        int num1,num2;
        System.out.println("Ingrese un numero");
        num1=src.nextInt();
        System.out.println("Ingrese otro numero");
        num2=src.nextInt();
        if (num1>num2){
            System.out.println("El numero 1 es el mas grande");
        }else if(num2>num1){
            System.out.println("El numero 2 es el mas grande");
        }else{
            System.out.println("Son iguales");
        }
    }
}
