import java.util.Scanner;

public class tp8{
    public static void main(String[] args) {
            int [][]matrizA=new int[5][5];
            int [][]matrizB=new int[5][5];
            chargeArray(matrizA);
            chargeArray(matrizB);
//         1.	Escribir un método para sumar dos matrices de enteros y devolver la matriz resultante.
      
         int [][]sumMatriz=sumaArray(matrizA, matrizB);
        System.out.println("La suma de las dos matrices da :");
        printArray(sumMatriz);

        // 2.	Implementar un método para multiplicar dos matrices de enteros y devolver el resultado.
            int[][] multMatriz =multArray(matrizA,matrizB);
            System.out.println("La multiplicasion de las dos matrices da :");
            printArray(multMatriz);
        // 3.	Crear una función que calcule la transpuesta de una matriz.

        // La matriz transpuesta es una matriz obtenida al intercambiar las filas por columnas de una matriz dada. Esto significa que los elementos que estaban en la fila i y columna j de la matriz original estarán en la fila j y columna i de la matriz transpuesta. La notación típica para denotar la matriz transpuesta de A es A^T.

        // 4.	Desarrollar un método para verificar si una matriz es simétrica (igual a su transpuesta).

        // 5.	Escribir un método que calcule el producto escalar de un vector (matriz unidimensional) por un número.

        // 6.	Implementar una función que calcule la suma de todos los elementos de una matriz.


    }
//Ejer 1 
    public static void chargeArray(int [][]array){
        Scanner src= new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.println("Ingrese el elemento en el casillero "+i+" , "+j);
                 array[i][j]=src.nextInt();            }
        }
    }
    public static int[][]sumaArray(int arrayA[][],int arrayB[][]){
        int[][]arrayC=new int[5][5];
        for (int i = 0; i < arrayB.length; i++) {
            for (int j = 0; j < arrayB.length; j++) {
                arrayC[i][j]=arrayA[i][j]+arrayB[i][j];
            }
        }
        return arrayC;
    }
        public static void printArray(int array[][]){
        
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
               System.out.print("["+array[i][j]+"] |");
            }
            System.out.println("  ");
            System.out.println("--------");
        }

    }
        public static int[][]multArray(int arrayA[][],int arrayB[][]){
        int[][]arrayC=new int[5][5];
        for (int i = 0; i < arrayB.length; i++) {
            for (int j = 0; j < arrayB.length; j++) {
                arrayC[i][j]=arrayA[i][j]*arrayB[i][j];
            }
        }
        return arrayC;
    }
}