package Ejercicio1;
class Tableta extends ProductoElectronico implements ConectividadInternet {
    private double tamanoPantalla;
    private int capacidadAlmacenamiento;
    private String tipoBateria;

    public Tableta(String nombre, double precio, String marca, double tamanoPantalla, int capacidadAlmacenamiento, String tipoBateria) {
        super(nombre, precio, marca);
        this.tamanoPantalla = tamanoPantalla;
        this.capacidadAlmacenamiento = capacidadAlmacenamiento;
        this.tipoBateria = tipoBateria;
    }

    public double getTamanoPantalla() {
        return tamanoPantalla;
    }

    public int getCapacidadAlmacenamiento() {
        return capacidadAlmacenamiento;
    }

    public String getTipoBateria() {
        return tipoBateria;
    }

    @Override
    public void conectarInternet() {
        System.out.println(getNombre() + " se conecta a Internet a través de Wi-Fi.");
    }
}