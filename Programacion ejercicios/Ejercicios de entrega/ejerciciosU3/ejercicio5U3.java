import java.util.ArrayList;
import java.util.Scanner;

public class ejercicio5U3 {
    public static void main(String[] args) {
        ArrayList<Double> lista = new ArrayList<Double>();
        Scanner reader = new Scanner(System.in);
        double numero = 0;

        System.out.println(ingresoNumeros(reader, numero, lista));
        reader.close();
    }

    public static ArrayList<Double> ingresoNumeros(Scanner read, double num, ArrayList<Double> list){
        do {
            System.out.print("Ingresa un número: ");
            num = read.nextDouble();
            list.add(num);
        } while (num!=0);
        return list;
    }
}