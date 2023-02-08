import java.util.Scanner;

public class ejercicio3U3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int dividendo = 0;
        int divisor = 0;
        int resto = 0;

        System.out.println("Ingrese un número que será el dividendo: ");
        dividendo = sc.nextInt();
        System.out.println("Ingrese un número que será el divisor: ");
        divisor = sc.nextInt();

        System.out.print(" = " + division(dividendo, divisor, resto));
        sc.close();
    }

    public static int division(int div, int divsor, int rest){
        rest = div % divsor;
        
        if(rest == 0){
            System.out.print("Esta división es exacta. El resultado es");
        }else{
            System.out.print("Esta división es exacta. El resultado es");
        }
        return rest;
    }
}
