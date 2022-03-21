package poo;

import javax.swing.JOptionPane;

public class Uso_vehiculo {

	public static void main(String[] args) {
	
		Coche renault= new Coche();  //Instanciar una clase
		
		renault.establece_color(JOptionPane.showInputDialog("Introduce color"));
		 
		System.out.println(renault.dime_color());
		
		System.out.println(renault.dime_datos_generales());
		
		renault.configura_asientos(JOptionPane.showInputDialog("¿Tiene asientos de cuero?"));
		
		System.out.println(renault.dime_asientos());
		
        renault.configura_climatizador(JOptionPane.showInputDialog("¿Tiene climatizador?"));
		
		System.out.println(renault.dime_climatizador());
		
		System.out.println(renault.dime_peso_coche());
		
        System.out.println("El coche tiene un precio final de " + renault.precio_coche());
				
	}

}
