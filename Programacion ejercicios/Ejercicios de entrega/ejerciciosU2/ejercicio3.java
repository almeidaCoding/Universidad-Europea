import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args){
        int numero, invertido = 0, resto;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un número de 5 dígitos: ");

        numero = teclado.nextInt();

        while(numero > 0){
            resto = numero % 10;
            invertido = invertido*10+resto;
            numero /= 10;
        }
        System.out.println(invertido);
        teclado.close();
    }     
}
