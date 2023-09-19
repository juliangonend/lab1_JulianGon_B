import java.util.Scanner;

public class ejer29 {
    public static void main(String[] args) {
        Scanner src=new Scanner(System.in);
        double millas,km;
        // 1 milla equivale a 1.6093 km//
        do{
            System.out.println("Ingrese las millas y se pasaran a km \n si ingresa 0 se terminara la ejecusion");
            millas=src.nextDouble();
            if (millas != 06) {
                km=millas*1.6093;
                System.out.println("Las millas "+ millas+ "en km son : "+ km);
            }
        }while (millas!=0);
    }
}
