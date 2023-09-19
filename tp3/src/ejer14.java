import java.util.Scanner;

public class ejer14 {
    public static void main(String []args){
        Scanner src=new Scanner(System.in);
        int num;
        System.out.println("Ingrese un numero de 3 cifras para ver si es capicua ");
        num=src.nextInt();
        if(num>99 && num<10000){
            if (num%10==num/100){
                System.out.println("El numero es capicua");
            }else{
                System.out.println("El numero no es capicua");
            }
        }else{
            System.out.println("El numero tiene mas o menos de 3 cifras");
        }

    }

}
