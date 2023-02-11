package poo;
import javax.swing.*;

public class Uso_Coche {
    public static void main(String[] args) {
        Coche fiat = new Coche();

        //Paso de Parámetros
        fiat.estableceColor(JOptionPane.showInputDialog("Introduce color"));
        fiat.configuraAsientos(JOptionPane.showInputDialog("¿Tiene asientos de cuero?"));
        fiat.configuraClimatizador(JOptionPane.showInputDialog("¿Tiene asientos de climatizador?"));


        
        JOptionPane.showMessageDialog(null, fiat.datosGenerales());
        JOptionPane.showMessageDialog(null, fiat.dimeColor());
        JOptionPane.showMessageDialog(null, fiat.dimeAsientos());
        JOptionPane.showMessageDialog(null, fiat.dimeClimatizador());
        JOptionPane.showMessageDialog(null, fiat.pesoCoche());
        JOptionPane.showMessageDialog(null, "El precio final del coche es " + fiat.precioCoche());
    }
}