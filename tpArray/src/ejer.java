
import java.util.Arrays;
import java.util.Scanner;

public class ejer{
        public static void main(String[] args) {
        Scanner src =  new Scanner(System.in);
        //Ejercisio1

        int[] num = new int[10];
        for (int i = 0; i < 10; i++) {
            num[i]=i;
            System.out.println("["+num[i]+"]");
        }
        //Ejercisio 2 
        double []numPrimos= {2.0,3.0,5.0,7.0,11.0,13.0,17.0,19.0,23.0,29.0};
        for (int e = 0; e < 10; e++) {
            System.out.println("["+numPrimos[e]+"]");
        }
        // Ejercisio 3

        int [][] arrayBi =new int[10][10];
        // Ejercisio 4
        int [][][] arrayMulti =new int[10][10][10];
        // Lectura y Escritura
            // Ejercisio1
            int[]array1=new int[10];
            for (int i = 0; i < 10; i++) {
                System.out.println("Ingrese el numero en la posicion "+ i);
                array1[i]=src.nextInt();
            }
            for (int i = 0; i < 10; i++) {
                System.out.print("["+array1[i]+"]  ,");
            }
            System.out.println("  ");
            //Ejercisio 2 
            double []array2=new double [10];
            for (int i = 0; i < 10; i++) {
                System.out.println("Ingrese el numero en la posicion "+ i);
                array2[i]=src.nextInt();
            }
            for (int i = 0; i < 10; i++) {
                System.out.print("["+array2[i]+"]  ,");
            }
            System.out.println("  ");
            // Ejercisio 3
            char[] arrayChar=new char[10];
            for (int i = 0; i < 10; i++) {
                System.out.println("Ingrese un caracter en la posicion "+i);
                arrayChar[i]=src.next().charAt(0);
            }
            for (int i = 0; i <   10; i++) {
                System.out.print("["+arrayChar[i]+"]  ,");
            }
            System.out.println("  ");
   
            // Ejercisio 4
                boolean [] arrayBolean= new boolean[10];
            for (int i = 0; i < 10; i++) {
                System.out.println("Ingrese true o false en la  posicion "+i);
                arrayBolean[i]=src.nextBoolean();
            }
            for (int i = 0; i <   10; i++) {
                System.out.print("["+arrayBolean[i]+"]  ,");
            }
            System.out.println("  ");
            
            // Operaciones Aritmeticas
                //Ejercio 1
            
            int [] arraySuma= {1,2,3,4,5,6,7,8,9,10};
            int suma=0;
            for (int i = 0; i < 10 ; i++) {
                System.out.print("suma= "+ arraySuma[i]+" + ");
                suma=suma+arraySuma[i];
            
            }    System.out.println(" ");
            System.out.println("La suma del array es :"+ suma);
            // Ejercisio 2
            int [] arrayMult= new int[10];
            int mult;
            System.out.println("Array ");
            for (int i = 0; i < arrayMult.length; i++) {
                System.out.println("Cargar el elemento "+ i);
                arrayMult[i]=src.nextInt();

           
            }
            System.out.println("Ingrese por que numero desea multiplicar los elementos del Array ");
            mult=src.nextInt();
            for (int i : arrayMult) {
                i=i*mult;
                System.out.println(i);
            }
            //Ejercisios  3.	Ordenar un array de 10 enteros de menor a mayor.
                int []array=new int[10];

                System.out.println("Ingrese los numeros del Array");
                for (int i = 0; i < array.length; i++) {
                    System.out.println("Ingrese el Elemento "+ i);
                    array[i]=src.nextInt();
                }
                Arrays.sort(array);
                for (int i : array) {
                    System.out.println(i);
                };
   
        
            // Ejercisio 4
            String []arrayString= new String[10];
             for (int i = 0; i < arrayString.length; i++) {
                    System.out.println("Ingrese el Elemento "+ i);
                    arrayString[i]=src.nextLine();
                }
                Arrays.sort(arrayString);
            System.out.println(" Array ");
                for (String i : arrayString) {
                    System.out.println("["+i+"]");
                };
            // Ejercisios Adicionales 
           
            int [] ejerAdi= new int[10];
                for (int i = 0; i < ejerAdi.length; i++) {
                    System.out.println("Ingrese numero "+ i);                
                    ejerAdi[i]=src.nextInt();

                }
                System.out.println("La cantidad de numeros Pares es de : "+ contarPares(ejerAdi));
                System.out.println("La cantidad de numeros Mayores de 10 es : "+ mayoresDiez(ejerAdi));
                System.out.println("La cantidad de numeros Multiplos de 3 es : "+ multiplos3(ejerAdi));
                System.out.println("El numero mayor es : "+mayorNum(ejerAdi));
                System.out.println("La nueva copia del array es ");
                int [] newArray=copiarArray(ejerAdi);
            for (int i : newArray) {
                System.out.println(i);
            }
  
    }
     // 1.	Implementar un método que cuente el número de elementos pares en un array de enteros.
        public static int contarPares(int []array){
            int contPares=0;
            for (int  i : array) {
                if(i%2==0){
                    contPares++;
                }
            }
            return contPares;
            
        }
    // 2.	Implementar un método que cuente el número de elementos mayores que 10 en un array de números reales.
        public static int mayoresDiez(int []array){
            int contMayores10=0;
            for (int i : array) {
                if(i>=10){
                    contMayores10++;
                }
            }
            return contMayores10;
        }
    // 3.	Implementar un método que calcule la suma de los elementos de un array de enteros que sean múltiplos de 3.
        public static int multiplos3(int []array){
            int mult3=0;
            for (int i : array) {
                if( i%3==0){
                    mult3++;
                }

            }
                        return mult3;
        }
    // 4.	Implementar un método que encuentre el elemento máximo de un array de enteros.
        public static int  mayorNum(int[]array){
            int mayor=0;
            for (int i : array) {
                if(i>mayor){
                    mayor=i;
                }

            }
            return mayor;
        }
    // 5.	Implementar un método que encuentre el elemento mínimo de un array de cadenas.
            public static int  menorNum(int[]array){
            int menor=array[0];
            for (int i : array) {
                if(i<menor){
                    menor=i;
                }

            }
            return menor;
        }
    // 6.	Implementar un método que copie un array de enteros a otro array de enteros.
        public static int[] copiarArray(int[] array){
            int []newArray=Arrays.copyOf(array, array.length);
            return newArray;
            
        }
        
}