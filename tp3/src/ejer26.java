import javax.imageio.metadata.IIOMetadataFormatImpl;
import java.util.Scanner;

public class ejer26 {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        int num1,num2;
        int mayor,menor;
        boolean iguales=false;
        do {
            System.out.println("Ingrese un numero");
            num1=src.nextInt();

            System.out.println("Ingrese otro numero");
            num2=src.nextInt();
            if(num1==num2){
                System.out.println("No pueden ser los dos numeros iguales ");
                System.out.print("Ingrese nuevamente:");
                iguales=true;
            }else{
                iguales=false;
            }
        }while(iguales);
        if (num1>num2){
            mayor=num1;
            menor=num2;
        }else {
            mayor = num2;
            menor = num1;
        }
        for (int i = menor; i <= mayor; i++) {
            System.out.println(i);
        }
    }
}
