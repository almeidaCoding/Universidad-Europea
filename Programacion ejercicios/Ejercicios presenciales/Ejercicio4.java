import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        System.out.println("Jugador 1 introduzca piedra, papel o tijera: ");
        String user1=teclado.nextLine();
        System.out.println("Jugador 2 introduzca piedra,papel o tijera: ");
        String user2=teclado.nextLine();

        playGame(user1, user2);
        
        teclado.close();
    }

    public static void playGame(String usuario1, String usuario2){
        String resultado1 = "Jugador 1";
        String resultado2 = "Jugador 2";

        if(usuario1.equals(usuario2)){
            System.out.println("empate"); 
        }else if(usuario1.equals("tijera")){
            if(usuario2.equals("papel")){
                System.out.println("Ha ganado el " + resultado1);
            }else if(usuario2.equals("piedra")){
                System.out.println("Ha ganado " + resultado2);
            }
        }else if(usuario1.equals("papel")){
            if(usuario2.equals("tijera")){
                System.out.println("Ha ganado el " + resultado2);
            }else if(usuario2.equals("piedra")){
                System.out.println("Ha ganado el " + resultado1);
            }
        }else if(usuario1.equals("piedra")){
            if(usuario2.equals("tijera")){
                System.out.println("Ha ganado el " + resultado1);
            }else if(usuario2.equals("papel")){
                System.out.println("Ha ganado el " + resultado2);
            }
        }
    }
}
