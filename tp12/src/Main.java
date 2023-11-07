import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner src= new Scanner(System.in);
// # 2.	Creación de un Conjunto de Datos:
// # •	Crea un conjunto de datos ficticio que contenga información variada, como direcciones de correo electrónico,
// números de teléfono, fechas, códigos postales, etc.
        ArrayList<String[]>contactos=new ArrayList<>();
       contactos.add(new String[]{"gonzalezjulian@gmail.com","2616565713","21/06/2004","5501"});
        contactos.add(new String[]{"ejemplo1@gmail.com", "1234567890", "01/01/2000", "12345"});
        contactos.add(new String[]{"usuario2@hotmail.com", "9876543210", "15/07/1995", "54321"});
        contactos.add(new String[]{"correo3@yahoo.com", "5555555555", "10/03/1992", "99999"});
        contactos.add(new String[]{"contacto4@example.com", "1111111111", "05/12/2008", "77777"});
        contactos.add(new String[]{"persona5@gmail.com", "9999999999", "30/09/1980", "88888"});

        for (String[] persona:contactos
             ) {
            System.out.println("--------------------");
            String mail =persona[0] ;
            System.out.println("Usuario"+mail);
            String telefono =persona[1];
            String fecha = persona[2];
            String codigoPostal = persona[3];
            validarMail(mail);
            validadTel(telefono);
            validarFecha(fecha);
            validarCodPostal(codigoPostal);

        }
        // # 3.	Validación de Datos:
// # •	Diseña un programa en un lenguaje de programación (Java) que utilice expresiones regulares
// para validar y verificar los datos en tu conjunto de datos. Por ejemplo, puedes verificar si una dirección de correo electrónico
// es válida o si un número de teléfono sigue un formato específico.


// # •	Validar entrada de datos en un arraylist y aplicarlo.

// # 4.	Informe de Investigación:
// # •	Prepara un informe que desarrolle el tema sobre las expresiones regulares y cómo se aplicaron en la validación de datos.
// # •	Incluye ejemplos de patrones de expresiones regulares utilizados en tu programa y cómo ayudaron en la validación de los datos.
// # •	Comprensión de los conceptos de expresiones regulares.
// # •	Diseño y desarrollo del programa de validación de datos.
// # •	Claridad y organización del informe de investigación.




// # 5.	Ejercicios:

// # •	Comprobar si el String cadena no acaba con un dígito.
        String palabra1="palabra1";
        Pattern pattern=Pattern.compile(".*\\d$");
        Matcher matcher=pattern.matcher(palabra1);
        if (matcher.matches()){
            System.out.println("Termina con un digito");
        }else{
            System.out.println("No termina con un digito");
        }
// # •	Comprobar si el String cadena no empieza por un dígito.
        String palabra2="2palabra";
        Pattern pattern2=Pattern.compile("^\\d.*");
        Matcher matcher2=pattern2.matcher(palabra2);
        if (matcher2.matches()){
            System.out.println("Empieza con un digito");
        }else{
            System.out.println("No empieza con un digito");
        }
// # •	Comprobar si el String cadena está formado por un mínimo de 5 letras mayúsculas o minúsculas y un máximo de 10.

        String palabra3="pal";
        Pattern pattern3=Pattern.compile("[a-zA-Z]{5,10}");
        Matcher matcher3=pattern3.matcher(palabra3);
        if (matcher3.matches()){
            System.out.println("Tiene entre 5 y 10 letras");
        }else{
            System.out.println("No Tiene entre 5 y 10 letras");
        }
        // # •	Validar el ingreso de un DNI (xx-xxx-xxx).
        String dni="45-586-147";
        Pattern pattern4=Pattern.compile("\\d{1,2}-\\d{3}-\\d{3}");
        Matcher matcher4=pattern4.matcher(dni);
        if (matcher4.matches()){
            System.out.println("DNI correcto");
        }else{
            System.out.println("DNI incorrecto");
        }
// # •	Guardar en un arraylist una serie de mails, pero antes de ser guardados deben cumplir con las condiciones de las expresiones regulares.
        ArrayList<String>mailList= new ArrayList<>();
        String mail2;
        do{
            System.out.println("Ingresa mail al ArrayList si al ingresar no es un mail termina la ejecusion");
            mail2=src.next();
            Pattern patterMail= Pattern.compile("[A-Za-z0-9]+@[A-Za-z0-9]+\\.[a-z]{2,}");
            Matcher matcherMail= patterMail.matcher(mail2);
            if (matcherMail.matches()){
                System.out.println("Mail Ingresado Correctamente");
                mailList.add(mail2);

            }else{
                System.out.println("Mail ingresado incorrectamente");
                break;
            }

        }while(true);
        System.out.println(mailList);
// # •	Comprobar si el String cadena contiene “abc”.
        String palabra4="palabr-abc-";
        Pattern pattern5=Pattern.compile("abc");
        Matcher matcher5=pattern5.matcher(palabra4);
        if (matcher5.find()){
            System.out.println("Tiene abc");
        }else{
            System.out.println("No tiene abc");
        }
    }
    public static void validarMail(String mail) {
        Pattern pattern=Pattern.compile("[A-Za-z0-9]+@[A-Za-z0-9]+\\.[a-z]{2,}");
        Matcher matcher= pattern.matcher((mail));
        if (matcher.matches()){
            System.out.println("Email ingresado correctamente");
        }else{
            System.out.println("Email ingresado incorrectamente");
        }
    }
    public static void validarFecha(String fecha){
        Pattern pattern= Pattern.compile("\\d{2}/\\d{2}/\\d{4}");
        Matcher matcher= pattern.matcher(fecha);
        if (matcher.matches()){
            System.out.println("Fecha ingresado correctamente");
        }else{
            System.out.println("Fecha ingresado incorrectamente");
        }
    }
    public static void validadTel(String tel){
        Pattern pattern=Pattern.compile("[0-9]{10}");
        Matcher matcher=pattern.matcher(tel);
        if (matcher.matches()){
            System.out.println("Telefono correcto");
        }else {
            System.out.println("Telefono Incorrecto");
        }
    }
    public static void validarCodPostal(String postal){
        Pattern pattern= Pattern.compile("\\d{4}");
        Matcher matcher= pattern.matcher(postal);
        if(matcher.matches()){
            System.out.println("Codigo postal ingresado correctamente");
        }else{
            System.out.println("Codigo postal ingresado incorrectamente");
        }
    }

}