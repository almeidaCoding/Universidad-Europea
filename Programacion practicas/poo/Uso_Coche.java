package poo;

public class Uso_Coche {
    public static void main(String[] args) {
        Coche fiat = new Coche();

        fiat.estableceColor("verde");
        fiat.configuraAsientos("si");
        fiat.configuraClimatizador("si");

        
        System.out.println(fiat.datosGenerales());
        System.out.println(fiat.dimeColor());
        System.out.println(fiat.dimeAsientos());
        System.out.println(fiat.dimeClimatizador());
    }
}