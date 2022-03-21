package poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_Persona {

	public static void main(String[] args) {
		
		Persona[] lasPersonas=new Persona[2];
		
		lasPersonas[0]=new Empleado2("Javier", 50000, 2009, 02, 25);
		lasPersonas[1]=new Alumno("Ana", "Ciencias");
		
		for(Persona p: lasPersonas) {
			
			System.out.println(p.dame_Nombre() + ", " + p.dame_Descripcion());
		}
	}
}

class Empleado2 extends Persona {
	
    private double Sueldo;
	private Date Alta_Contrato;
	private static int IdSiguiente;
	private int Id;
	
	public Empleado2(String nom, double sueldo, int anno, int mes, int dia){ //CONSTRUCTOR
		
		super(nom);
		Sueldo=sueldo;
		GregorianCalendar calendario=new GregorianCalendar(anno, mes-1, dia);
		Alta_Contrato=calendario.getTime();
		++IdSiguiente;
		Id=IdSiguiente;
			
	}
	
	public double dame_sueldo() { //getter
		return Sueldo;
	}
	
	public Date dame_Alta_Contrato() { //getter
		return Alta_Contrato;
	}
	
	public void Sube_Sueldo(double porcentaje) { //setter
		
		double aumento=Sueldo*porcentaje/100;
		Sueldo+=aumento;
	}
	
	public String dame_Descripcion() {
		
		return "Este empleado tiene un Id= " + Id + " con un sueldo= " + Sueldo; 
	}
}

abstract class Persona {
	
	private String Nombre;
	
	public Persona(String nom) {
		Nombre=nom;
	}
	
	public String dame_Nombre() {
		return Nombre;
	}
	
	public abstract String dame_Descripcion();
}

class Alumno extends Persona {
	
	private String Carrera;
	
	public Alumno(String nom, String car) {
		
		super(nom);
		Carrera=car;
	}
	
	public String dame_Descripcion() {
		
		return "Este alumno está estudiando la carrera de " + Carrera;
	}
	
}