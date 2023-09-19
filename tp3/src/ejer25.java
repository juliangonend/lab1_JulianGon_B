import java.util.Scanner;

public class ejer25 {
    public static void main(String[] args) {
        Scanner src= new Scanner(System.in);
        System.out.println("Ingrese un numero donde desea terminar la ejecusion");
        int N= src.nextInt();
        System.out.println("Con estructura for");
        for (int i = N; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println("Con While");
        int e=N;
        while (e>0){
            System.out.println(e);
            e--;
        }
        System.out.println("Con Do while");
        int f=N;
        do{
            System.out.println(f);
            f--;
        }while (f>0);
    }
}
