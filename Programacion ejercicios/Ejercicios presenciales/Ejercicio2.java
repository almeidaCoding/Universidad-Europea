import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("Introduce una hora: ");
        int hora = teclado.nextInt();

        if((hora >= 6) && (hora <= 12)){
            System.out.println("Buenos días");
        }else if((hora >= 13) && (hora <= 20)){
            System.out.println("Buenas tardes");
        }else{
            System.out.println("Buenas noches");
        }

        teclado.close();
    }
}
