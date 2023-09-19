import java.util.Scanner;

public class ejer4 {
    public static void main(String []args){
        Scanner src=new Scanner(System.in);
        int num1,num2;
        System.out.println("Ingrese un numero");
        num1=src.nextInt();
        System.out.println("Ingrese otro numero");
        num2=src.nextInt();
        if(num1==num2){
            System.out.println("Los dos numeros son iguales ");

        }else{
            System.out.println("Los dos numeros no son iguales");
        }
    }
}
