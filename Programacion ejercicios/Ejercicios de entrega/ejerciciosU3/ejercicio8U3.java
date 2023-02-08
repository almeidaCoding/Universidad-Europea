import java.util.Scanner;
 
public class ejercicio8U3 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner (System.in)) {
            System.out.println("Ingresa un numero: ");
            int numero = sc.nextInt();

            int contador;
            int indice;

            contador = 0;

            /*indice entra valiendo '1' y aumenta hasta valer más que el número introducido*/
            for(indice = 1; indice <= numero; indice++){
            /*la división del número entre el valor de indice, si el resto de la división es '0' 
            contador aumenta (contador es la cantidad de divisores del número introducido)*/
                if((numero % indice) == 0){
                    contador++;
                }
            }

            /*si el número introducido tiene menos o 2 divisores es primo*/
            if(contador <= 2){
                System.out.println("El numero es primo");
            /*si el número introducido tiene más de 2 divisores no es primo*/
            }else{
                System.out.println("El numero no es primo");
            }
            sc.close();
        }
    }
}