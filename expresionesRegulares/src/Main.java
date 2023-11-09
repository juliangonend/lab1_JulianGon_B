import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        //Ejer 1
        Scanner src = new Scanner(System.in);
        System.out.println("Ingrese un telefono");
        String tel= src.next();
        if(verifyTel(tel)){
            System.out.println("Telefono correcto");
        }else{
            System.out.println("Telefono Incorrecto");
        }
        //Ejer 2
        System.out.println("Ingrese un CUIT ");
        String cuit= src.next();
        if (verifyCuit(cuit)){
            System.out.println("CUIT correcto");
        }else{
            System.out.println("CUIT incorrecto");
        }
        //Ejer 3
        System.out.println("Ingrese un mail");
        String mail=src.next();
        if (verifyMail(mail)){
            System.out.println("Mail correcto");
        }else {
            System.out.println("Mail incorrecto");
        }
        //Ejer 4
        System.out.println("Ingrese nomeclatura de 22 carecteres");
        String nomeclatura= src.next();
        if (verifyNomeclatura(nomeclatura)){
            System.out.println("Nomeclatura correcta");
        }else{
            System.out.println("Nomeclatura incorrecta");
        }
        //Ejer 5
        System.out.println("Ingrese un Nombre");
        String name = src.next();
        if (verifyName(name)){
            System.out.println("Nombre correcto");
        }else{
            System.out.println("Nombre incorrecto");
        }
        //Ejer 6
        chargeData();
        //Ejer 7
        validateMultMail();
        //Ejer 8
        verifyInternationNum();
        //Ejer 9
        personalMail();
        // Ejer 10
        verifyPostalCode();
        //Ejer 11
        verifyDni();
        //Ejer 12

        //Ejer 13
    }
// 1.	Validación de Teléfono: Escribe un programa que solicite al usuario su número de teléfono.
// Utiliza la validación de teléfono proporcionada para garantizar que el número tenga entre 7 y 10 dígitos.
    public static Boolean verifyTel(String tel){
        Pattern pattern= Pattern.compile("\\d{7,10}");
        Matcher matcher= pattern.matcher(tel);
        if(matcher.matches()){

            return true;
        }else{

            return false;
        }
    }
// 2.	Validación de CUIL: Crea un programa que pida al usuario su número de CUIL. Utiliza la validación
// de CUIL proporcionada para verificar que el número tenga exactamente 11 dígitos.
    public static  boolean verifyCuit(String cuit){
        Pattern pattern= Pattern.compile("\\d{2}-?\\d{8}-?\\d");
        Matcher matcher= pattern.matcher(cuit);
        if (matcher.matches()){
            return  true;
        }else{
            return  false;
        }
    }

// 3.	Validación de Correo Electrónico: Desarrolla un programa que solicite una dirección de correo electrónico. Utiliza la validación de correo electrónico proporcionada para asegurarte
// de que la dirección cumple con un formato de correo electrónico válido.
    public  static Boolean verifyMail(String mail){
        Pattern pattern= Pattern.compile("[a-zA-Z0-9._]+@[a-zA-Z0-9._]+\\.[a-z]{2,}");

        Matcher matcher= pattern.matcher(mail);
        if(matcher.matches()){
            return true;
        }else{
            return false;
        }
    }
// 4.	Validación de Nomenclatura: Escribe un programa que requiera al usuario ingresar
// una nomenclatura de 22 caracteres. Usa la validación de nomenclatura para comprobar que la
// entrada tiene la longitud y el formato correctos.
    public static Boolean verifyNomeclatura(String nomeclatura) {
        Pattern pattern=Pattern.compile("^[a-zA-Z0-9_-]{22}$");
        Matcher matcher=pattern.matcher(nomeclatura);
        if(matcher.matches()){
            return true;
        }else {
            return false;
        }
}
// 5.	Validación de Letras: Crea un programa que pida al usuario ingresar un nombre.
// Utiliza la validación de letras para asegurarte de que solo contenga letras y tenga entre 7 y 10
// caracteres.
    public static boolean verifyName(String mail) {
        Pattern pattern= Pattern.compile("[A-Z]\\w{6,9}");
        Matcher matcher= pattern.matcher(mail);
        if (matcher.matches()){
            return true;
        }else{
            return  false;
        }
    }


