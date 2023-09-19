import java.util.Scanner;

public class ejer10{
    public static void main(String[]args){
        Scanner src=new Scanner(System.in);
        char car1,car2;

        System.out.println("Ingrese un caracter");
        car1=src.next().charAt(0);

        System.out.println("Ingrese otro caracter");
        car2=src.next().charAt(0);
        if ((Character.isLowerCase(car1))&&(Character.isLowerCase(car2))){
            System.out.println("Los dos caracteres estan en minuscula");

        }else{
            System.out.println("No estan los dos caracteres en minuscula");
        }
    }
}
