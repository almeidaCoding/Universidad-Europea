import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner (System.in);

        int A, B;

        System.out.println("Introduzca el valor de A: ");
        A = teclado.nextInt();
        System.out.println("Introduzca el valor de B: ");
        B = teclado.nextInt();

        System.out.println("Valores iniciales: A = " + A + " B = " + B);

        A = A+B;
        B = A-B;
        A = A-B;

        System.out.println("Los valores intercambiados son: A = " + A + " B = " + B);

        teclado.close();

    }
}
