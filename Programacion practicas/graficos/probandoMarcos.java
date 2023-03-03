package graficos;
import javax.swing.*;

public class probandoMarcos {
    public static void main(String[] args) {
        newMarc marcOne = new newMarc();
    }
}

class newMarc extends JFrame{
    public newMarc(){
        setSize(500,300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}