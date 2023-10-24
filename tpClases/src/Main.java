import Clases.*;

public class Main {
    public static void main(String[] args) {
        Perro caniche = new Perro();
        caniche.setNombre("Lola");
        caniche.setRaza("caniche_toy");
        caniche.setEdad(12);

        System.out.println("El perro es: " + caniche.getNombre());
        System.out.println("Su raza es: " + caniche.getRaza());
        System.out.println("La edad es: " + caniche.getEdad());
        caniche.ladrar();

    //Circulo
        Circulo circulo= new Circulo();
        circulo.setRadio(3);
        System.out.println("El Area  es " + circulo.calcularArea());
        System.out.println("La circunferencia es " + circulo.calcularCircunferencia());
    //Estudiante
        Estudiantes estudiante1=new Estudiantes("Juan",18,2321313);
        System.out.println("El nombre del estudiante 1 es : "+estudiante1.getNombre());
        System.out.println("Su edad es  : "+estudiante1.getEdad());
        System.out.println("Su numero de identificacion es : #"+ estudiante1.getNumeroIdent());
     //Libro
        Libro dolarizacion= new Libro("Dolarizacion","Emilio Ocampo",2022);
        Libro codigoLimpio= new Libro("Codigo Limpio","Rober C Martin",2012);

        dolarizacion.mostrarLibro();
        codigoLimpio.mostrarLibro();

    //Cuenta Bancaria
        CuentaBancaria cuenta1=new CuentaBancaria(1000000.0,123455612L);
        cuenta1.depositar(245.5);
        System.out.println("El saldo de la cuenta: #"+ cuenta1.getNumCuenta()+ " es "+ cuenta1.getSaldo());
    //Rectangulo
    Rectangulo rectangulo= new Rectangulo(12,32);
    rectangulo.impRentan();
    //Coche
        Coche clio= new Coche("renault","clio",2013) ;
        clio.imprCoche();
        clio.acelerar();
        clio.acelerar();
        clio.acelerar();
        clio.frenar();
        //Pelicula
        Pelicula pelicula1 = new Pelicula("La La Land", "Damien Chazelle", 128);
        Pelicula pelicula2 = new Pelicula("El Padrino", "Francis Ford Coppola", 175);
        Pelicula pelicula3 = new Pelicula("Inception", "Christopher Nolan", 148);
        Pelicula pelicula4 = new Pelicula("Pulp Fiction", "Quentin Tarantino", 154);
        pelicula1.infoPel();
        pelicula2.infoPel();
        pelicula3.infoPel();
        pelicula4.infoPel();
    }

}
