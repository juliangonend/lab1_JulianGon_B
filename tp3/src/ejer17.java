import java.util.Scanner;

public class ejer17 {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        String notaAlfabetica;
        double nota;

        System.out.println("Ingresa la nota del examen");
        do {
            nota = src.nextDouble();
        } while (nota < 0 || nota > 10);

        if (nota <= 5) {
            notaAlfabetica = "Insuficiente";
        } else if (nota <= 6) {
            notaAlfabetica = "Suficiente";
        } else if (nota <= 7) {
            notaAlfabetica = "Bien";
        } else if (nota < 9) {
            notaAlfabetica = "Notable";
        } else {
            notaAlfabetica = "Sobresaliente";
        }

        System.out.println("La calificación es: " + notaAlfabetica);
    }
}
