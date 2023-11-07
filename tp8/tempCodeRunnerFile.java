//             int [][]matrizA=new int[5][5];
// //             int [][]matrizB=new int[5][5];
// //             chargeArray(matrizA);
// //             chargeArray(matrizB);
// // //         1.	Escribir un método para sumar dos matrices de enteros y devolver la matriz resultante.
      
// //          int [][]sumMatriz=sumaArray(matrizA, matrizB);
// //         System.out.println("La suma de las dos matrices da :");
// //         printArray(sumMatriz);

// //         // 2.	Implementar un método para multiplicar dos matrices de enteros y devolver el resultado.
// //             int[][] multMatriz =multArray(matrizA,matrizB);
// //             System.out.println("La multiplicasion de las dos matrices da :");
// //             printArray(multMatriz);
//         // 3.	Crear una función que calcule la transpuesta de una matriz.

//         // La matriz transpuesta es una matriz obtenida al intercambiar las filas por columnas de una matriz dada. Esto significa que los elementos que estaban en la fila i y columna j de la matriz original estarán en la fila j y columna i de la matriz transpuesta. La notación típica para denotar la matriz transpuesta de A es A^T.

//         // 4.	Desarrollar un método para verificar si una matriz es simétrica (igual a su transpuesta).

//         // 5.	Escribir un método que calcule el producto escalar de un vector (matriz unidimensional) por un número.

//         // 6.	Implementar una función que calcule la suma de todos los elementos de una matriz.
//         // 10.	Crear una función que genere una matriz identidad de tamaño n.

//         // Matriz Identidad (o Matriz Unitaria):

//         // La matriz identidad, denotada generalmente como "I" o "I_n" (donde "n" representa el tamaño de la matriz cuadrada), es una matriz cuadrada especial en la que todos los elementos de la diagonal principal son iguales a 1 y todos los demás elementos son iguales a 0.

//         // Por ejemplo, la matriz identidad 3x3 sería:


//         // I_3 = | 1  0  0 |
//         //          | 0  1  0 |
//         //          | 0  0  1 |
//         int tamanio;
//         System.out.println("Ingrese el tamanio que desea de la matriz ");
//         tamanio=src.nextInt();
//         int [][]matrizIden= new int[tamanio][tamanio];
//         for (int i = 0; i < tamanio; i++) {
//             for (int j = 0; j < tamanio; j++) {
//                 if (i==j){
//                     matrizIden[i][j]=1;
//                 }else{
//                     matrizIden[i][j]=0;
//                 }
//             }
//         }

//         System.out.println("La  Matriz identidad es :");
//         for (int[] is : matrizIden) {
//             for (int j : is) {
//                 System.out.print("["+j+"]");
//             }
//         System.out.println("   ");
//         }


//         // 11.	Escribir un método para contar la cantidad de elementos pares e impares en una matriz.
//         int [][]matrizParoImpar= new int[3][3];
//         int [] cantPareImpar= new int[2];
//         for (int i = 0; i < matrizParoImpar.length; i++) {
//             for (int j = 0; j < matrizParoImpar.length; j++) {
//                 System.out.println("Ingrese en el casillero "+ i+" "+j);
//                 matrizParoImpar[i][j]=src.nextInt();

//             }
//         }
//         cantPareImpar=contadorParoImpar(matrizParoImpar);
//         System.out.println("La cantidad de pares es :"+ cantPareImpar[0]);
//         System.out.println("La cantidad de impares es :"+ cantPareImpar[1]);