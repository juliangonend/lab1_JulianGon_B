import java.util.Scanner;

public class ejer9 {
    public static void main(String[]args){
        Scanner src=new Scanner(System.in);
        char car1,car2;
        System.out.println("Ingrese un caracter");
        car1=src.next().charAt(0);
        System.out.println("Ingrese otro caracter");
        car2=src.next().charAt(0);
        if (car1==car2){
            System.out.println("Los dos caracteres son iguales");
        }else{
            System.out.println("Los dos caracteres no son iguales");
        }

    }
        }
