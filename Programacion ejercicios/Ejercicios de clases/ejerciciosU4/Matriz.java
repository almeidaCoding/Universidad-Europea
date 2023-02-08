import java.util.Scanner;
public class Matriz {
    /*
     * Crear dos matrices de las dimensiones que indique el usuario y rellenarlas con datos introducidos por teclado.
     * Mostrar los elementos comunes de la primera matriz en la segunda.
     */
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el número de columnas de la primera matriz:");
        int columnas1 = teclado.nextInt();
        System.out.println("Introduce el número de filas de la primera matriz:");
        int filas1 = teclado.nextInt();
        System.out.println("Introduce el número de columnas de la segunda matriz:");
        int columnas2 = teclado.nextInt();
        System.out.println("Introduce el número de filas de la segunda matriz:");
        int filas2 = teclado.nextInt();

        int[][] matriz1 = new int[filas1][columnas1];
        int[][] matriz2 = new int[filas2][columnas2];
        // La otra forma de crear una matriz, solo si sabemos sus valores;
        // int[][] matriz1 = {{1,2,3},{4,5,6}}

        System.out.println("Rellenamos la primera matriz:");
        for (int i = 0; i < filas1; i++){
            for (int j = 0; j < columnas1; j++){
                System.out.println("Introduce el elemento de la posición [" + i + "][" + j + "]: ");
                matriz1[i][j] = teclado.nextInt();
            }
        }

        System.out.println("Rellenamos la segunda matriz:");
        for (int i = 0; i < filas2; i++){
            for (int j = 0; j < columnas2; j++){
                System.out.println("Introduce el elemento de la posición [" + i + "][" + j + "]: ");
                matriz2[i][j] = teclado.nextInt();
            }
        }
        teclado.close();

        System.out.println("Comprobamos que elementos de la primera matriz aparecen en la segunda: ");
        /*
         * [][][]      [][]   
         * [][][]      [][]
         */
        for (int i = 0; i < filas1; i++){
            for (int j = 0; j < columnas1; j++){
                for (int k = 0; k < filas2; k++){
                    for (int n = 0; n < columnas2; n++){
                        if (matriz1[i][j] == matriz2[k][n]){
                            System.out.println("El elemento " + matriz1[i][j] + ", aparece en las dos matrices");
                        }
                    }
                }
            }
        }
        
    }
}
