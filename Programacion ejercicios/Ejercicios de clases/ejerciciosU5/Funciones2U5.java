import java.util.Scanner;

public class Funciones2U5 {
    /*
     * Crea una aplicacion que nos calcule el area de un circulo, cuadrado o triangulo. 
     * Pediremos que figura queremos calcular su area y segun lo introducido pedira los valores necesarios para calcular el area. 
     * Crea un metodo por cada figura para calcular cada area, este devolvera un numero real. 
     * Muestra el resultado por pantalla.
     *       Circulo: (radio^2)*PI
     *       Triangulo: (base * altura) / 2
     *       Cuadrado: lado * lado
     */
    public static void main(String[] args){
        double resultado=0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce una figura: circulo, triangulo o cuadrado");
        String eleccion = teclado.nextLine();
        switch (eleccion){
            case "circulo":
                System.out.println("Introduce el radio");
                double radio=teclado.nextDouble();
                resultado=areaCirculo(radio);
                break;
            case "triangulo":
                System.out.println("Introduce la base");
                double base=teclado.nextDouble();
                System.out.println("Introduce la altura");
                double altura=teclado.nextDouble();
                resultado=areaTriangulo(base, altura);
                break;
            case "cuadrado":
                System.out.println("Introduce la medida de un lado");
                double lado=teclado.nextDouble();
                resultado=areaCuadrado(lado);
                break;
            default:
                System.out.println("No has introducido una figura correcta");
                break;
        }
        System.out.println("El area del " + eleccion + " es " + resultado);
        teclado.close();
   }

   
   public static double areaCirculo (double radio){
        return Math.pow(radio, 2)*Math.PI;
    }
   public static double areaTriangulo (double base, double altura){
        return base*altura/2;
    }
   public static double areaCuadrado (double lado){
        return lado*lado;
    }
}
