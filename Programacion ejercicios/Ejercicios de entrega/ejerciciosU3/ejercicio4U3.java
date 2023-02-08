import java.util.Scanner;

public class ejercicio4U3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        double numero;
        int resto;


        System.out.println("introducir numero");
        numero = sc.nextDouble();
        resto = (int) (numero % 2);
        if(resto == 0 ){
            System.out.println("El número es par");
        }else{
            System.out.println("El número es impar");
        }

        if(numero < 0){
            System.out.println("El número es negativo");
        }else{
            System.out.println("El número es positivo");
        }

        if((Math.floor(numero)-numero)==0){
            System.out.println("El número es entero");
        }else{
            System.out.println("El número es decimal");
        }
        sc.close();
    }
}
