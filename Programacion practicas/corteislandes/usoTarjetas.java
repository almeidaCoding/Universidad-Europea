package corteislandes;

public class usoTarjetas {
    public static void main(String[] args) {

        //instancia de tarjetas
        TarjetaRegalo tarjetaPremium = new TarjetaRegalo(200);
        TarjetaRegalo tarjetaDiamond = new TarjetaRegalo(400);

        //devuelve datos de las tarjetas
        System.out.println(tarjetaPremium.devuelveDatosTarjeta());
        System.out.println(tarjetaDiamond.devuelveDatosTarjeta());

        //gastos que se le atribuyen a las tarjetas
        tarjetaPremium.gastosTarjeta(50);
        tarjetaDiamond.gastosTarjeta(50);

        //fusión de las tarjetas
        double saldoTotal = tarjetaPremium.obtenerSaldo() + tarjetaDiamond.obtenerSaldo();
        TarjetaRegalo tarjetaFusionada = new TarjetaRegalo(saldoTotal);
        System.out.println(tarjetaFusionada.devuelveDatosTarjeta());

        //fusión nuevamente de las tarjetas para no repetir 2 veces el System.out.println
        double sinSaldo = tarjetaDiamond.setNuevoSaldo(0) + tarjetaPremium.setNuevoSaldo(0);
        TarjetaRegalo TarjetasSinSaldo = new TarjetaRegalo(sinSaldo);
        System.out.println("Has fusionado tus tarjetas creando una nueva. El saldo de estas tarjetas ha quedado en: " + TarjetasSinSaldo.setNuevoSaldo(0));
    }
}
