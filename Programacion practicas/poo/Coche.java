package poo;
public class Coche {
    private int ruedas; // Propiedades iniciales que tendrán en común los objetos
    private int pesoPlataforma; // Propiedades iniciales que tendrán en común los objetos
    private int largo; // Propiedades iniciales que tendrán en común los objetos
    private int ancho; // Propiedades iniciales que tendrán en común los objetos
    private int motor; // Propiedades iniciales que tendrán en común los objetos
    private String color; // Propiedades que varian dependiendo del tipo de coche, estas propiedades ya no son en común
    private int pesoTotal; // Propiedades que varian dependiendo del tipo de coche, estas propiedades ya no son en común
    private boolean asientosCuero, climatizador; // Propiedades que varian dependiendo del tipo de coche, estas propiedades ya no son en común

    // Constructor
    public Coche(){
        ruedas = 4; // Propiedades iniciales que tendrán en común los objetos con su valor inicial
        largo = 2000; // Propiedades iniciales que tendrán en común los objetos con su valor inicial
        ancho = 300; // Propiedades iniciales que tendrán en común los objetos con su valor inicial
        motor = 1600; // Propiedades iniciales que tendrán en común los objetos con su valor inicial
        pesoPlataforma = 500; // Propiedades iniciales que tendrán en común los objetos con su valor inicial
    }

    // Método Getter Datos Generales del coche
    public String datosGenerales(){
        return "La plataforma del vehículo tiene " + ruedas + " ruedas" + ". Mide " + largo/1000 + " metros con un ancho de " + ancho + " centímetros y un peso de plataforma de " + pesoPlataforma + " kg.";
    }

    // Método Setter para el color del coche
    public void estableceColor(String colorCoche){ //Paso por parámetro
        color = colorCoche;
    }

    // Método Getter para mostrar el color del coche
    public String dimeColor(){
        return "El color del coche es " + color;
    }

    // Método Setter Asientos
    public void configuraAsientos(String asientosCuero){
        if(asientosCuero == "si"){
            this.asientosCuero = true;
        }else{
            this.asientosCuero = false;
        }
    }

    // Método Getter Asientos
    public String dimeAsientos(){
        if(asientosCuero == true){
            return "El coche tiene asientos de cuero";
        }else{
            return "El coche no tiene asientos de cuero";
        }
    }

    // Método Setter Climatizador
    public void configuraClimatizador(String climatizador){
        if (climatizador == "si"){
            this.climatizador = true;
        }else{
            this.climatizador = false;
        }
    }

    // Método Getter Climatizador
    public String dimeClimatizador(){
        if (climatizador == true){
            return "El coche incorpora climatizador";
        }else{
            return "El coche lleva aire acondicionado pero no climatizador";
        }
    }

    
}