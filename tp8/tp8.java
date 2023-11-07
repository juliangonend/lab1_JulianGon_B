import java.util.Scanner;

public class tp8{
    public static void main(String[] args) {
        Scanner src= new Scanner(System.in);
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
        // 10.	Crear una función que genere una matriz identidad de tamaño n.

        // Matriz Identidad (o Matriz Unitaria):

        // La matriz identidad, denotada generalmente como "I" o "I_n" (donde "n" representa el tamaño de la matriz cuadrada), es una matriz cuadrada especial en la que todos los elementos de la diagonal principal son iguales a 1 y todos los demás elementos son iguales a 0.

        // Por ejemplo, la matriz identidad 3x3 sería:


        // I_3 = | 1  0  0 |
        //          | 0  1  0 |
        //          | 0  0  1 |
        int tamanio;
        System.out.println("Ingrese el tamanio que desea de la matriz ");
        tamanio=src.nextInt();
        int [][]matrizIden= new int[tamanio][tamanio];
        for (int i = 0; i < tamanio; i++) {
            for (int j = 0; j < tamanio; j++) {
                if (i==j){
                    matrizIden[i][j]=1;
                }else{
                    matrizIden[i][j]=0;
                }
            }
        }

        System.out.println("La  Matriz identidad es :");
        for (int[] is : matrizIden) {
            for (int j : is) {
                System.out.print("["+j+"]");
            }
        System.out.println("   ");
        }


        // 11.	Escribir un método para contar la cantidad de elementos pares e impares en una matriz.
        int [][]matrizParoImpar= new int[3][3];
        int [] cantPareImpar= new int[2];
        for (int i = 0; i < matrizParoImpar.length; i++) {
            for (int j = 0; j < matrizParoImpar.length; j++) {
                System.out.println("Ingrese en el casillero "+ i+" "+j);
                matrizParoImpar[i][j]=src.nextInt();

            }
        }
        cantPareImpar=contadorParoImpar(matrizParoImpar);
        System.out.println("La cantidad de pares es :"+ cantPareImpar[0]);
        System.out.println("La cantidad de impares es :"+ cantPareImpar[1]);
        // 12.	Implementar una función que rote una matriz 90 grados en sentido horario.
        int[][] matrixARotar = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.println("Matriz sin Rotar ");
        for (int i = 0; i < matrixARotar.length; i++) {
            for (int j = 0; j < matrixARotar.length; j++) {
                System.out.print("["+matrixARotar[i][j]+"]");
            }
            System.out.println("    ");
        }
        int [][]matrizRotada=rotarMatriz(matrixARotar);
        System.out.println("Matriz Rotada 90 °");
        for (int i = 0; i < matrizRotada.length; i++) {
            for (int j = 0; j < matrizRotada.length; j++) {
                System.out.print("["+matrizRotada[i][j]+"]");
            }
            System.out.println("    ");
        }
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
    public static int[] contadorParoImpar(int matriz[][]) {
        int []pareImpar=new int[2];
        pareImpar[0]=0;
        pareImpar[1]=0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                  if (matriz[i][j]%2==0){
                pareImpar[0]++;
             }else{
                pareImpar[1]++;
             }
            }
        }
        return pareImpar;
    }
    public static int [][]rotarMatriz(int matriz[][]){
        int [][]matrizRotada= new int[3][3];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matrizRotada[i][j]=matriz[2-j][i];
            }
        }
        return matrizRotada;
    }

}