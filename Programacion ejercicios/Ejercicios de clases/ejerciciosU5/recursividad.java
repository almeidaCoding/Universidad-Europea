import java.util.Scanner;

public class recursividad {
    public static void main (String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un nÃºmero entero: ");
        int numero = teclado.nextInt();
        System.out.println("El factorial de: " + numero + " es: " + factorial(numero));
        teclado.close();
        System.out.println(sumaDigitosRecur(1234));
        System.out.println(invertirPalabra("hola"));
    }
    // Factorial de un nÃºmero: producto de dicho nÃºmero por todos los nÃºmeros menores que Ã©l hasta llegar a 1
    // 5! = 5 * 4 * 3 * 2 * 1
    // ExcepciÃ³n: 0! = 1.
    public static int factorial(int num){
        int fact = 1;
        for (int i = 1; i <= num; i++){
            fact = fact*i;
        }
        return fact;
    }

    // FunciÃ³n recursiva, aquella que se llama asÃ­ misma: buscar que la llamada deje de producirse en algÃºn momento
    // 5! = 5 * 4!
    // 4! = 4 * 3!
    // 3! = 3 * 2!
    // 2! = 2 * 1!
    // 1! = 1 * 0!
    // 0! = 1
    public static int factorialRecursivo(int num){
        if (num == 0){
            return 1;
        } else{
            return num * factorialRecursivo(num-1);
        }
    }

    public static int sumaDigitos(int numero) {
        int suma=0;
	    while(numero>0){
		    suma+=(numero%10);
		    numero/=10;
	    }
	    return (suma);
        
    }
    // 1234
    // 4 + sumaDigitosRecur(123)
    //     3 + sumaDigitosRecur(12)
    //         2 + sumaDigitosRecur(1)
    //                   1
    //   4 + 3 + 2 + 1
    public static int sumaDigitosRecur(int numero) {
        if (numero<10){
            return numero;
        }
        else{
            return numero%10 + sumaDigitosRecur(numero/10);
        }
        
    }

    // "hola"
    // invertirPalabra("ola")            + h
    // invertirPalabra("la")     + o 
    // invertirPalabra("a") + l
    // a
    // a + l + o + h 
    public static String invertirPalabra(String palabra){
         
        if(palabra.length()==1){
            return palabra;
        }else{
            return invertirPalabra(palabra.substring(1)) + palabra.charAt(0);
        }
         
    }
}

