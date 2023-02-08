// Crea un programa en Java que convierta un número en base decimal a binario. Esto lo realizará un método al que le pasaremos el numero entero como parámetro y devolverá un String con el numero convertido a binario.
// Os recuerdo como convertir un número decimal a binario: dividir entre 2 el numero, el resultado de esa división se divide entre 2 de nuevo y así sucesivamente hasta que no se pueda dividir mas, el resto que obtengamos de cada división formara el numero binario, de abajo a arriba.
// Veamos un ejemplo: si introducimos un 8 nos deberá devolver 1000

import java.util.Scanner;

public class cambioBase {
    public static void main(String[] args) {


        Scanner teclado = new Scanner (System.in);
        System.out.println("Introduce un número entero: ");
        int numEnt = teclado.nextInt();
        System.out.println("El número " + numEnt + " convertido a binario " + numBinario(numEnt));
        teclado.close();
    }
    
    public static String numBinario(int numEnt){
        String binario = " ";
        if(numEnt > 0){
            while(numEnt > 0){
                if(numEnt % 2 == 0){
                    binario = "0" + binario;
                }else{
                    binario = "1" + binario;
                }
                numEnt = numEnt / 2;
            }
        }else if(numEnt == 0){
            binario = "0";
        }else{
            binario = "no se pudo convertir el número, ingrese solo números positivos";
        }
        return binario;
    }
}