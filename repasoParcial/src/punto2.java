import java.util.Scanner;

public class punto2 {
    public static void main(String[] args) {
        Scanner src= new Scanner(System.in);
        int num;
        System.out.println("Ingrese un numero de 3 cifras y se verificara si es capicua");
        num=src.nextInt();
        int primeraCifra,terceraCifra;
        if (num<1000 && num>99){
            System.out.println("El numero tiene mas de 3 cifras");
        }else {
            primeraCifra=num/100;
            terceraCifra=num%10;
            if (primeraCifra==terceraCifra){
                System.out.println("El numero es capicua ");
            }else{
                System.out.println("El numero no es capicua ");
            }
        }
    }

}
