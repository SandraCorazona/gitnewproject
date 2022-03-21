package poo;
import java.util.*;

public class Uso_Empleado {

	public static void main(String[] args) {
		
		Jefatura jefe_RRHH=new Jefatura("Juan", 55000, 2006, 9, 25);
		jefe_RRHH.establece_Incentivo(2570);
		
		Empleado[] misEmpleados=new Empleado [6]; 
		
		misEmpleados[0]=new Empleado("Sandra", 34000, 2019, 05, 17);
		misEmpleados[1]=new Empleado("Elián", 36000, 2020, 02, 14);
		misEmpleados[2]=new Empleado("Brandon", 40000, 2018, 01, 07);
		misEmpleados[3]=new Empleado("Luis", 45000, 2009, 11, 9);
		misEmpleados[4]=jefe_RRHH; //Polimorfismo. principio de sustitucion
		misEmpleados[5]=new Jefatura("Ana", 50000, 2020, 05, 10); //Polimorfismo
		Jefatura jefa_Finanzas=(Jefatura) misEmpleados[5];
		
		jefa_Finanzas.establece_Incentivo(2000);
		
		System.out.println(jefa_Finanzas.tomar_decisiones("Dar mas dias de vacaciones"));
		
		System.out.println("El jefe " + jefa_Finanzas.dame_nombre()+ " tiene un bonus de: "
			 + jefa_Finanzas.establece_bonus(500));
		
		System.out.println(misEmpleados[3].dame_nombre()+" tiene un bonus " +
		misEmpleados[3].establece_bonus(200));
		
		for (Empleado e: misEmpleados) {
			
			e.Sube_Sueldo(5);
		}
		
		Arrays.sort(misEmpleados); //ordena de menor a mayor
		
		for (Empleado e: misEmpleados) {
			
			System.out.println("Nombre: " + e.dame_nombre() + " ID: "+ e.dame_Id() + " Sueldo: " + 
			e.dame_sueldo() + " Fecha Alta: " + e.dame_Alta_Contrato());
		}
	}
}

class Empleado implements Comparable, Trabajadores { //para usar el metodo sort
	
    private String Nombre;
	private double Sueldo;
	private Date Alta_Contrato;
	private static int IdSiguiente;
	private int Id;
	
	public Empleado(String nombre, double sueldo, int anno, int mes, int dia){ //CONSTRUCTOR
		
		Nombre=nombre;
		Sueldo=sueldo;
		GregorianCalendar calendario=new GregorianCalendar(anno, mes-1, dia);
		Alta_Contrato=calendario.getTime();
		++IdSiguiente;
		Id=IdSiguiente;
			
	}
	
	public double establece_bonus(double gratificacion) {
		
		return Trabajadores.bonus_base+gratificacion;
	}
	
	public Empleado(String nom) { //2DO CONSTRUCTOR
		this(nom, 30000, 2000, 01, 01);		
	}
	
	public String dame_nombre() { //getter
		return Nombre;
	}
	
	public double dame_sueldo() { //getter
		return Sueldo;
	}
	
	public Date dame_Alta_Contrato() { //getter
		return Alta_Contrato;
	}
	
	public int dame_Id() {
		return Id;
	}
	
	public void Sube_Sueldo(double porcentaje) { //setter
		
		double aumento=Sueldo*porcentaje/100;
		Sueldo+=aumento;
	}
	
	public int compareTo(Object miObjeto) { //para usar el metodo sort
		
		Empleado otroEmpleado=(Empleado) miObjeto;
		
		if(this.Sueldo<otroEmpleado.Sueldo) {
			
			return -1;
		}
		if(this.Sueldo>otroEmpleado.Sueldo) {
			
			return 1;
		}
		
		return 0;
	}
}

class Jefatura extends Empleado implements Jefe {
	
	private double incentivo;
	
	public Jefatura(String nom, double sue, int anno, int mes, int dia) {
		
		super(nom, sue, anno, mes, dia); 
	}
	
	public String tomar_decisiones(String decisiones) {
		
		return "Un miembro de la dirección ha tomado la decisión de: " + decisiones;
	}
	
	public double establece_bonus(double gratificacion) {
		
		double prima=2000;
		return Trabajadores.bonus_base+gratificacion+prima;
	}
	
	public void establece_Incentivo(double b) {
		
		incentivo=b;
	}
	
	public double dame_sueldo() { //metodo clase Empleado dame_sueldo
		
		double sueldoJefe=super.dame_sueldo();// llama el metodo de la clase empleado
		
		return sueldoJefe+ incentivo;
	}
	
}

