package poo;
import java.util.Date;
import java.util.GregorianCalendar;
// import javax.swing.*;

public class usoEmpleados {
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

        
        Jefatura jefeAdministracion = new Jefatura("Luan", 55000, 2002, 5, 20);
        jefeAdministracion.setEstableceIncentivo(2570);


        Empleado [] misEmpleados = new Empleado[6];
        
        misEmpleados[0] = new Empleado("Beatriz Guillermo", 30000, 2020, 03, 20);
        misEmpleados[1] = new Empleado("Rosanna Palmucci", 30000, 2010, 07, 15);
        misEmpleados[2] = new Empleado("Mirella", 40000, 2005, 10, 05); // llama al constrcutor que tiene 5 parámetros.
        misEmpleados[3] = new Empleado("Luciano"); // llama al constrcutor que tiene 2 parámetros.
        misEmpleados[4] = jefeAdministracion; //Polimorfismo
        misEmpleados[5] = new Jefatura("Maria", 80000, 2000, 9, 20);

        for(Empleado e: misEmpleados){
            e.aumentaSueldo(5);
        }
        for(Empleado e: misEmpleados){
            System.out.println("Nombre: \n" + e.dameNombre() + "\nSueldo: \n" + e.dimeSueldo() + "\nFecha de alta: \n" + e.fechAlta() + "\n");
        }

    }
}

//class Empleado sin el modificador de acceso ''public'' -> no se debe colocar ya que vamos a crea todas las clases en un mismo fichero.
class Empleado{

    private String nombre;
    private double sueldo;
    private Date altaContrato;
    
    //Primer constructor con parámetros
    public Empleado(String nom, double sue, int agno, int mes, int dia){
        nombre = nom;
        sueldo = sue;
        GregorianCalendar calendario = new GregorianCalendar(agno, mes-1, dia);
        altaContrato = calendario.getTime();
    }

    //Segundo constrcutor con parámetros
    public Empleado(String nom){
        this(nom, 30000, 2000, 01, 02); // llamada al constructor de 5 parámetros.
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

//Clase que hereda de empleado
class Jefatura extends Empleado{

    private double incentivo;

    //Constructor con parámetros
    public Jefatura(String nom, double sue, int agno, int mes, int dia){
        super(nom, sue, agno, mes, dia);
    }

    //Método setter
    public void setEstableceIncentivo(double b){
        incentivo = b;
    }
    
    //Método getter
    public double dimeSueldo(){ // este método sobrescribe al de la clase padre.
        double sueldoJefe = super.dimeSueldo();
        return sueldoJefe + incentivo;
    }

}