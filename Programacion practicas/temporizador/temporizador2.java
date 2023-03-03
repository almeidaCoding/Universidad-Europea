package temporizador;
import javax.swing.*;
import java.awt.Toolkit;
import java.awt.event.*;
import java.util.Date;

public class temporizador2 {
    public static void main(String[] args) {
        reloj miReloj = new reloj(3000, true);
        miReloj.play();
        JOptionPane.showMessageDialog(null, "Pulsar 'Aceptar' para terminar");
        System.exit(0);
    }
}
class reloj{
    private int intervalo;
    private boolean sonido;

    public reloj(int intervalo, boolean sonido){
        this.intervalo = intervalo;
        this.sonido = sonido;
    }
    public void play(){
        ActionListener oyente = new DameHora2();
        Timer myTime = new Timer(intervalo, oyente);
        myTime.start();
    }

    //Clase interna
    private class DameHora2 implements ActionListener{
        public void actionPerformed(ActionEvent event){
            Date now = new Date();
            System.out.println("te pongo la hora cada 3 segundo: " + now);

            if(sonido){
                Toolkit.getDefaultToolkit().beep();
            }
        }
    }
}