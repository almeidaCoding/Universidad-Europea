package poo;
import javax.swing.*;

public class Uso_Coche {
    public static void main(String[] args) {
        Coche fiat = new Coche();

        //Paso de Parámetros
        fiat.estableceColor(JOptionPane.showInputDialog("Introduce color"));
        fiat.configuraAsientos(JOptionPane.showInputDialog("¿Tiene asientos de cuero?"));
        fiat.configuraClimatizador(JOptionPane.showInputDialog("¿Tiene asientos de climatizador?"));

        
        System.out.println(fiat.datosGenerales());
        System.out.println(fiat.dimeColor());
        System.out.println(fiat.dimeAsientos());
        System.out.println(fiat.dimeClimatizador());
        System.out.println(fiat.pesoCoche());
        System.out.println("El precio final del coche es " + fiat.precioCoche());
    }
}