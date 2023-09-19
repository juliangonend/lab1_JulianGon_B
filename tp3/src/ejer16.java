import java.util.Scanner;

public class ejer16 {
    public static void main(String[] args) {
        Scanner src=new Scanner(System.in);
        System.out.println("Ingrese un Mes del año del 1 al 12");

        int numMes;
        int diasMes=0;
        String mes="";
        do {
            numMes=src.nextInt();
        }while(numMes>12 || numMes<0);
    if (numMes==2){
        diasMes=28;
        mes="Febrero";
    }else if (numMes==1 || numMes==3|| numMes==5|| numMes==7|| numMes==8|| numMes==10|| numMes==12){
        diasMes=31;
        switch (numMes){
            case 1:
                mes="Enero";
                break;
            case 3:
                mes="Marzo";
            case 4:
                mes="Abril";
            case 5:
                mes="Mayo";
            case 7:
                mes="Junio";
            case 8:
                mes="Agosto";
            case 10:
                mes="Octubre";

            case 12:
                mes="Diciembre";
        }

    }else{
        diasMes=30;
        switch (numMes){
            case 4:
                mes="Abril";
            case 6:
                mes="Junio";
            case 9 :
                mes="Septiembre";
            case 11:
                mes="Noviembre";
        }

    }
        System.out.println(" El mes de "+ mes + " tiene " + diasMes + "dias");
    }
}
