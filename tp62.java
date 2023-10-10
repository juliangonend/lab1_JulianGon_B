import java.util.Scanner;
import java.util.Random;
public class tp62{
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        // // 6.	Programa Java que llene un array con 10 números enteros que se leen por 
        // // teclado. A continuación calcula y muestra la media de los valores positivos y la de los valores negativos del array.
        // double [] array1= new double[10];
        // double mediaPositivos=0;
        // double mediaNegativos=0 ;
        // int contPos=0;
        // int contNega=0;

        // for (int i = 0; i < array1.length; i++) {
        //     System.out.println("Ingrese un numero");
        //      array1[i]=src.nextDouble();
            
        // }
        // for (double i : array1) {
        //     if (i>0){
        //         mediaPositivos=mediaPositivos+i;
        //         contPos++;
        //     }else{
        //         mediaNegativos=mediaNegativos+i;
        //         contNega++;
        //     }
           
        // }
    
        //     mediaNegativos=mediaNegativos/contNega
        //     mediaPositivos=mediaPositivos/contPos;

        // System.out.println("La media de los valores positivos es de "+ mediaPositivos);
        // System.out.println("La media de los valores Negativos es de "+ mediaNegativos);

        // // Ejercisio 7
        //     int []  arrayAle= new int[10];

            Random random = new Random();
        //     for (int i : arrayAle) {
        //         i=random.nextInt(100);
        //         System.out.println(i);
        //     }
        // Ejercisio 8
        int fila,columna;
        System.out.println("Ingrese la fila");
        fila=src.nextInt();
        System.out.println("Ingrese la columna ");
        columna=src.nextInt();
        int [][] arrayA=new int[fila][columna];
        int [][] arrayB=new int[fila][columna];
        int [][] arrayC=new int[fila][columna];
            System.out.println(" Matriz A");
        for (int i = 0; i < fila; i++) {
            for(int e=0; e<columna ; e++){
                arrayA[i][e]=random.nextInt(10);
                System.out.print(arrayA[i][e] + " | ");
            }
            System.out.println(" ");
            System.out.println("----------");
        }
            System.out.println(" Matriz B");       
        for (int i = 0; i < fila; i++) {
            for(int e=0; e<columna ; e++){
                arrayB[i][e]=random.nextInt(10);
               System.out.print(arrayB[i][e] + " | ");
            }
            System.out.println(" ");
            System.out.println("----------");

         }
        System.out.println("Matriz c");
         for(int w=0;w<fila;w++){
            for(int q=0 ;q<columna;q++ ){
                arrayC[w][q]=arrayA[w][q]+arrayB[w][q];
              System.out.print(arrayC[w][q] + " | ");
            }
            System.out.println(" ");
            System.out.println("----------");
        }

    }
}