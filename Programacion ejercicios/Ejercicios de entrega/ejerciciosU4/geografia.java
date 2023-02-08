import java.util.Scanner;

public class geografia {
  public static void main(String[] args) {

    Scanner teclado = new Scanner (System.in);
    String [][] matriz = new String [4][4];
    String matrizFill = "";

    for (int provincias = 0; provincias < matriz.length; provincias++){
        System.out.println("Introduce el nombre de la provincia " + (provincias+1) + " :");
        matriz[provincias][0] = teclado.nextLine() + ": ";
    }
    for(int ciudades = 0; ciudades < matriz.length; ciudades++){
        for(int provincias = 1; provincias < matriz.length; provincias++){
            System.out.println("Introduce el nombre de la ciudad " + (provincias) + " de la provincia " + (ciudades+1) + " :");
            matriz[ciudades][provincias] = teclado.nextLine();
        }
    }
    for(int provincias = 0; provincias < matriz.length; provincias++){
        for(int ciudades = 0; ciudades < matriz.length; ciudades++){
            matrizFill += matriz [provincias][ciudades] + "  ";
        }
        matrizFill += "\n";
    }

    System.out.println("Estas son las provincias y ciudades que has introducido: ");
    System.out.println(matrizFill);
    teclado.close();
  }  
}
