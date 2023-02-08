import java.util.Scanner;

public class Funciones3U5 {
    /*
     * Crea una aplicaciÃ³n que nos genere una cantidad de nÃºmeros enteros aleatorios que nosotros le pasaremos por teclado.
     * Crea un mÃ©todo donde pasamos como parÃ¡metros entre que nÃºmeros queremos que los genere, podemos pedirlas por teclado antes de generar los nÃºmeros. 
     * Este mÃ©todo devolverÃ¡ un nÃºmero entero aleatorio. Muestra los nÃºmeros por pantalla.
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce la cantidad de nÃºmeros aleatorios que quieres: ");
        int cantidad = teclado.nextInt();
        System.out.println("Introduce el valor mÃ­nimo del nÃºmero aleatorio: ");
        int min = teclado.nextInt();
        System.out.println("Introduce el valor mÃ¡ximo del nÃºmero aleatorio");
        int max = teclado.nextInt();
        System.out.println("Los nÃºmeros generados son: ");
        for(int i=0;i<cantidad;i++){
            System.out.println(generaNumero(min, max));
        }
        teclado.close();
    }
    public static int generaNumero(int minimo, int maximo){
        return ((int)Math.floor(Math.random()*(maximo + 1 - minimo) + minimo));
    }
}
