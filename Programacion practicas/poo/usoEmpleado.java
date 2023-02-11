package poo;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.*;

public class usoEmpleado {
    public static void main(String[] args) {

        // Empleado empleado1 = new Empleado("Beatriz", 30000, 2020, 03, 20);
        // Empleado empleado2 = new Empleado("Rosanna", 30000, 2010, 07, 15);
        // Empleado empleado3 = new Empleado("Mirella", 40000, 2005, 10, 05);

        // empleado1.aumentaSueldo(10);
        // empleado2.aumentaSueldo(12);
        // empleado3.aumentaSueldo(5);

        // JOptionPane.showMessageDialog(null, "Nombre: " + empleado1.dameNombre() + " Sueldo: " + empleado1.dimeSueldo() + " Fecha de alta: " + empleado1.fechAlta());
        // JOptionPane.showMessageDialog(null, "Nombre: " + empleado2.dameNombre() + " Sueldo: " + empleado2.dimeSueldo() + " Fecha de alta: " + empleado2.fechAlta());
        // JOptionPane.showMessageDialog(null, "Nombre: " + empleado3.dameNombre() + " Sueldo: " + empleado3.dimeSueldo() + " Fecha de alta: " + empleado3.fechAlta());

        // for(int i = 0; i < misEmpleados.length; i++){
        //     misEmpleados[i].aumentaSueldo(15);
        // }

        // for(int i = 0; i < misEmpleados.length; i++){
        //     JOptionPane.showMessageDialog(null, "Nombre: " + misEmpleados[i].dameNombre() + " Sueldo: " + misEmpleados[i].dimeSueldo() + " Fecha de alta: " + misEmpleados[i].fechAlta());
        // }


        Empleado [] misEmpleados = new Empleado[3];
        
        misEmpleados[0] = new Empleado("Beatriz Guillermo", 30000, 2020, 03, 20);
        misEmpleados[1] = new Empleado("Rosanna Palmucci", 30000, 2010, 07, 15);
        misEmpleados[2] = new Empleado("Mirella", 40000, 2005, 10, 05);

        for(Empleado e: misEmpleados){
            e.aumentaSueldo(15);
        }
        for(Empleado e: misEmpleados){
            JOptionPane.showMessageDialog(null, "Nombre: " + e.dameNombre() + " Sueldo: " + e.dimeSueldo() + " Fecha de alta: " + e.fechAlta());
        }

    }
}

 //class Empleado sin el modificador de acceso ''public'' -> no se debe colocar ya que vamos a crea todas las clases en un mismo fichero.
class Empleado{

    private String nombre;
    private double sueldo;
    private Date altaContrato;
    
    //Constructor con parámetros
    public Empleado(String nom, double sue, int agno, int mes, int dia){
        nombre = nom;
        sueldo = sue;
        GregorianCalendar calendario = new GregorianCalendar(agno, mes-1, dia);
        altaContrato = calendario.getTime();
    }

    //Método getter
    public String dameNombre(){
        return nombre;
    }
    //Método getter
    public double dimeSueldo(){
        return sueldo;
    }
    //Método getter
    public Date fechAlta(){
        return altaContrato;
    }

    //Método setter
    public void aumentaSueldo(double porcentaje){
        double aumento = sueldo * porcentaje / 100;
        sueldo += aumento;
    }
}