// 6.	Combinación de Validaciones: Desarrolla un programa que solicite al usuario su número de teléfono,
// CUIL y correo electrónico. Aplica las validaciones adecuadas a cada entrada.
    public static void chargeData(){
        Scanner src=new Scanner(System.in);
        System.out.println("Ingrese su numero de telefono");
        String tel=src.next();
        System.out.println("Ingrese un CUIT ");
        String cuit= src.next();
        System.out.println("Ingrese un mail");
        String mail=src.next();

        if(verifyTel(tel)){
            System.out.println("Telefono correcto");
        }else{
            System.out.println("Telefono Incorrecto");
        }
        if (verifyCuit(cuit)){
            System.out.println("CUIT correcto");
        }else{
            System.out.println("CUIT incorrecto");
        }
        if (verifyMail(mail)){
            System.out.println("Mail correcto");
        }else {
            System.out.println("Mail incorrecto");
        }
    }

// 7.	Validación de Correo Electrónico Múltiple:
// Escribe un programa que permita al usuario ingresar una lista de correos electrónicos separados
// por comas. Aplica la validación de correo electrónico a cada dirección y muestra un mensaje de error si alguna
// de ellas es inválida.
    public static void validateMultMail(){
        Scanner src=new Scanner(System.in);
        System.out.println("Ingrese multiples mail para dividir los mail separelos por coma");
        String multMail=src.next();
        String[]mails=multMail.split(",");
        for (String mail:mails
             ) {
            if (verifyMail(mail)){
                System.out.println("El Mail "+mail+" es correcto");
            }else {
                System.out.println("El Mail "+mail+" es incorrecto");
            }
        }
    }

// 8.	Validación de Teléfono Internacional: Crea un programa que solicite al usuario un número de teléfono internacional.
// Utiliza una variante de la validación de teléfono para aceptar números que contengan el prefijo internacional.
    public static void verifyInternationNum(){
        Scanner src= new Scanner(System.in);
        System.out.println("Ingrese un numero internacional con el formato ej (5492616565713)");
        String internationalTel=src.next();
        Pattern pattern= Pattern.compile("\\d{9,13}");
        Matcher matcher= pattern.matcher(internationalTel);
        if (matcher.matches()){
            System.out.println("Valido como Numero Internacional");
        }else{
            System.out.println("Numero incorrecto");
        }
    }

// 9.	Validación de Correo Electrónico Personalizado:
// Desarrolla un programa que requiera una dirección de correo electrónico.
// Utiliza una versión personalizada de la validación de correo electrónico que acepte solo dominios de correo electrónico específicos
// (por ejemplo, "miempresa.com").
    public static void  personalMail() {
        Scanner src = new Scanner(System.in);
        System.out.println("Ingrese un dominio personalizado");
        String direccionPers = src.next();
        System.out.println("Ingrese un mail con dominio personalizado");
        String personalMail = src.next();
        Pattern pattern= Pattern.compile("[a-zA-Z0-9._]+@"+direccionPers+".[a-z]{2,}");
        Matcher matcher=pattern.matcher(personalMail);
        if (matcher.matches()){
            System.out.println("Mail con el dominio personalizado");
        }else{
            System.out.println("No es un mail con el dominio actualizado");
        }
    }

// 10.	Validación de Código Postal: Escribe un programa que pida al usuario su código postal.
// Utiliza una versión modificada de la validación de letras que permita letras y números, pero asegúrate de que tenga el formato correcto.
    public static  void verifyPostalCode(){
        Scanner src= new Scanner(System.in);
        System.out.println("Ingrese el codigo postal puede tener letra y numeros ");
        String postalCode=src.next();
        Pattern pattern=Pattern.compile("[a-zA-Z0-9]{4,8}");
        Matcher matcher= pattern.matcher(postalCode);
        if (matcher.matches()){
            System.out.println("codigo postal correcto");
        }else{
            System.out.println("Codigo postal incorrecto");
        }
    }
