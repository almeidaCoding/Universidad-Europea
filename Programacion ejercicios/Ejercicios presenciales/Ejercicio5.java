import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la altura que deseas: ");
        int altura = sc.nextInt();
        int operacion = (altura + 1) / 2;

        printL(altura, operacion);
        sc.close();
    }

    public static int printL(int alt, int oper){
        for (int i = 1; i <= alt; i++) {
            for (int j = 1; j <= oper; j++) {
                if (i == alt || j == 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        return oper;
    }
}
