import java.util.Scanner;

public class ejer28 {
    public static void main(String[] args) {
        Scanner src = new Scanner (System.in);
        int N,M;
        boolean incorrecto=false;
        do{
            System.out.println("Ingrese dos numeros y se le mostrara los pares desde el 1ro hasta el 2do");
            System.out.println("Num 1 ");
            N=src.nextInt();
            System.out.println("Num 2 ");
            M=src.nextInt();
            if (M<N){
                System.out.println("Numero 2 mas grande que el 1ro se ejectura nuevamente");
                incorrecto=true;

            }else{
                incorrecto=false;
            }
        }while(incorrecto);
        for (int i = N; i <=M; i++) {
            if(i%4==0){
                System.out.println(i);
            }
        }
    }

}

