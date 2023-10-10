            // Ejer12
                      int [] arrayInser=new int[10];
            for (int i = 0; i < arrayInser.length; i++) {
                System.out.println("Ingrese el numero en el casillero "+ i);
                arrayInser[i]=src.nextInt();
            }
            ordenarArrayInsercion(arrayInser);
            System.out.println("Array Ordenado por Insercion");
            for (int i : arrayInser) {
                System.out.println("[ "+i+" ]");
            }