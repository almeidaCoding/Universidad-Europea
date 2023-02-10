public class Cuenta {
    /*
     * Crea una clase llamada Cuenta que tendrá los siguientes atributos: 
     *      Titular
     *      Cantidad
     * Crea un constructor por defecto que inicialice ambos atributos y otro que asigne ambos valores.
     * Crea los siguientes métodos:
     *      ingresar(double cantidad): se ingresa una cantidad a la cuenta, si la cantidad introducida es negativa, no se hará nada.
     *      retirar(double cantidad): se retira una cantidad a la cuenta, si restando la cantidad actual a la que nos pasan es negativa, 
     *                                la cantidad de la cuenta pasa a ser 0.
     */

    // Atributos:
    String titular;
    double cantidad;

    public Cuenta(){
        this.titular = "";
        this.cantidad = 0;
    }

    public Cuenta(String titular, double cantidad){
        this.titular = titular;
        this.cantidad = cantidad;
    }

    // Métodos:
    public void ingresar(double cantidad){
        if (cantidad > 0){
            this.cantidad+=cantidad;
        }
    }

    public void retirar(double cantidad){
        if ((this.cantidad - cantidad) < 0){
            System.out.println("El saldo actual es menor que la cantidad que desea retirar.");
            this.cantidad = 0;
        } else{
            this.cantidad-=cantidad;
        }
    }

    public double getSaldo(){
        return this.cantidad;
    }

    public static void main (String[] args){
        Cuenta cuenta1 = new Cuenta();
        Cuenta cuenta2 = new Cuenta("Irene", 300);

        cuenta1.ingresar(200);

        System.out.println("Saldo en la cuenta1: " + cuenta1.getSaldo());

        cuenta1.retirar(400);
        cuenta2.retirar(200);

        System.out.println("Saldo en la cuenta1: " + cuenta1.getSaldo());
        System.out.println("Saldo en la cuenta3: " + cuenta2.getSaldo());
    }
}
