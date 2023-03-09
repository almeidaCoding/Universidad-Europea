package Ejercicio1;
/**
 * Clase que representa un portátil, que extiende la clase "ProductoElectrónico" e implementa la interfaz "ConectividadInternet".
 */
public class Portatil extends ProductoElectronico implements ConectividadInternet {

    /** La capacidad de almacenamiento del portátil. */
    private int capacidadAlmacenamiento;
    /** La cantidad de memoria RAM del portátil. */
    private int cantidadRAM;
    /** La tarjeta gráfica del portátil. */
    private String tarjetaGrafica;

    /**
     * Crea un nuevo objeto Portatil con los atributos especificados.
     * 
     * @param nombre el nombre del portátil
     * @param precio el precio del portátil
     * @param marca la marca del portátil
     * @param capacidadAlmacenamiento la capacidad de almacenamiento del portátil
     * @param cantidadRAM la cantidad de memoria RAM del portátil
     * @param tarjetaGrafica la tarjeta gráfica del portátil
     */
    public Portatil(String nombre, int precio, String marca, int capacidadAlmacenamiento, int cantidadRAM, String tarjetaGrafica) {
        super(nombre, precio, marca);
        this.capacidadAlmacenamiento = capacidadAlmacenamiento;
        this.cantidadRAM = cantidadRAM;
        this.tarjetaGrafica = tarjetaGrafica;
    }

    /**
     * Conecta el portátil a Internet a través de Wi-Fi o Ethernet.
     */
    public void conectarInternet() {
        System.out.println("Conectando a Internet a través de Wi-Fi o Ethernet...");
    }

    /**
     * Obtiene la capacidad de almacenamiento del portátil.
     * 
     * @return la capacidad de almacenamiento del portátil
     */
    public int getCapacidadAlmacenamiento() {
        return capacidadAlmacenamiento;
    }

    /**
     * Establece la capacidad de almacenamiento del portátil.
     * 
     * @param capacidadAlmacenamiento la nueva capacidad de almacenamiento del portátil
     */
    public void setCapacidadAlmacenamiento(int capacidadAlmacenamiento) {
        this.capacidadAlmacenamiento = capacidadAlmacenamiento;
    }

    /**
     * Obtiene la cantidad de memoria RAM del portátil.
     * 
     * @return la cantidad de memoria RAM del portátil
     */
    public int getCantidadRAM() {
        return cantidadRAM;
    }

    /**
     * Establece la cantidad de memoria RAM del portátil.
     * 
     * @param cantidadRAM la nueva cantidad de memoria RAM del portátil
     */
    public void setCantidadRAM(int cantidadRAM) {
        this.cantidadRAM = cantidadRAM;
    }

    /**
     * Obtiene la tarjeta gráfica del portátil.
     * 
     * @return la tarjeta gráfica del portátil
     */
    public String getTarjetaGrafica() {
        return tarjetaGrafica;
    }

    /**
     * Establece la tarjeta gráfica del portátil.
     * 
     * @param tarjetaGrafica la nueva tarjeta gráfica del portátil
     */
    public void setTarjetaGrafica(String tarjetaGrafica) {
        this.tarjetaGrafica = tarjetaGrafica;
    }
}
