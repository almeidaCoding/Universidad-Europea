package Ejercicio1;
public abstract class ProductoElectronico {
    private String nombre;
    private double precio;
    private String marca;

    public ProductoElectronico(String nombre, double precio, String marca) {
        this.nombre = nombre;
        this.precio = precio;
        this.marca = marca;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public String getMarca() {
        return marca;
    }
}
