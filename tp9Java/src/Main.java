import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       // 1.	Crea un ArrayList de números enteros y agrega 5 números a la lista.
        ArrayList<Integer> intNum= new ArrayList<>(List.of(1,2,3,4,5,6));
       // 2.	Crea un ArrayList de cadenas y agrega 3 nombres a la lista.
        ArrayList<String> stringList= new ArrayList<>(List.of("Julian","Laura","Pablo"));
       // 3.	Imprime todos los elementos de un ArrayList de enteros.
        System.out.println("String Array List "+ stringList);
        System.out.println("-----");
        System.out.println("Integer Array List "+ intNum);
        System.out.println("-----");
        //  4.	Encuentra la longitud (número de elementos) de un ArrayList de caracteres.
            int lenList= stringList.size();
        System.out.println("La longitud del ArrayList es "+ lenList);
        //  5.	Elimina un elemento específico de un ArrayList de cadenas.
            stringList.remove("Pablo");
        System.out.println("La nueva lista sin el nombre Pablo es : ");
        for (String name:stringList) {
            System.out.print("["+name+"]");
        }
        System.out.println(" ");
        System.out.println("------------");
        // 6.	Comprueba si un ArrayList de números enteros está vacío.
        ArrayList<Integer> emptyArray= new ArrayList<Integer>();
        if(emptyArray.isEmpty()){
            System.out.println("El arrat empty array esta vacio");
        }else{
            System.out.println("El array empty no esta vacio");
        }
        //  7.	Encuentra el elemento más grande en un ArrayList de números.
            int maximo= intNum.get(0);
        for (int num:intNum
             ) {
            if (num>maximo){
                maximo=num;
            }
        }
        System.out.println("El numero mas grande del arraylist es :"+ maximo);
        //  8.	Copia todos los elementos de un ArrayList en otro ArrayList nuevo.
        ArrayList<Integer> cloneArray= new ArrayList<>();
        for (int i = 0; i < intNum.size(); i++) {
            cloneArray.add(intNum.get(i));
        }
        System.out.println("El nuevo array es "+cloneArray);
        // 9.	Invierte un ArrayList de enteros (el primer elemento se convierte en el último y viceversa).
        int aux;
        int arrayLen= cloneArray.size();
        System.out.println("Sin cambiar el orden "+ cloneArray);
        Collections.reverse(cloneArray);
        System.out.println("Invirtiendo  el orden "+ cloneArray);
        // 10.	Combina dos ArrayLists de enteros en uno solo.
        ArrayList<Integer> combineList=new ArrayList<>();
        combineList.addAll(intNum);
        combineList.addAll(cloneArray);
        System.out.println("Las dos listas combinadas quedan como "+ combineList);
        // 11.	Crea un ArrayList de números enteros y elimina todos los elementos pares.
        ArrayList<Integer> numerosArrayList = new ArrayList<>(List.of(42, 17, 99, 23, 56, 8, 70));
        System.out.println("Nuevo Array List con los pares "+ numerosArrayList);
        for (int i = 0; i < numerosArrayList.size(); i++) {
            if (numerosArrayList.get(i)%2==0){
                numerosArrayList.remove(i);
                i--;
            }
        }
        System.out.println("El nuevo Array List sin pares es " +numerosArrayList);
        // 12.	Busca un elemento específico en un ArrayList de cadenas y devuelve su índice.
        ArrayList<String> fruits= new ArrayList<>(List.of("naranja","manzana", "banana","pera"));
        String searchWord= "pera";
        int indexWordList;
        for (String fru:fruits
             ) {
            if(fru.equals(searchWord)){
                indexWordList=fruits.lastIndexOf(searchWord);
                System.out.println("El elemento "+searchWord+ " fue encontrado en la posicion "+ indexWordList);
                break;
            }
        }
        //  13.	Comprueba si dos ArrayLists son iguales (tienen los mismos elementos en el mismo orden).
        ArrayList<Integer> numList1 = new ArrayList<>(List.of(42, 17, 99, 23, 56, 8, 70));
        ArrayList<Integer> numList2 = new ArrayList<>(List.of(42, 17, 99, 23, 56, 8, 70));
        if(numList1.equals(numList2)){
            System.out.println("Los dos Array List son iguales ");
        }else{
            System.out.println("Los dos Array List no son iguales ");
        }
        //   14.	Encuentra el elemento más pequeño en un ArrayList de números.
        int lessNUm=numList1.get(0);
        for (int num:numList1
             ) {
            if(lessNUm> num){
                lessNUm=num;
            }
        }
        System.out.println(" El numero menor es "+ lessNUm);
        //  15.	Crea un ArrayList de números enteros y suma todos los elementos.
        ArrayList<Integer> numList3 = new ArrayList<>(List.of(23, 46, 38, 34,52, 1, 94,23));
        int sumList3=0;
        for (int num :
                numList3) {
            sumList3+=num;

        }
        System.out.println(" La suma del Array List "+ numList3+"  es : "+ sumList3);
        //  16.	Crea un ArrayList de cadenas y concatena todas las cadenas en una sola.
        ArrayList<String> stringList1=new ArrayList<>(List.of("Hola Mundo","Chau Mundo","Chau Mundo","Hola Mundo","Hola Mundo","Hola Mundo"));
        String concatStringList="";
        for (String ele :stringList1
                ) {
            concatStringList+= ele;
        }
        System.out.println("Los elementos concatenados de la cadenas quedarian como "+concatStringList);
        //  17.	Elimina todos los elementos duplicados de un ArrayList de cadenas.

        for (int i = 0; i < stringList1.size(); i++) {
            for (int j = i+1; j <stringList1.size(); j++) {
                if(stringList1.get(i).equals(stringList1.get(j))){
                    stringList1.remove(j);
                    j--;

                }
            }
        }
        System.out.println("La lista sin cadenas repetidas es :" + stringList1);

        //  18.	Crea un ArrayList de enteros y encuentra la suma de los elementos en índices pares.
        ArrayList<Integer> numList4=new ArrayList<>(List.of(32,423,34,43,23,1,54,32,43,1));
        int sumPairNums=0;
        for (int i = 0; i < numList4.size(); i++) {
            if(i%2==0){
                sumPairNums+=numList4.get(i);
            }
        }
        System.out.println("La suma de los Elementos Pares es de "+ sumPairNums);
        //  19.	Comprueba si un ArrayList de enteros contiene un número específico.
        int specificNum=43;
        for (int num:numList4
             ) {
            if(num==specificNum){
                System.out.println("El numero "+specificNum+" fue encontrado en la posición "+ numList4.indexOf(num));
                break;
            }
        }

        // //  20.	Encuentra el elemento en un ArrayList de cadenas que tiene la longitud más larga.
        ArrayList<String> stringList3=new ArrayList<>(List.of(  "manzana", "banana", "cereza", "delfín", "elefante", "flor", "gato", "helado", "isla", "jirafa","aprendiendo java en laboratorio"));
        int indexBigLenght=0;
        for (String  ele: stringList3
             ) {
            if(ele.length()>stringList3.get(indexBigLenght).length()) {
                indexBigLenght = stringList3.indexOf(ele);
            }
        }
        System.out.println("El elementos con la mayor longitud es "+ stringList3.get(indexBigLenght));
        //   21.	Encuentra el promedio de todos los elementos en un ArrayList de números enteros.
        float prom=0;
        ArrayList<Integer> numList5=new ArrayList<>(List.of(32,423,34,43,23,1,54,32,43,1));
        for (int num:numList5
             ) {
            prom+=num;

        }
        prom=prom/numList5.size();
        System.out.println("El promedio de los numeros es "+ prom);
        // 22.	Crea un ArrayList de enteros y ordénalo de forma ascendente.
        ArrayList<Integer> numList6= new ArrayList<>(List.of(231,4334,43,21,43,54,6,12,34,5));
        int aux2;
        System.out.println("La lista sin ordenar de forma ascendente es " + numList6);
        for (int i = 0; i < numList6.size(); i++) {
            for (int j = 0; j < numList6.size()-1; j++) {
                if(numList6.get(j)>numList6.get(j+1)){
                    aux2=numList6.get(j);
                    numList6.set(j,numList6.get(j+1));
                    numList6.set(j+1,aux2);
                }
            }
        }
        System.out.println("La lista ordenada de forma ascendente es " + numList6);
        //  23.	Crea un ArrayList de números enteros y elimina todos los elementos mayores que un valor específico.
        ArrayList<Integer> numList7= new ArrayList<>(List.of(231,4334,433,21,43,54,126,12,34,543));
        int limitNum=100;
        for (int i = 0; i < numList7.size(); i++) {
            if (numList7.get(i)>limitNum){
                numList7.remove(i);
                i--;
            }
        }
        System.out.println("La nueva lista con numeros menores a "+ limitNum+ " es " +numList7);
        //   24.	Encuentra la cantidad de veces que un elemento específico aparece en un ArrayList de cadenas.
        ArrayList<String> stringList4=new ArrayList<>(List.of("Hola Mundo","Chau Mundo","Chau Mundo","Hola Mundo","Hola Mundo","Hola Mundo"));
        searchWord="Hola Mundo";
        int countWordSearch=0;
        for (String word: stringList4
             ) {
            if(searchWord==word){
                countWordSearch++;
            }
        }
        System.out.println("La cantidad de veces que se repite "+ searchWord+ " es : "+ countWordSearch);
        //  25.	Crea un ArrayList de cadenas y ordena las cadenas alfabéticamente.
        String stingAux;
        ArrayList<String> stringList5=new ArrayList<>(List.of("Montaña", "Helado","Avión", "Guitarra", "Luna", "Catarata", "Elefante"));
        System.out.println("La lista sin ordenar de forma ascendente es " + stringList5);
        Collections.sort(stringList5);
        System.out.println("La lista ordenada de forma ascendente es " + stringList5);


    }
}