import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        System.out.println("Introduce un radio: ");
        Scanner teclado = new Scanner (System.in);
        int radio = teclado.nextInt();

        System.out.println("Introduce una altura: ");
        int altura = teclado.nextInt();

        int volumen = (int) ((Math.PI)*Math.pow(radio, 2)*altura)/3;

        System.out.println("tu volumen es: " + volumen);

        teclado.close();
    }
}
