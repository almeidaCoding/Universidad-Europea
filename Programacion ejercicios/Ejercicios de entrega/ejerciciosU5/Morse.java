import java.util.Scanner;

public class Morse{
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("Ingresa un número para convertirlo a código morse: ");
        int num = teclado.nextInt();

        System.out.println("Tú número en código morse es:" + convierteEnMorse(num));

        teclado.close();
    }

    public static String convierteEnMorse(int n){
        String morse [] = {" _ _ _ _ ", " . _ _ _ _ ", " . . _ _ _ ", " . . . _ _ ", " . . . . _ ", " . . . . . ", " . . . . ", " _ _ . . . ", " _ _ _ . . "," _ _ _ _ . "};
    
        String resultado = "";
        do {
           resultado = morse[n%10] + resultado;
           n = n/10;
        } while (n >0);
     return resultado;
    }
}