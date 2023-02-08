import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce la nota del primer examen: ");
        double primerEx = teclado.nextDouble();
        System.out.println("Introduce la nota que quieres sacar: ");
        double notaFinal = teclado.nextDouble();
        double segundoEx = ((100*notaFinal) - (primerEx*40))/60;

        System.out.println("La nota que necesitas obtener es: " + segundoEx);

        teclado.close();
    }
}
