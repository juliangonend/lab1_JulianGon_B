import java.util.Scanner;

public class ejer24 {
    public static void main(String[] args) {
        Scanner src= new Scanner(System.in);
        System.out.println("Ingrese un numero donde desea terminar la ejecusion");
        int N= src.nextInt();
        System.out.println("Con estructura for");
        for (int i = 1; i <= N; i++) {
            System.out.println(i);
        }
        System.out.println("Con While");
        int e=1;
        while (e<= N){
            System.out.println(e);
            e++;
        }
        System.out.println("Con Do while");
        int f=1;
        do{
            System.out.println(f);
            f++;
        }while (f<= N);
    }
}
