import java.util.*;

public class Uso_Talla {
	
	enum Talla{
		
		MINI("S"), MEDIANO("M"), GRANDE("L"), MUY_GRANDE("XL");
				
		private Talla(String abreviatura) {
			
			this.abreviatura=abreviatura;
		}
		
		public String dame_Abreviatura() {
			
			return abreviatura;
		}
		private String abreviatura;
		
	}

	public static void main(String[] args) {
		
	Scanner entrada=new Scanner(System.in);
	
	System.out.println("Escribe una talla: Pequeña, Mediano, Grande, Muy Grande");
	
	String entrada_datos=entrada.next().toUpperCase();
	
	Talla la_talla=Enum.valueOf(Talla.class, entrada_datos);
	
	System.out.println("Talla= "+ la_talla);
	
	System.out.println("Abreviatura " + la_talla.dame_Abreviatura());
	
		
		

	}

}
