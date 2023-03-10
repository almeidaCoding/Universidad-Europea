package corteislandes;
import java.util.Random;

// La empresa El Corte Islandés nos ha encargado una aplicación para gestionar las tarjetas regalo. Como primer paso para implementar la aplicación, es necesario crear la clase principal. Implementa la clase TarjetaRegalo. Cuando se crea una nueva tarjeta, se le da un saldo y se asigna de forma automática un número de 5 dígitos. Si se intenta gastar más dinero del que tiene la tarjeta, se debe mostrar un mensaje de error. Dos tarjetas regalo se pueden fusionar creando una nueva tarjeta con la suma del saldo que tenga cada una y un nuevo número aleatorio de 5 cifras. Al fusionar dos tarjetas en una, las dos tarjetas originales se quedarían con 0 € de saldo.

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

    //método getter
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
