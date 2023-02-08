import java.util.Scanner;
import java.util.Random; 

public class meteorologia {
   public static void main(String[] args) {
    
        Scanner sc = new Scanner (System.in);
        Random numAleatorio = new Random ();
        int [] temperaturas = new int [24];
        int maximas = temperaturas[0];
        int minimas = temperaturas[0];
        int horaMax = temperaturas[0];
        int horaMin = temperaturas[0];
        boolean salir = false;
        boolean tempManual = false;
        boolean tempAuto = false;
        int opciones = 0;
        int suma = 0;
        double media;
        
        

        while(!salir){   

            System.out.println("Bienvenida a la estación meteorológica, escoge una de las siguientes opciones: ");

            System.out.println("1. Rellenar el vector de forma manual");
            System.out.println("2. Rellenar el vector de forma aleatoria");
            System.out.println("3. Mostrar datos");
            System.out.println("4. Obtener máximos y mínimos");
            System.out.println("5. Temperatura media");
            System.out.println("6. Salir");
            opciones = sc.nextInt();

           switch(opciones){
            case 1:
                for(int i = 0; i < 24; i++){
                    System.out.println("Introduce los valores de las temperaturas del día");
                    temperaturas[i] = sc.nextInt();
                }
                tempManual = true;
                break;
            case 2:
                for(int i = 0; i < 24; i++){
                    temperaturas[i] = 0 + numAleatorio.nextInt(40);
                }
                tempAuto = true;
                break;
            case 3:
                if(tempManual || tempAuto){
                    for(int i = 0; i < temperaturas.length; i++){
                        System.out.println("las temperaturas del día son: " + temperaturas[i] + " º celsius"); 
                    }
                }else{
                    System.out.println("Por favor, selecciona la opción 1 o 2");
                }
                break;
            case 4:
                for(int i = 0; i < temperaturas.length; i++){
                    if(maximas < temperaturas[i]){
                        maximas = temperaturas[i];
                        horaMax = i;
                    }
                    if(minimas > temperaturas[i]){
                        minimas = temperaturas[i];
                        horaMin = i;
                    }
                }
                if(tempManual || tempAuto){
                    System.out.println("La temperatura máxima del día es: " + maximas + " grados a las " + horaMax + ":00h");
                    System.out.println("La temperatura máxima del día es: " + minimas + " grados a las " + horaMin + ":00h");
                }else{
                    System.out.println("Por favor, selecciona la opción 1 o 2");
                }
                break;
            case 5:
                if(tempManual || tempAuto){
                    for (int i = 0; i < temperaturas.length; i++){
                        suma += temperaturas[i];
                    }
                    media = suma / temperaturas.length;
                    System.out.println("La temperatura media del día es: " + media);
                }else{
                    System.out.println("Por favor, selecciona la opción 1 o 2");
                }
                break;
            case 6:
                System.out.println("Hasta luego :)");
                salir = true;
                break;
           }
        }
        sc.close();
   } 
}