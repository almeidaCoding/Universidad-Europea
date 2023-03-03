package temporizador;
import javax.swing.*;
import java.awt.event.*;
import java.util.Date;

public class pruebaTemporizador {
    public static void main(String[] args) {
        
        DameHora oyente = new DameHora();
        Timer miTemporizador = new Timer(5000, oyente);
        miTemporizador.start();
        JOptionPane.showMessageDialog(null,"Pulsa ''Aceptar'' para detenerme");
        System.exit(0);
    }
}

class DameHora implements ActionListener{
    public void actionPerformed(ActionEvent e){
        
        Date now = new Date();
        System.out.println("Te pongo la hora cada 5 segundos: " + now);
    }
}