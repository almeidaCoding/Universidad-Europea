package corteislandes;
import java.util.Random;

//Clase TarjetaRegalo con sus métodos y constructor
public class TarjetaRegalo {

    private double saldo;
    private int numeroAleatorio;
    private int numCard;
    private static int numCardAsignado = 1;

    //Constructor
    public TarjetaRegalo(double saldo){
        this.saldo = saldo;
        numeroAleatorio = getNumAleatorio();
        numCard = numCardAsignado;
        numCardAsignado++;
    }
    public int getNumAleatorio(){
        Random random = new Random();
        numeroAleatorio = random.nextInt(90000) + 10000;
        return numeroAleatorio;
    }
    //método getter
    public String devuelveDatosTarjeta(){
        return "El número de su Tarjeta " + numCard +  " es el siguiente: " + numeroAleatorio + "\n" + "y su saldo actual es: " + saldo + "\n";
    }
    //método setter
    public void gastosTarjeta(double gastos){
        double gastado = saldo -= gastos;

        if(gastos > saldo){
            System.out.println("No tienes saldo suficiente para realizar la compra");
            
        }else{
            System.out.println("Su compra ha sido realizada");
        }

        System.out.println("Su saldo actual es: " + gastado + "\n");
    }   
    //método getter
    public double obtenerSaldo(){
        return saldo;
    }
    //método getter
    public double setNuevoSaldo(int newSaldo){
        return saldo = newSaldo;
    }
}