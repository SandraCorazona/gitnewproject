package poo;

public class Uso_Furgoneta {

	public static void main(String[] args) {
		
	  Coche micoche1=new Coche();
	  
	  micoche1.establece_color("Rojo");
	  
	  Furgoneta mifurgo1=new Furgoneta(7, 580);
	  mifurgo1.establece_color("azul");
	  mifurgo1.configura_asientos("Si");
	  mifurgo1.configura_climatizador("Si");
	  
	  System.out.println(micoche1.dime_datos_generales() 
			  + " " + micoche1.dime_color());
	  
	  System.out.println(mifurgo1.dime_datos_generales() 
			  + " " + mifurgo1.dime_DatosFurgoneta());
	  
 }

}
