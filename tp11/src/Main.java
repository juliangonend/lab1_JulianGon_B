import Clases.EquipoDeFutbol;
import Clases.Factura;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner src= new Scanner(System.in);
        //1.	Diseñar un programa que lea y guarde marcas de Autos en un ArrayList de tipo
        //String. El programa pedirá una marca de Auto en un bucle, el mismo se guardará
        //en la lista y después se le preguntará al usuario si quiere guardar otro Auto o si
        //quiere salir. Si decide salir, se mostrará todos los autos guardados en el ArrayList.
        ArrayList<String> autos=new ArrayList<>();
        String marca;

        do {
            System.out.println("Ingrese una marca de auto si quiere salir escriba salir" );
            marca=src.nextLine();

            if(!marca.equals("salir")){
                autos.add(marca);
            }else{
                break;
            }
        }while(true);
        System.out.println("Los autos del Array-List son : ");
        for (String a:autos) {
            System.out.print("[ " +a+" ]");
        }
        // 2.	Define una clase EquipoDeFútbol que utiliza un ArrayList para mantener
        // una lista de jugadores. La clase debe permitir agregar nuevos jugadores, eliminar
        // jugadores y listar la plantilla
        EquipoDeFutbol River = new EquipoDeFutbol();
        River.addPlayer("Julian Alvarez");
        River.addPlayer("manco Armani");
        River.addPlayer("Enzo Perez");
        River.addPlayer("Pity Martinez");
        River.addPlayer("Colibri Borja");
        River.printTeam();
        River.removePlayer("Colibri Borja");
        River.removePlayer("manco Armani");
        River.printTeam();

        //3.	Crear una clase llamada Factura que represente una factura comercial. La clase debe tener los siguientes atributos:
        Factura factura= new Factura(12312344,21072004,"Carlos Menem");
        System.out.println("Añada la cantidad de productos que compro");
        String nameProduct;
        int amountProductSelling;
        int priceUnityProduct;
        HashMap<String,Integer> productSell=new HashMap<>();
        HashMap<String,Integer> priceProduct=new HashMap<>();
        int option;
        do {
            System.out.println("Ingrese el nombre del producto ");
            nameProduct= src.next();
            System.out.println("Ingrese cuanto vendio de este producto");
            amountProductSelling= src.nextInt();
            System.out.println("Ingrese el precio por unidad");
            priceUnityProduct= src.nextInt();
            System.out.println("Si desea terminar la carga de productos presione 1 si no continuara");

            productSell.put(nameProduct,amountProductSelling);
            priceProduct.put(nameProduct,priceUnityProduct);
            factura.setProdutosSell(productSell);
            factura.setPriceProd(priceProduct);
            option=src.nextInt();
            if (option==1){
                break;
            }

        }while(true);
        //añadir articulo
        nameProduct="pelota futbol";
        priceUnityProduct=3000;
        amountProductSelling=3;
        productSell.put(nameProduct,amountProductSelling);
        priceProduct.put(nameProduct,priceUnityProduct);
        //mariscos
        productSell.put("mariscos",12);
        priceProduct.put("mariscos",2500);
        //alfajores
        productSell.put("alfajores",18);
        priceProduct.put("alfajores",340);
        factura.setPriceProd(priceProduct);
        factura.setProdutosSell(productSell);
        factura.calcularSubtotal();
        factura.calcIva();
        factura.calcTotal();
        System.out.println(factura.getProdutosSell());


        //4.	Escriba una aplicación que:
        //a) lea 20 números decimales ingresados por teclado por el usuario y los coloque en un ArrayList.
        int num;
        ArrayList<Integer> numArrayList=new ArrayList<>();
        for (int i = 0; i < 20 ; i++) {
            System.out.println("Ingrese un numero en la posicion " + i);
            num=src.nextInt();
            numArrayList.add(num);
        }

       // b) determine y muestre el mayor de los números en el arreglo
        int mayor=numArrayList.get(0);
        for (Integer num1:numArrayList
             ) {
            if (mayor<num1){
                mayor=num1;
            }
        }
        System.out.println("El numero mayor es "+ mayor);
        //c) determine y muestre el menor de los números del arreglo calcule y muestre el rango (diferencia entre el mayor y el menor) de los elementos en el arreglo
        int menor=numArrayList.get(0);
        for (Integer num2:numArrayList
             ) {
            if (menor>num2){
                menor=num2;
            }
        }
        System.out.println("El numero menor es "+ menor);
        int diferencia=mayor-menor;

        System.out.println("La diferencia entre el numero mayor y el menor es de "+ diferencia);
        //5.	Escriba una aplicación para almacenar en un ArrayList<Integer>
        //  aleatoriamente 20 números enteros positivos pares del 1 al 100, de los
        int num3;
        ArrayList<Integer> numArrayList2=new ArrayList<>();
        Random random= new Random();
        for (int i = 0; i < 20 ; i++) {
            num3=random.nextInt(100);
            System.out.println("El numero en la posicion " + i + " es : "+ num3);
            numArrayList2.add(num3);
        }

        // cuales se desea saber:

        // a) su promedio aritmético
        int sumaArrayList=0;
        for (Integer num4:numArrayList2
             ) {
            sumaArrayList+=num4;
        }
        int promArrayList=sumaArrayList/numArrayList2.size();
        System.out.println("El promedio del ArrayList es de : "+ promArrayList);
        // b) cuántos de los números son iguales al promedio aritmético
        int cantIgualNum=0;
        for (Integer num5:numArrayList2
             ) {
            if (promArrayList==num5){
                cantIgualNum++;
            }
        }
        System.out.println("La cantidad de numeros iguales al prodio es de "+ cantIgualNum);
        //  c) cuántos de los números son mayores que el promedio aritmético
        int mayoProm=0;
        for (Integer num6:numArrayList2
        ) {
            if (promArrayList<num6){
                mayoProm++;
            }
        }
        System.out.println("La cantidad de numeros  mayores al promedio es de "+ mayoProm);
        // d) cuántos de los números son menores que el promedio aritmético
        int menorProm=0;
        for (Integer num6:numArrayList2
        ) {
            if (promArrayList>num6){
                menorProm++;
            }
        }
        System.out.println("La cantidad de numeros  menores al promedio es de "+ menorProm);

    }
}