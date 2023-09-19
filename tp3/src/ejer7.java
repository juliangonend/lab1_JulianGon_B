import java.util.Scanner;

public class ejer7 {
    public static void main(String[]args){
        Scanner src=new Scanner(System.in);
        int num1;
        System.out.println("Ingrese un numero ");
        num1=src.nextInt();
        if ((num1%3==0) && (num1%5==0)){
            System.out.println("El numero "+num1+" es multiplo de 3 y  5");
        }else{
            System.out.println("El numero "+num1+" no es multiplo de 3 y  5");
        }
    }
}
