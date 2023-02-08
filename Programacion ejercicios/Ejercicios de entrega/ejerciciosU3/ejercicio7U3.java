import java.util.Scanner;

public class ejercicio7U3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Introduce un número: ");
        int numeroUsuario = sc.nextInt();
        cambioNum(numeroUsuario);
        
        sc.close();
    }

    public static int cambioNum(int numUser){
        switch(numUser % 5){
            case 0:
                System.out.println("A");
                break;
            case 1:
                System.out.println("B");
                break;
            case 2:
                System.out.println("C");
                break;
            case 3:
                System.out.println("D");
                break;
            case 4:
                System.out.println("E");
                break;
            default:
                System.out.println("F");
        }
        return numUser;
    }
}