// 11.	Validación de DNI: Crea un programa que solicite al usuario su número de Documento Nacional de Identidad (DNI).
// Utiliza una versión adaptada de la validación de CUIL para asegurarte de que tenga exactamente 8 dígitos.
    public static  void verifyDni(){
        Scanner src=new Scanner(System.in);
        System.out.println("Ingrese un Dni con el formato dd-ddd-ddd");
        String dni=src.next();
        Pattern pattern= Pattern.compile("\\d{2}-?\\d{3}-?\\d{3}");
        Matcher matcher= pattern.matcher(dni);
        if (matcher.matches()){
            System.out.println("Dni correcto");
        }else{
            System.out.println("Dni incorrecto");
        }
    }
// 12.	Validación de Usuario: Desarrolla un programa que requiera un nombre de usuario.
// Utiliza una variante de la validación de letras que permita letras, números y guiones bajos,
// pero asegúrate de que cumpla con ciertas restricciones de longitud.
    public static  void verifyUser(){
        Scanner src= new Scanner(System.in);
        System.out.println("Ingrese un nombre de usuario puede contener letras, números y guiones bajos, pero no menos de 6 y mas de 8 caracteres");
        String user= src.next();
        Pattern pattern= Pattern.compile("[a-zA-Z0-9_]{6,8}");
        Matcher matcher= pattern.matcher(user);
        if(matcher.matches()){
            System.out.println("Usuario correcto");
        }else{
            System.out.println("Usuario Incorrecto");
        }
    }

// 13.	Validación de Fecha: Escribe un programa que solicite al usuario una fecha en formato "dd/mm/aaaa". Utiliza una versión modificada de la validación de letras para comprobar que la entrada tenga el formato de fecha correcto.
    public static  void verifyDate(){
        Scanner src= new Scanner(System.in);
        System.out.println("Ingresa una fecha correcta  con el formato dd//mm//aaa");
        String date= src.next();
        Pattern pattern=Pattern.compile("^([0-2][0-9]|3[0-1])/([0-1][0-9]|[1-2]\\d|3[0-1])/(\\d{4})$");
        Matcher matcher= pattern.matcher(date);
        if(matcher.matches()){
            System.out.println("fecha correcto");
        }else{
            System.out.println("fecha Incorrecto");
        }

    }
// 14.	Validación de Dominio Web: Crea un programa que permita al usuario ingresar nombres de dominio web.
// Aplica la validación de correo electrónico personalizada para garantizar que solo se acepten nombres de dominio válidos.
    public static  void domainWeb(){
    Scanner src= new Scanner(System.in);
    System.out.println("Ingresa un domio de una web");
    String webDomain= src.next();
    Pattern pattern=Pattern.compile("^(https?://)?[a-z0-9-]+(\\.[a-z0-9-]+)*(\\.[a-z]{2,6})$");
    Matcher matcher= pattern.matcher(webDomain);
    if(matcher.matches()){
        System.out.println("dominio  correcto");
    }else{
        System.out.println("dominio Incorrecto");
    }

}
// 15.	Validación de Nombres de Producto: Desarrolla un programa que requiera el nombre de un producto.
// Utiliza la validación de letras para asegurarte de que solo contenga letras y tenga una longitud mínima de 5 caracteres.
public static  void verifyNameProduct(){
    Scanner src= new Scanner(System.in);
    System.out.println("Ingrese nombre del producto de no mas de 5 caracteres");
    String product= src.next();
    Pattern pattern= Pattern.compile("[a-zA-Z]{1,5}");
    Matcher matcher= pattern.matcher(product);
    if(matcher.matches()){
        System.out.println("Nombre del producto correcto");
    }else{
        System.out.println("Nombre del producto incorrecto");
    }
}
// 16.	Validación de Contraseña: Crea un programa que requiera una contraseña.
// Utiliza una versión personalizada de la validación de letras y números que aplique restricciones de longitud y complejidad.

    public static void verifyPassword(){
        Scanner src= new Scanner(System.in);
        System.out.println("Ingrese una contraseña de 8 caracteres con letras mayusculas , minusculas y al menos un caracter especial");
        String password= src.next();
        Pattern pattern= Pattern.compile("(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[^a-zA-Z0-9]).{8,}$");
        Matcher matcher= pattern.matcher(password);
        if (matcher.matches()){
            System.out.println("Contraseña correcta");
        }else {
            System.out.println("Contraseña incorrecta");
        }
    }

}