import java.util.Scanner;

public class ejer13 {
    public static void main(String[]args){
        Scanner src=new Scanner(System.in);
        System.out.println("Ingrese un año y se le indicara si es bisisesto");
        int anio=src.nextInt();
        if ((anio%4==0 && anio%10!=0)|| (anio%400==0)){
            System.out.println("El anio "+anio +" es bisiesto ");
        }else{
            System.out.println("El anio "+anio +" no es bisiesto ");
        }
    }
}
