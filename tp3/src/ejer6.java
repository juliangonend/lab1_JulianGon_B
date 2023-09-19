import java.util.Scanner;

public class ejer6 {
    public static  void main (String []args){
        Scanner src=new Scanner(System.in);
        int num1,num2;
        int ultimaCifraNum1,ultimaCifraNum2;
        System.out.println("Ingrese un numero");
        num1=src.nextInt();
        System.out.println("Ingrese otro numero");
        num2=src.nextInt();
        ultimaCifraNum1=num1%10;
        ultimaCifraNum2=num2%10;
        if (ultimaCifraNum1 == ultimaCifraNum2) {

            System.out.println("Las ultima cifra de los dos numeros son iguales ");
        }else{
            System.out.println("La ultima cifra de los numeros no son iguales");
        }
    }
}
