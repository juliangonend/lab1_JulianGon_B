import java.util.Scanner;

public class punto1 {
    public static void main(String[] args) {
        Scanner src= new Scanner(System.in);
        int num1,num2;
        int ultimaCifran1,ultimaCifran2;
        System.out.println("Ingrese un numero");
        num1=src.nextInt();
        System.out.println("Ingrese otro numero");
        num2=src.nextInt();
        ultimaCifran1=num1%10;
        ultimaCifran2=num2%10;

        if (ultimaCifran1==ultimaCifran2){
            System.out.println("La ultima cifra que es: "+ ultimaCifran1+ " es igual en los dos numeros ");
        }else{
            System.out.println("La ultima cifra del numero 1 : "+ ultimaCifran1+ " es distinta de la de num 2: "+ ultimaCifran2);
        }

    }
}
