import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {

        //Inicio Scanner
        Scanner teclado = new Scanner(System.in); 
        
        System.out.println("Ingresa un numero con decimales: ");
        double numeroUsuario1 = teclado.nextDouble();
        teclado.nextLine();
        System.out.println("Ingrese otro número con decimales: ");
        double numeroUsuario2 = teclado.nextDouble();

        System.out.println(operacionSuma(numeroUsuario1, numeroUsuario2));
        System.out.println(operacionResta(numeroUsuario1, numeroUsuario2));
        System.out.println(operacionDividir(numeroUsuario1, numeroUsuario2));
        System.out.println(operacionMultiplicar(numeroUsuario1, numeroUsuario2));
        System.out.println(operacionModulo(numeroUsuario1, numeroUsuario2));


        teclado.close();
    }

    public static double operacionSuma(double user1, double user2){
        return user1 + user2;
    }
    public static double operacionResta(double user3, double user4){
        return user3 - user4;
    }
    public static double operacionMultiplicar(double user5, double user6){
        return user5 * user6;
    }
    public static double operacionModulo(double user7, double user8){
        return user7 % user8;
    }
    public static double operacionDividir(double user9, double user10){
        return user9 / user10;
    }
}
