package poo;

public class Empleadoss {

	public static void main(String[] args) {
				
		Empleados trabajador1=new Empleados("Sandra");
		Empleados trabajador2=new Empleados("Elián");
		Empleados trabajador3=new Empleados("Brandon");
		Empleados trabajador4=new Empleados("Luis M.");
		
		trabajador1.cambia_seccion("RRHH");
		
		System.out.println(trabajador1.dame_datos() + "\n" + trabajador2.dame_datos()
		+ "\n" + trabajador3.dame_datos() + "\n" + trabajador4.dame_datos());
		
		System.out.println(Empleados.dame_IdSiguiente());
	}
}

class Empleados {
	
	private final String nombre;
	private String seccion;
	private int Id;
	private static int IdSiguiente=1;
	
	
	public Empleados(String nom) {
		
		nombre=nom;
		seccion="Administración";
		Id=IdSiguiente;
		IdSiguiente++;
	}
	
	public void cambia_seccion(String seccion) { //setter
		
		this.seccion=seccion;
	}
	
	public String dame_datos() { //getter
		
		return "El nombre de empleado es: " + nombre + " y la sección es " + 
		seccion + " y el ID es " + Id;
	}
	
	public static String dame_IdSiguiente() {
		
		return "El IdSiguiente es " + IdSiguiente;
	}
}
