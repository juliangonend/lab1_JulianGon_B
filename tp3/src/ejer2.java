import java.util.Scanner;
public class ejer2 {
    public static void main(String []args){
        Scanner src= new Scanner(System.in);
        int num ;
        System.out.println("Ingrese un numero ");
        num=src.nextInt();
        if (num%10==0) {
            System.out.println("El numero "+ num +" es multiplo de 10 ");
        }else{
            System.out.println("El numero "+ num +" no es multiplo de 10 ");
        }
    }
}
