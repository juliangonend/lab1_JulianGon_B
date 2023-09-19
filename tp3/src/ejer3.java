import java.util.Scanner;
public class ejer3 {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("Ingrese una letra ");
        char letra = src.next().charAt(0);
        if (Character.isUpperCase(letra)) {
            System.out.println("La letra esta en mayuscula ");
        } else {
            System.out.println("La letra no esta en mayuscula ");
        }
    }
}
