public class Coche {
    private String marca;
    private String modelo;
    private int anioFab;
    private int velocidad;

    public Coche(String marca, String modelo, int anioFab) {
        this.marca = marca;
        this.modelo = modelo;
        this.anioFab = anioFab;
        this.velocidad = 0; // Inicializamos la velocidad a 0.
    }

    public void acelerar() {
        velocidad += 10;
        System.out.println("El coche está andando a " + velocidad + " km por hora");
    }

    public void frenar() {
        velocidad = 0;
        System.out.println("El coche se frenó a " + velocidad + " km por hora");
    }

    public void imprCoche() {
        System.out.println("El coche modelo " + modelo + " de la marca " + marca + " fue fabricado en el año " + anioFab);
    }
}