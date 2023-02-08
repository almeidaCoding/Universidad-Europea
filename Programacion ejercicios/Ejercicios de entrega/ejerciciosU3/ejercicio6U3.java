import java.util.Scanner;

public class ejercicio6U3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);

        System.out.println("Introduce un número");
        double numeroUsuario = teclado.nextDouble();
        numDivisible(numeroUsuario);
        teclado.close();
    }

    public static int numDivisible(double numUser){
        int resto = (int) (numUser % 5);
        int resto2 = (int) (numUser % 10);

        if((numUser > 999) && (numUser < 10000) && (resto != 0) && (resto2 != 0)){
            System.out.println("El número que has introducido es válido, no es divisible entre 5 y no termina en 0");

        }else{
            System.out.println("El número que has introducido NO es válido, es divisible entre 5 y termina en 0");
        }
        return (int) numUser;
    }
}