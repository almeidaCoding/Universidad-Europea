package Ejercicio1;
public class TelefonoMovil extends ProductoElectronico implements ConectividadInternet {
    private String modelo;
    private int capacidadAlmacenamiento;
    private int numeroNucleosProcesador;
    private static int totalTelefonosMoviles = 0;

    public TelefonoMovil(String nombre, double precio, String marca, String modelo, int capacidadAlmacenamiento, int numeroNucleosProcesador) {
        super(nombre, precio, marca);
        this.modelo = modelo;
        this.capacidadAlmacenamiento = capacidadAlmacenamiento;
        this.numeroNucleosProcesador = numeroNucleosProcesador;
        totalTelefonosMoviles++; // Incrementamos el contador de teléfonos móviles creados
    }

    public String getModelo() {
        return modelo;
    }

    public int getCapacidadAlmacenamiento() {
        return capacidadAlmacenamiento;
    }

    public int getNumeroNucleosProcesador() {
        return numeroNucleosProcesador;
    }

    @Override
    public void conectarInternet() {
        System.out.println(getNombre() + " se conecta a Internet a través de una red móvil.");
    }

    public static int getTotalTelefonosMoviles() {
        return totalTelefonosMoviles;
    }
}
