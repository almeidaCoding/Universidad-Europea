package poo;

public class MovimientosBnacarios {
    public static void main(String[] args) {
        Movimientos m1 = new Movimientos();

        m1.cantidad = 1200;
        m1.concepto = "Nomina";
        m1.idMovimiento++;
        m1.saldoCuenta += m1.cantidad;

        Movimientos m2 = new Movimientos();

        m2.cantidad = -80;
        m2.concepto = "Factura telefonía";
        m2.idMovimiento++;
        m2.saldoCuenta += m2.cantidad;

        Movimientos m3 = new Movimientos();

        m3.cantidad = -150;
        m3.concepto = "Factura de la luz";
        m3.idMovimiento++;
        m3.saldoCuenta += m3.cantidad;

        System.out.println("Saldo: " + Movimientos.saldoCuenta);

    }
}
