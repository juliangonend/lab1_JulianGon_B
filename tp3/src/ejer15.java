import java.util.Scanner;

public class ejer15 {
    public static void main(String[] args) {
        Scanner src=new Scanner(System.in);
        int H,M,S;

        System.out.println("Ingrese una hora");
        H= src.nextInt();

        System.out.println("Ingrese minutos");
        M= src.nextInt();

        System.out.println("Ingrese segundos");
        S= src.nextInt();

        if (H>24 || H<0){
            System.out.println("HORA INCORECCTA");
        }
        else if(M>59 || M<0){
            System.out.println("MINUTOS INCORRECTOS");
        }
        else if(S<0 || S>59){
            System.out.println("SEGUNDOS INCORRECTOS");
        }else{
            System.out.println("LA HORA INGRESADA ES "+ H+":"+M+":"+S);
        }
    }
}
