import java.util.Scanner;

public class matriz4x4{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        int [][] matriz = new int [4][4];
        int options = 0;
        boolean salir = false;
        boolean matrizFill = false;

        while(!salir){
            System.out.println("1. Rellenar toda la matriz de números");
            System.out.println("2. Suma de una fila que se pedirá al usuario");
            System.out.println("3. Suma de una columna que se pedirá al usuario");
            System.out.println("4. Sumar la diagonal principal de la matriz");
            System.out.println("5. Sumar la diagonal inversa de la matriz");
            System.out.println("6. La media de todos los valores de la matriz");
            System.out.println("7. Salir");
            options = sc.nextInt();

            switch(options){
                case 1:
                    for(int fila = 0; fila < matriz.length; fila++){
                        for(int columna = 0; columna < matriz[fila].length; columna++){
                            System.out.println("Introduzca el contenido de la posición [" + fila + "," + columna + "]:");
                            matriz[fila][columna] = sc.nextInt();
                        }
                    }
                    matrizFill = true;
                    break;
                case 2:
                    if(matrizFill){
                        System.out.println("Escoge una fila para sumarla: ");
                        int fila = sc.nextInt();
                        int sumaFil = 0;
                        if(fila <= 3){
                            for(int columna = 0; columna < matriz.length; columna++){
                                sumaFil += matriz[fila][columna];
                            }
                            System.out.println("la suma de la fila " + fila + " es: " + sumaFil);
                        }else{
                            System.out.println("La fila escogida no existe, escoge otra: ");
                        }
                    }else{
                        System.out.println("Por favor, selecciona la primera opción para rellenar la matriz");
                    }
                    break;
                case 3:
                    if(matrizFill){
                        System.out.println("Escoge una columna para sumarla: ");
                        int columna = sc.nextInt();
                        int sumaCol = 0;
                        if(columna <= 3){
                            for(int fila = 0; fila < matriz.length; fila++){
                                sumaCol += matriz[fila][columna];
                            }
                            System.out.println("la suma de la columna " + columna + " es: " + sumaCol);
                        }else{
                            System.out.println("La columna escogida no existe, escoge otra: ");
                        }
                    }else{
                        System.out.println("Por favor, selecciona la primera opción para rellenar la matriz");
                    }
                break;
                case 4:
                    if(matrizFill){
                        int sumaDiagoPrinci = 0;
                        for (int fila = 0, columna = 0; fila < matriz.length; fila++, columna++) {
                            sumaDiagoPrinci += matriz[fila][columna];
                        }
                        System.out.println("La suma de la diagonal principal es: " + sumaDiagoPrinci);
                    }else{
                        System.out.println("Por favor, selecciona la primera opción para rellenar la matriz");
                    }
                break;
                case 5:
                    if(matrizFill){
                        int sumaDiagoInversa = 0;
                        for (int fila = 0, columna = 3; fila < matriz.length; fila++, columna--) {
                            sumaDiagoInversa += matriz[fila][columna];
                        }
                        System.out.println("La suma de la diagonal inversa es: " + sumaDiagoInversa);
                    }else{
                        System.out.println("Por favor, selecciona la primera opción para rellenar la matriz");
                    }
                break;
                case 6:
                    if(matrizFill){
                        double sumaMedia = 0;
                        double media = 0;
                        for (int fila = 0; fila < matriz.length; fila++) {
                            for(int columna = 0; columna < matriz.length; columna++){
                                sumaMedia += matriz[fila][columna];
                            }
                            media = sumaMedia / (matriz.length * matriz.length);
                        }
                        System.out.println("La media de los valores de la matriz es " + media);
                    }else{
                        System.out.println("Por favor, selecciona la primera opción para rellenar la matriz");
                    }
                break;
                case 7:
                    System.out.println("Hasta pronto :)");
                    salir = true;
                break;
            }
        }
        sc.close();
    }
}
